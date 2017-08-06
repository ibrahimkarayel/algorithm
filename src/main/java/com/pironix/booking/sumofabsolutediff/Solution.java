package com.pironix.booking.sumofabsolutediff;

/**
 * Created by ikarayel on 3/1/2017.
 */
public class Solution {

    public static void main(String args[]) throws Exception {

        int[] arr1 = new int[]{1, 2, 3, 4};
        int[] arr2 = new int[]{1, 8, 9, 15, 16};
        int[] arr3 = new int[]{1, 2, 3, 4, 5, 7, 9, 11, 14};
        // System.out.println(sumOfAbsuloteDiff(arr1));
        //System.out.println("---------------------------");
        // System.out.println(sumOfAbsuloteDiff(arr2));
        //System.out.println("---------------------------");
        //System.out.println(sumOfAbsuloteDiff(arr3));

        System.out.println(sumOfAbsoluteDiffOne(arr1));
        System.out.println("---------------------------");
        System.out.println(sumOfAbsoluteDiffOne(arr2));
        System.out.println("---------------------------");
        System.out.println(sumOfAbsoluteDiffOne(arr3));
    }


    public static int sumOfAbsoluteDiffOne(int[] arr) {

        int sumx = 0;
        int sumy = 0;

        for (int i = 0; i < arr.length; i++) {
            sumx += arr[arr.length - i - 1] * (arr.length - i);
            sumy += arr[i] * (arr.length - i);
        }
        System.out.println(sumx);
        System.out.println(sumy);
        return sumy - sumx;
    }

    public static int sumOfAbsuloteDiff(int[] arr) {

        int sum = 0;
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                sum = sum + (arr[i] - arr[j]);
                System.out.println(sum);
            }
        }
        System.out.println("***************");
        return sum;
    }

}
