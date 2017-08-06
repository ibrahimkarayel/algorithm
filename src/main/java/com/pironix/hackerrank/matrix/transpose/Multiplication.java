package com.pironix.hackerrank.matrix.transpose;

import com.pironix.hackerrank.matrix.Matrix;

import java.util.Scanner;

/**
 * The Multiplication Matrix Solution class
 * <p>
 * Created  on 11/17/2016.
 * </p>
 *
 * @author ibrahim KARAYEL
 * @version 1.0
 */
public class Multiplication {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please Enter number of rows for 1st Matrix: ");
        int row = scanner.nextInt();
        System.out.print("Please Enter number of columns for 1st Matrix: ");
        int column = scanner.nextInt();

        Matrix original = new Matrix(row, column);
        System.out.println("Please Enter Matrix Elements");
        original.fillMatrix(scanner);
        original.printMatrix();
        System.out.println("*********************************************************");

        int row2;
        do {
            System.out.print("Please Enter number of rows for 2nd Matrix equal to number of columns  1st Matrix: ");
            row2 = scanner.nextInt();

        } while (row2 != column);
        System.out.print("Please Enter number of columns for 2nd Matrix: ");
        int column2 = scanner.nextInt();

        Matrix original2 = new Matrix(row2, column2);

        System.out.println("Please Enter 2nd Matrix Elements");
        original2.fillMatrix(scanner);
        original2.printMatrix();
        System.out.println("result:");
        int[][] result = original.multiplyMatrix(original.getMatrixData(), original2.getMatrixData(), row, column2);
        original.printMatrix(result);

    }
}
