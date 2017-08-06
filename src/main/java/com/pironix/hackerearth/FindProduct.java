package com.pironix.hackerearth;

import java.util.Scanner;

/**
 * The FindProduct  Solution class
 *
 * @author ibrahim KARAYEL
 * @version 1.0
 *          Created by ibrahim on 1/21/2017.
 */
public class FindProduct {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++)
            arr[i] = s.nextInt();
        System.out.println(findProduct(arr, N));


    }

    private static double findProduct(int[] ints, int N) {
        double answer = 0;
        for (int i = 0; i < N; i++) {
            answer = (answer * ints[i]) % (1000000000 + 7);
            System.out.println(answer);
        }
        return answer;
    }
}
