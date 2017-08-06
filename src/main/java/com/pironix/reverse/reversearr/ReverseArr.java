package com.pironix.reverse.reversearr;

/**
 * Created by ikarayel on 3/5/2017.
 */
public class ReverseArr {

    public static void main(String... args) {

        int[] arr = new int[]{1, 5, 9, 11, 0, 2, 4};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        reverse(arr);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

    }

    public static void reverse(int[] arr) {

        int i = 0, tmp;
        int j = arr.length - 1;
        while (i < j) {
            tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
            i++;
            j--;
        }


    }
}
