package com.pironix.hackerrank.quartiles;

import java.util.Arrays;
import java.util.Scanner;

/**
 * The Quartiles ExHandlingSolution class
 *
 * @author ibrahim KARAYEL
 * @version 1.0
 * @sice 9/10/2016
 */
public class QuartilesSolution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter N count min 5 max 50 ");
        int n = scanner.nextInt();
        Integer quartiles[];
        if (n < 5 || n > 50) {
            //System.out.println("Wrong input");
            return;
        } else {
            System.out.println("Please enter your numbers");
            quartiles = new Integer[n];
            int count = 0;
            do {
                quartiles[count++] = scanner.nextInt();
            } while (count < n);

        }
        for (int in : writeQuartiles(n, quartiles))
            System.out.println(in);
    }


    public static Integer[] writeQuartiles(int n, Integer[] quartiles) {
        Arrays.sort(quartiles);
        //System.out.println(Arrays.toString(quartiles));
        if (n < 5 || n > 50)
            return new Integer[]{0, 0, 0};

        int q1, q2, q3;
        if (n % 2 == 0) {
            q1 = (quartiles[n / 2] + quartiles[n / 2 - 1]) / 2;
            if ((n / 2) % 2 == 0) {
                q2 = (quartiles[(n * 25) / 100] + quartiles[(n * 25) / 100 - 1]) / 2;
                q3 = (quartiles[(n * 75) / 100] + quartiles[(n * 75) / 100 - 1]) / 2;
            } else {
                q2 = quartiles[(n * 25) / 100];
                q3 = quartiles[(n * 75) / 100];
            }


        } else {
            q1 = quartiles[n / 2];
            if ((n / 2) % 2 == 0) {
                q2 = (quartiles[(n * 25) / 100] + quartiles[(n * 25) / 100 - 1]) / 2;
                q3 = (quartiles[(n * 75) / 100] + quartiles[(n * 75) / 100 + 1]) / 2;
            } else {
                q2 = quartiles[(n * 25) / 100];
                q3 = quartiles[(n * 75) / 100];
            }
        }
        Integer[] result = {q2, q1, q3};
        return result;
    }
}


