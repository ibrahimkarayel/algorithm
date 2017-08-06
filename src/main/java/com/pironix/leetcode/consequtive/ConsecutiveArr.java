package com.pironix.leetcode.consequtive;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by ikarayel on 3/5/2017.
 */
public class ConsecutiveArr {

    public static void main(String[] args) {

        int result = consecutive(new int[]{4, 2, 1, 6, 5});
        System.out.println(result);

        result = consecutive(new int[]{1, 2, 7, 3, 5, 6, 8, 10, 9});
        System.out.println(result);

    }

    private static int consecutive(int[] arr) {

        Set<Integer> values = new HashSet();
        for (int i = 0; i < arr.length; i++) {
            values.add(arr[i]);
        }

        int max = 0;
        for (int i : values) {
            System.out.print(i + " ");
            if (values.contains(i - 1))
                continue;
            int length = 0;
            while (values.contains(i++))
                length++;
            max = Math.max(max, length);

        }
        System.out.println();
        return max;
    }
}
