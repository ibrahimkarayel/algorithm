package com.pironix.leetcode.diagnoal;

/**
 * Created by ikarayel on 3/5/2017.
 */
public class DiagnolMatrix {

    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {5, 6, 7}, {9, 10, 11}, {13, 14, 15}};
        print(a);
    }

    public static void print(int[][] a) {

        //print first half
        int row = 0;
        int col;

        while (row < a.length) {
            col = 0;
            int rowTemp = row;
            while (rowTemp >= 0) {
                System.out.print(a[rowTemp][col] + " ");
                rowTemp--;
                col++;
            }
            System.out.println();
            row++;
        }

        //print second half
        col = 1;

        while (col < a.length) {
            int colTemp = col;
            row = a.length - 1;
            while (colTemp <= a.length - 1) {
                System.out.print(a[row][colTemp] + " ");
                row--;
                colTemp++;
            }
            System.out.println();
            col++;
        }

    }

}
