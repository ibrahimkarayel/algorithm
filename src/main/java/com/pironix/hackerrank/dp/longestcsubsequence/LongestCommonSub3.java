package com.pironix.hackerrank.dp.longestcsubsequence;

import java.util.Scanner;

/**
 * Created by ikarayel on 2/19/2017.
 */
public class LongestCommonSub3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter First input");
        String s1 = scanner.next();
        System.out.println("Please Enter Second input");
        String s2 = scanner.next();

        System.out.println("Please Enter Third input");
        String s3 = scanner.next();

        System.out.println(lcs(s1, s2, s3, s1.length(), s2.length(), s3.length()));
        System.out.println("***************************************");
        System.out.println(lcsDP(s1, s2, s3, s1.length(), s2.length(), s3.length()));

    }

    public static int lcsDP(String s1, String s2, String s3, int m, int n, int p) {

        int[][][] cache = new int[m + 1][n + 1][p + 1];

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                for (int k = 0; k <= p; k++) {

                    if (i == 0 || j == 0 || k == 0) {
                        cache[i][j][k] = 0;
                    } else if (s1.charAt(i - 1) == s2.charAt(j - 1) && s1.charAt(i - 1) == s3.charAt(k - 1)) {
                        cache[i][j][k] = cache[i - 1][j - 1][k - 1] + 1;
                    } else {
                        cache[i][j][k] = Math.max(Math.max(cache[i - 1][j][k], cache[i][j - 1][k]), cache[i][j][k - 1]);
                    }
                }


            }
        }
      /*  for (int i = 0; i < cache.length; i++) {
            for (int j = 0; j <cache[i].length ; j++) {
                System.out.print(cache[i][j]);

            }
        }*/
        return cache[m][n][p];
    }

    public static int lcs(String s1, String s2, String s3, int i, int j, int k) {
        if (i == 0 || j == 0 || k == 0)
            return 0;
        if (s1.charAt(i - 1) == s2.charAt(j - 1) && s2.charAt(j - 1) == s3.charAt(k - 1))
            return 1 + lcs(s1, s2, s3, i - 1, j - 1, k - 1);
        else
            return Math.max(Math.max(lcs(s1, s2, s3, i - 1, j, k), lcs(s1, s2, s3, i, j - 1, k)), lcs(s1, s2, s3, i, j, k - 1));
    }
}
