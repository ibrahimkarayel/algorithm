package com.pironix.hackerrank.exceptionhandling;

import java.util.Scanner;

/**
 * The Exception Handling MyCalculator Solution class
 *
 * @author ibrahim KARAYEL
 * @version 1.0
 * @sice 9/10/2016
 */
public class MyCalculator {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNextInt()) {
            int n = in.nextInt();
            int p = in.nextInt();
            MyCalculator my_calculator = new MyCalculator();
            try {
                System.out.println(power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public static String power(int x, int y) {
        try {
            if (x < 0 || y < 0)
                throw new Exception("n and p should be non-negative");
            else
                return (int) Math.pow(x, y) + "";
        } catch (Exception e) {
            return e.toString();
        }


    }

}
