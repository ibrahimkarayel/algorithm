package com.pironix.hackerrank.matrix;

import java.util.Scanner;

/**
 * Created by ikarayel on 2/8/2017.
 */
public class Rotate {

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
        int[][] rotate = rotateMatrixAntiClock(original.getMatrixData(), original.getColumns());
        System.out.println("Rotated 90 degree anti clock Matrix");
        original.printMatrix(rotate);

        int[][] rotateClock = rotateMatrixClock(original.getMatrixData(), original.getColumns());
        System.out.println("Rotated 90 degree clock  Matrix");
        original.printMatrix(rotateClock);
    }

    public static int[][] rotateMatrixAntiClock(int mat[][], int N) {
        // Consider all squares one by one
        for (int x = 0; x < N / 2; x++) {
            // Consider elements in group of 4 in
            // current square
            for (int y = x; y < N - x - 1; y++) {
                // store current cell in temp variable
                int temp = mat[x][y];

                // move values from right to top
                mat[x][y] = mat[y][N - 1 - x];

                // move values from bottom to right
                mat[y][N - 1 - x] = mat[N - 1 - x][N - 1 - y];

                // move values from left to bottom
                mat[N - 1 - x][N - 1 - y] = mat[N - 1 - y][x];

                // assign temp to left
                mat[N - 1 - y][x] = temp;
            }
        }
        return mat;
    }

    public static int[][] rotateMatrixClock(int mat[][], int N) {
        // Consider all squares one by one
        for (int x = 0; x < N / 2; x++) {
            // Consider elements in group of 4 in
            // current square
            for (int y = x; y < N - x - 1; y++) {
                // store current cell in temp variable
                int temp = mat[x][y];

                // move values from right to top
                mat[x][y] = mat[y][N - 1 - x];

                // move values from bottom to right
                mat[y][N - 1 - x] = mat[N - 1 - x][N - 1 - y];

                // move values from left to bottom
                mat[N - 1 - x][N - 1 - y] = mat[N - 1 - y][x];

                // assign temp to left
                mat[N - 1 - y][x] = temp;
            }
        }
        return mat;
    }
}
