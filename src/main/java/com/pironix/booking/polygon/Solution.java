package com.pironix.booking.polygon;

/**
 * Created by ikarayel on 2/11/2017.
 */

/**
 * Identify whether four sides (given by four integers) can form a square, a rectangle, or neither.
 * <p>
 * Input: You will receive an list of strings, each containing four space-separated integers,
 * which represent the length of the sides of a polygon.
 * The input lines will follow the 'A B C D' order as in the following representation:
 * |-----A-----|
 * |           |
 * |           |
 * D           B
 * |           |
 * |           |
 * |-----C-----|
 * <p>
 * Output: A single line which contains 3 space-separated integers; representing the number of squares,
 * number of rectangles, and number of other polygons with 4 sides. Note that squares shouldn't be counted as rectangles.
 * Invalid polygons should also be counted as 'other polygons'.
 * <p>
 * Constraints: The four integers representing the sides will be such that: -2000 <=X <= 2000 (Where X represents the integer)
 * <p>
 * Sample Input:
 * 36 30 36 30
 * 15 15 15 15
 * 46 96 90 100
 * 86 86 86 86
 * 100 200 100 200
 * -100 200 -100 200
 */
public class Solution {

    private static final int SQUARE = 1;
    private static final int RECTANGLE = 2;
    private static final int OTHER = 3;

    public static void main(String[] args) {

    }

    public int findShape(int A, int B, int C, int D) {

        int disAB = Math.abs(A - B);
        int disBC = Math.abs(B - C);
        int disCD = Math.abs(C - D);
        int disDA = Math.abs(D - A);

        return OTHER;
    }

    /**
     * X--------------Y
     * | -            |
     * |  -           |
     * | sqrtX^2-Y^2) |
     * |      -       |
     * |        -     |
     * |            - |
     * |--------------Z
     *
     * @param X
     * @param Y
     * @param Z
     * @return
     */
    public static double distanceDiagonal(int X, int Y, int Z) {
        return Math.sqrt(Math.pow(X - Y, 2) + Math.pow(Y - Z, 2));
    }

    public static double distance(int X, int Y) {
        return Math.abs(X - Y);
    }
}
