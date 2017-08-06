package com.pironix.booking.polygon;

/**
 * Created by ikarayel on 2/11/2017.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
public class Solution2 {

    private static int SQUARE = 0;
    private static int RECTANGLE = 0;
    private static int OTHER = 0;

    public static void main(String[] args) throws Exception {
        //File file = new File("input000.txt");
        Scanner scanner = new Scanner(System.in);
        List<int[]> poly = new ArrayList<>();

        while (scanner.hasNext()) {
            String nums = scanner.nextLine();
            String[] checkEdge = nums.split(" ");
            int[] num = new int[4];
            if (checkEdge.length != 4)
                throw new Exception("size must be 4");
            for (int i = 0; i < 4; i++) {
                int result = Integer.parseInt(checkEdge[i]);
                num[i] = result;
            }
            poly.add(num);
        }

        countPolygons(poly);
        System.out.println(SQUARE + " " + RECTANGLE + " " + OTHER);
    }


    private static void countPolygons(List<int[]> poly) {

        for (int i = 0; i < poly.size(); i++) {
            int[] edges = poly.get(i);
            int a = edges[0];
            int b = edges[1];
            int c = edges[2];
            int d = edges[3];
            if (a <= 0 || b <= 0 || c <= 0 || d <= 0) {
                OTHER++;
            } else if (a == b && b == c && c == d) {
                SQUARE++;
            } else if (a == c && b == d) {
                RECTANGLE++;
            } else {
                OTHER++;
            }

        }
    }

}
