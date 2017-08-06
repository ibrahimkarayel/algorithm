package com.pironix.hackerrank.matrix.countnegative;

import com.pironix.hackerrank.matrix.Matrix;

import java.util.Arrays;
import java.util.Scanner;

/**
 * The CountNegative Matrix Solution class
 * <p>
 * Created  on 11/17/2016.
 * </p>
 *
 * @author ibrahim KARAYEL
 * @version 1.0
 */
public class CountNegative {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please Enter number of rows for 1st Matrix: ");
        int row = scanner.nextInt();
        System.out.print("Please Enter number of columns for 1st Matrix: ");
        int column = scanner.nextInt();

        Matrix matrix = new Matrix(row, column);
        System.out.println("Please Enter Matrix Elements");
        matrix.fillMatrix(scanner);
        matrix.printMatrix();
        System.out.println("*********************************************************");
        System.out.println(countNegativeOptimal(matrix));

    }


    private static int countNegative(Matrix matrix) {
        int count = 0;
        for (int i = 0; i < matrix.getRows(); i++) {
            for (int j = 0; j < matrix.getColumns(); j++) {
                if (matrix.getMatrixData()[i][j] < 0) {
                    count++;
                }
            }
        }
        return count;

    }

    private static int countNegativeOptimal(Matrix matrix) {
        for (int i = 0; i < matrix.getRows(); i++) {
            Arrays.sort(matrix.getMatrixData()[i]);
        }
        int count = 0;

        int i = 0;
        int j = matrix.getColumns() - 1;
        while (j >= 0 && i < matrix.getRows()) {
            if (matrix.getMatrixData()[i][j] < 0) {
                count += (j + 1);
                i++;
            } else {
                j--;
            }
        }
        return count;

    }
}


