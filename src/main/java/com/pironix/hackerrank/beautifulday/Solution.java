package com.pironix.hackerrank.beautifulday;

import java.util.Scanner;

/**
 * Created by ikarayel on 12/12/2016.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String[] days = new String[10];
        for (int i = 0; i < a; i++) {
            days[i++] = scanner.next();

        }
        System.out.println(days);
        int beautiful = 0;
        for (int i = 0; i < days.length; i++) {
            if (Integer.valueOf(days[i]) -
                    Integer.valueOf(new StringBuilder(days[i]).reverse().toString()) % 2 == 0) ;
        }
    }
}
