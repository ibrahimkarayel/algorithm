package com.pironix.hackerrank.dp.longestcsubsequence;

import java.util.Scanner;

/**
 * Created by ikarayel on 2/19/2017.
 * Longest Common Subsequence
 */
public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter First input");
        String s1 = scanner.next();
        System.out.println("Please Enter Second input");
        String s2 = scanner.next();
        System.out.println(lcs(s1, s2, s1.length(), s2.length()));
        System.out.println("***************************************");
        System.out.println(lcsDP(s1, s2, s1.length(), s2.length()));

    }

    public static int lcsDP(String s1, String s2, int m, int n) {

        int[][] cache = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {

                if (i == 0 || j == 0) {
                    cache[i][j] = 0;
                } else if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    cache[i][j] = cache[i - 1][j - 1] + 1;
                } else {
                    cache[i][j] = Math.max(cache[i - 1][j], cache[i][j - 1]);
                }
            }
        }
      /*  for (int i = 0; i < cache.length; i++) {
            for (int j = 0; j <cache[i].length ; j++) {
                System.out.print(cache[i][j]);

            }
        }*/
        return cache[m][n];
    }

    public static int lcs(String s1, String s2, int i, int j) {
        if (i == 0 || j == 0)
            return 0;
        if (s1.charAt(i - 1) == s2.charAt(j - 1))
            return 1 + lcs(s1, s2, i - 1, j - 1);
        else
            return Math.max(lcs(s1, s2, i - 1, j), lcs(s1, s2, i, j - 1));
    }
}
