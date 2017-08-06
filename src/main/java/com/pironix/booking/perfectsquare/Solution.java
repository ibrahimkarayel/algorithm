package com.pironix.booking.perfectsquare;

/**
 * Created by ikarayel on 2/10/2017.
 */

import java.util.Arrays;

/**
 * Given number N, Find the least number of perfect square number sum needed to get N.
 * <p>
 * Example :
 * n=5 (4+1) i.e. 2
 * n=7 (4+1+1+1) i.e. 4
 * n=12 (4+4+4) i.e 3
 * n=20 (16+4) i.e. 2
 */
public class Solution {


    public static void main(String[] args) {
        System.out.println(perfectSquareDP(5));
        System.out.println(perfectSquareDP(7));
        System.out.println(perfectSquareDP(9));
        System.out.println(perfectSquareDP(12));
        System.out.println("****************");

        System.out.println(perfectSquareRecursive(12));

        System.out.println(perfect(12));

        System.out.println("*****************************");

    }

    static int perfect(int n) {

        if (n <= 3)
            return n;
        int result = n;
        for (int i = 1; i <= n; i++) {
            int pow = (int) Math.pow(i, 2);
            if (pow > n) {
                break;
            } else
                result = Math.min(result, 1 + perfect(n - pow));
        }
        return result;
    }

    static int perfectSquareRecursive(int n) {
        // base cases
        if (n <= 3)
            return n;

        // getMinSquares rest of the table using recursive
        // formula
        int res = n; // Maximum squares required is n (1*1 + 1*1 + ..)

        // Go through all smaller numbers
        // to recursively find minimum
        for (int x = 1; x <= n; x++) {
            int temp = x * x;
            if (temp > n)
                break;
            else
                res = Math.min(res, 1 + perfectSquareRecursive(n - temp));
        }
        return res;
    }

    public static int perfectSquareDP(int n) {
        if (n <= 0) {
            return 0;
        }

        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        //to compute least perfect for n we compute top down for each
        //possible value sum from 2 to n
        for (int i = 1; i <= n; i++) {
            //for a particular value i we can break it as sum of a perfect square j*j and
            //all perfect squares from solution of the remainder (i-j*j)

            for (int j = 1; j <= i; j++) {
                int pow = j * j;
                if (pow > i) {
                    break;
                } else {
                    dp[i] = Math.min(dp[i], 1 + dp[i - pow]);
                }
            }

            /*for (int j = 1; j * j <= i; j++) {
                dp[i] = Math.min(dp[i], 1 + dp[i - j * j]);
            }*/
        }

        return dp[n];
    }
}
