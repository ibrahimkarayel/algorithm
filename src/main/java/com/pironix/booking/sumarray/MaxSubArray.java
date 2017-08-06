package com.pironix.booking.sumarray;

/**
 * Created by ikarayel on 4/2/2017.
 * <p>
 * Kadene's algorithm
 */
public class MaxSubArray {

    public static void main(String[] args) {
        int[] arr = {-2, 3, 2, -1};
        System.out.println(maxSubArr(arr));
    }

    private static int maxSubArr(int[] arr) {

        int global_max = Integer.MIN_VALUE;
        int sub_max = 0;
        for (int i = 0; i < arr.length; i++) {
            sub_max = sub_max + arr[i];
            if (sub_max > global_max) {
                global_max = sub_max;
            }
            if (sub_max < 0)
                sub_max = 0;

        }
        return global_max;
    }
}
