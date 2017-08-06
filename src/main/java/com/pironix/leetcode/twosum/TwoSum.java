package com.pironix.leetcode.twosum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by ikarayel on 3/4/2017.
 */
public class TwoSum {

    public static void main(String[] args) {

        int[] num = new int[]{2, 2, 7, 11, 15};
        int target = 9;

        //  System.out.println(Arrays.toString(twoSum(num, target)));
        System.out.println(Arrays.toString(twoSumHashMap(num, target)));
        System.out.println(Arrays.toString(twoSumEfficient(num, target)));

    }

    private static int[] twoSum(int[] num, int target) {
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length - 1; j++) {
                if (num[j] == target - num[i])
                    return new int[]{i, j};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    private static int[] twoSumHashMap(int[] num, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < num.length; i++) {
            map.put(num[i], i);
        }

        for (int i = 0; i < num.length; i++) {
            int complement = target - num[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[]{i, map.get(complement)};
            }
        }

        throw new IllegalArgumentException("No two sum solution");

    }

    private static int[] twoSumEfficient(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
