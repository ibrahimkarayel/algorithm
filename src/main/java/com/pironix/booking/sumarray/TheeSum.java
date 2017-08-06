package com.pironix.booking.sumarray;

/**
 * Created by ikarayel on 3/27/2017.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given an array S of n integers, find three integers in S such that the sum is closest to a given number,
 target. Return the sum of the three integers. You may assume that each input would have exactly one solution.
    For example, given array S = {-1 2 1 -4}, and target = 1.
    The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
*/
public class TheeSum {

    public static void main(String[] args) {

        int[] nums = {-1, 2, 1, 4};
        int target = 2;
        System.out.println(findSum(nums, target));

      /*  int[] sumZero = {-1, 0, 1, 2, -1, -4};
        System.out.println("sum Zero");
        for (int[] arr : threeSumZero(sumZero)) {
            System.out.println(Arrays.toString(arr));
        }*/
    }

    /**
     * Given a list of integers, write a function that returns all sets of 3 numbers in the list,
     * a, b, and c, so that a + b + c == 0.
     * <p>
     * threeSum({-1, 0, 1, 2, -1, -4})
     * [-1, -1, 2]
     * [-1, 0, 1]
     *
     * @param num
     * @return
     */

    public static List<int[]> threeSumZero(int[] num) {

        List<int[]> result = new ArrayList<>();
        if (num.length < 3) {
            result.add(new int[]{0, 0, 0});
            return result;
        }

        Arrays.sort(num);

        for (int i = 0; i < num.length - 3; i++) {

            //duplicate check  Ex(- 1 -1 0 2 ...)
            if (i == 0 || num[i] > num[i - 1]) {
                int start = i + 1;
                int end = num.length - 1;

                while (start < end) {
                    int sum = num[i] + num[start] + num[end];
                    if (sum == 0) {
                        result.add(new int[]{num[i], num[start], num[end]});
                    }
                    if (num[i] + num[start] + num[end] < 0) {
                        int currentStart = start;
                        while (num[start] == num[currentStart] && start < end)
                            start++;
                    } else {
                        int currentEnd = end;
                        while (num[end] == num[currentEnd] && start < end)
                            end--;
                    }
                }
            }

        }
        return result;
    }

    public static int findSum(int[] num, int target) {

        if (num.length < 3)
            return 0;

        Arrays.sort(num);
        int result = num[0] + num[1] + num[2];
        if (result == target) {
            System.out.println(num[0] + " -> " + num[1] + " -> " + num[2]);
            return result;

        } else result = -1;

        for (int i = 0; i < num.length; i++) {
            int left = i;
            int right = num.length - 1;

            while (left < right) {
                int tmp = num[i] + num[left] + num[right];
                if (tmp == target) {
                    System.out.println(num[i] + " -> " + num[left] + " -> " + num[right]);
                    return tmp;
                }
                if (Math.abs(tmp - target) < Math.abs(result - target)) {
                    result = target;
                }
                if (tmp < target) {
                    left++;
                } else
                    right--;
            }
        }

        return -1;
    }
}
