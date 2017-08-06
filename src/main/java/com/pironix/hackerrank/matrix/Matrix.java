package com.pironix.hackerrank.matrix;

import java.util.Scanner;

/**
 * The Matrix class
 * <p>
 * Created  on 11/16/2016.
 * </p>
 *
 * @author ibrahim KARAYEL
 * @version 1.0
 */
public class Matrix {

    private int rows;
    private int columns;
    private int[][] matrixData;

    public Matrix(int row, int column) {
        this.rows = row;
        this.columns = column;
        matrixData = new int[rows][columns];
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public int[][] getMatrixData() {
        return matrixData;
    }

    public void setMatrixData(int[][] matrixData) {
        this.matrixData = matrixData;
    }

    public void fillMatrix(Scanner scanner) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrixData[i][j] = scanner.nextInt();
            }
        }
    }

    public void printMatrix() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrixData[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public void printMatrix(int[][] matrixData) {
        for (int i = 0; i < matrixData.length; i++) {
            for (int j = 0; j < matrixData[i].length; j++) {
                System.out.print(matrixData[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public int[][] transposeMatrix() {
        int[][] tmp = new int[columns][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                tmp[j][i] = matrixData[i][j];
            }
        }
        return tmp;
    }


    public int[][] multiplyMatrix(int[][] matrix1, int[][] matrix2, int rows, int columns) {
        int[][] tmp = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                tmp[i][j] = matrix1[i][j] + matrix2[j][i];
            }
        }
        return tmp;
    }
}
