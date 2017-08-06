package com.pironix.bitmanipulation.sumvsxor;

import java.util.Scanner;

/**
 * Created by ikarayel on 3/4/2017.
 *
 * @author ibrahim KARAYEL
 *         Sum vs XOR
 *         Problem Statement
 *         Given an integer, n, find each x such that:
 *         0<=x<=n
 *         n + x = n^x
 *         where \oplus denotes the bitwise XOR operator.
 *         Then print an integer denoting the total number of x‘s satisfying the criteria above.
 *         Input Format
 *         A single integer, n.
 *         Constraints
 *         0 <=n <= 10^15
 *         Output Format
 *         Print the total number of integer x‘s satisfying both of the conditions specified above.
 *         Sample Input  5
 *         Sample Output  2
 */
public class SumvsXOR {


    public static void main(String[] args) {

/*
        for (int i = 0; i <10 ; i++) {
            System.out.println(i&1);
        }*/

        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        int zeros = 0;
        while (n > 0) {
            if ((n & 1) == 0) {
                zeros++;
            }
            n = n >> 1;
        }


        long ans = 1l << zeros;
        System.out.println(ans);
    }
}
