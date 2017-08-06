package com.pironix.arrays;

/**
 * Created by ikarayel on 3/5/2017.
 *
 * @author ibrahim KARAYEL
 */
public class CountNegativeMatrix {

    public static void main(String[] args) {
        int[][] matrix1 = new int[][]{
                {-3, -2, -1, -1, 1},
                {-2, -2, 3, 4, 3},
                {-4, 5, 7, 8, 2}
        };

        System.out.println(matrix1.length);
        System.out.println(countNegativeNum(matrix1, 3, 4));
    }

    private static int countNegativeNum(int[][] matrix, int n, int m) {

        int i = 0;
        int j = m - 1;
        int count = 0;

        while (j >= 0 && i < n) {

            if (matrix[i][j] < 0) {
                count += (j + 1);
                i++;
            } else {
                j--;
            }
        }
        return count;
    }
}
