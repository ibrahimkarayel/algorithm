package com.pironix.hackerrank.staircase;

/**
 * The Stair Case class
 *
 * @author ibrahim KARAYEL
 * @version 1.0
 * @sice 9/10/2016
 */
public class StairCase {
    public static void main(String[] args) {
        stairCase(5);
    }

    public static void stairCase(int n) {
        for (int i = 0; i < n; i++) {

            for (int a = 0; a < n - i - 1; a++)
                System.out.print(" ");

            for (int b = 0; b <= i; b++) {
                System.out.print('#');
            }
            System.out.println();
        }
    }
}
