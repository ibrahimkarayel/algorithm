package com.pironix.hackerrank.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * The Exception Handling Solution class
 *
 * @author ibrahim KARAYEL
 * @version 1.0
 * @sice 9/10/2016
 */
public class ExHandlingSolution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y;
        try {
            x = scanner.nextInt();
            y = scanner.nextInt();
            System.out.println(x / y);
        } catch (InputMismatchException e) {
            System.out.println("java.util.InputMismatchException");
        } catch (ArithmeticException e) {
            System.out.println("java.lang.ArithmeticException: / by zero");
        }
    }

}
