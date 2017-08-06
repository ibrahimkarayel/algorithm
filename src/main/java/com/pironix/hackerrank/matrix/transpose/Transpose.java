package com.pironix.hackerrank.matrix.transpose;

import com.pironix.hackerrank.matrix.Matrix;

import java.util.Scanner;

/**
 * The Transpose Matrix Solution class
 * <p>
 * Created  on 11/16/2016.
 * </p>
 *
 * @author ibrahim KARAYEL
 * @version 1.0
 */
public class Transpose {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please Enter number of rows: ");
        int row = scanner.nextInt();
        System.out.print("Please Enter number of columns: ");
        int column = scanner.nextInt();

        Matrix original = new Matrix(row, column);
        System.out.println("Please Enter Matrix Elements");
        original.fillMatrix(scanner);
        System.out.println("Original Matrix");
        original.printMatrix();
        int[][] transposed = original.transposeMatrix();
        System.out.println("Transposed Matrix");
        original.printMatrix(transposed);
    }
}
