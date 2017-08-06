package com.pironix.hackerearth;

import java.util.Arrays;
import java.util.Scanner;

/**
 * The MinMaxSum  Solution class
 * Find min dif and max diff given  5 long values
 *
 * @author ibrahim KARAYEL
 * @version 1.0
 *          Created by ibrahim on 1/21/2017.
 */
public class MinMaxSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long[] longList = new long[5];
        for (int i = 0; i < 5; i++) {
            longList[i] = in.nextLong();
        }
        Arrays.sort(longList);
        long sum = 0;
        for (int i = 0; i < longList.length; i++) {
            sum += longList[i];
        }
        System.out.print(sum - longList[longList.length - 1]);
        System.out.print(" ");
        System.out.print(sum - longList[0]);
    }
}
