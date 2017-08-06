package com.pironix.thoughtworks.draw;

import java.util.Scanner;

/**
 * The DrawPattern Solution class
 *
 * @author ibrahim KARAYEL
 * @version 1.0
 *          1/28/2016
 */
public class DrawPattern {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter pattern length");

        int height = scanner.nextInt();

        pattern(height);
        pattern3(height);

    }


    static void pattern(int height) {
        int count = 1;
        for (int i = 0; i < height / 2; i++) {
            for (int j = 0; j < (height / 2) - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print(count++);
            }
            System.out.println();

        }
        for (int i = 0; i < height; i++) {
            System.out.print(count++);
        }
        System.out.println();
        for (int i = height / 2; i > 0; i--) {
            for (int j = (height / 2) - i + 1; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 - 1; j++) {
                System.out.print(count++);
            }
            System.out.println();
        }
    }


    static void pattern3(int height) {
        for (int i = 0; i < height / 2; i++) {
            for (int j = 0; j < (height / 2) - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
        for (int i = 0; i < height; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = height / 2; i > 0; i--) {
            for (int j = (height / 2) - i + 1; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern1(int n) {
        int cnt = 1;
        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < (Math.abs(n - 1 - i)); j++) System.out.print(" ");
            for (int j = 0; j < 2 * (n - Math.abs(n - 1 - i)) - 1; j++) System.out.print(cnt++);
            System.out.println();

        }
    }

}
