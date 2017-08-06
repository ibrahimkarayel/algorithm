package com.pironix.hackerrank.productnum;

import java.util.Scanner;

/**
 * Created by ikarayel on 1/25/2017.
 * <p>
 * Given an array of n integers where n > 1, nums,
 * return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].
 * Solve it without division and in O(n).
 * For example, given [1,2,3,4], return [24,12,8,6].
 */
public class Solution {

    public static void main(String[] args) {

        System.out.println(Runtime.getRuntime().freeMemory());

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        sumProductOthers(nums);


    }

    private static void sumProductOthers(int[] arr) {
        if (arr.length < 1)
            throw new IllegalArgumentException();

        int i, temp = 1, n = arr.length;

        /* Allocate memory for the product array */
        int prod[] = new int[n];

        /* In this loop, temp variable contains product of
           elements on left side excluding arr[i] */
        for (i = 0; i < n; i++) {
            prod[i] = temp;
            temp *= arr[i];
        }

        /* Initialize temp to 1 for product on right side */
        temp = 1;

        /* In this loop, temp variable contains product of
           elements on right side excluding arr[i] */
        for (i = n - 1; i >= 0; i--) {
            prod[i] *= temp;
            temp *= arr[i];
        }

        /* print the constructed prod array */
        for (i = 0; i < n; i++)
            System.out.print(prod[i] + " ");
    }
}
