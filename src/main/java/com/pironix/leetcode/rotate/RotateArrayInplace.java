package com.pironix.leetcode.rotate;

import java.util.Arrays;

/**
 * Created by ikarayel on 3/25/2017.
 */
public class RotateArrayInplace {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        int k = 3;
       /* System.out.println(Arrays.toString(nums));
        rotate(nums, k);
        System.out.println(Arrays.toString(nums));*/

        rotateNotInplace(nums, 7);

        System.out.println(Arrays.toString(nums));

    }

    public static void rotateNotInplace(int[] nums, int d) {
        if (d > nums.length)
            d = d % nums.length;
        int[] tmp = new int[d];
        for (int i = 0; i < d; i++) {
            tmp[i] = nums[i];
        }

        for (int i = d; i < nums.length; i++) {
            nums[i - d] = nums[i];
        }
        int j = 0;
        for (int i = nums.length - d; i < nums.length; i++) {
            nums[i] = tmp[j++];

        }

    }

    private static void rotate(int[] nums, int k) {
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
        reverse(nums, 0, nums.length - 1);

    }

    private static void reverse(int[] nums, int start, int end) {

        for (int i = start; i <= (start + end) / 2; i++) {
            swap(nums, i, (start + end) - i);

        }
    }

    private static void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;

    }
}
