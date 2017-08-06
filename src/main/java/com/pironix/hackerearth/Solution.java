package com.pironix.hackerearth;

import java.util.Scanner;

/**
 * Created by ikarayel on 1/11/2017.
 */
public class Solution {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);


        int ii = i = Integer.valueOf(scan.nextLine());
        double dd = Double.valueOf(scan.nextLine());
        String ss = scan.nextLine();


        System.out.println(i + ii);
        System.out.printf("%.1f", (dd - d));
        System.out.println(s + ss);
        scan.close();

    }
}
