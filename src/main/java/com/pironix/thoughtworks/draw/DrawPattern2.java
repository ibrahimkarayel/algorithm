package com.pironix.thoughtworks.draw;

import java.util.Scanner;

/**
 * The DrawPattern2 Solution class
 *
 * @author ibrahim KARAYEL
 * @version 1.0
 *          1/28/2016
 */
public class DrawPattern2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter pattern length");

        int height = scanner.nextInt();

        pattern(height);


    }


    static void pattern(int n) {

        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                System.out.print(1 + Math.max(Math.abs(n - i - 1), Math.abs(n - j - 1)));
            }
            System.out.println();
        }
    }


}
