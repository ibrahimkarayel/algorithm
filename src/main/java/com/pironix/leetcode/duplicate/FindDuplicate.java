package com.pironix.leetcode.duplicate;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by ikarayel on 4/4/2017.
 * <p>
 * fin duplicate in an array
 * 1<= x <=len(arr)
 * O(N) without set
 */
public class FindDuplicate {

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 1};
        System.out.println(findAllDuplicate(arr));
    }

    private static List<Integer> findAllDuplicate(int[] arr) {
        Set<Integer> resultSet = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {

            int index = Math.abs(arr[i] - 1);
            if (arr[index] < 0) {
                resultSet.add(Math.abs(arr[i]));
            } else {
                arr[index] = -arr[index];
            }

        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.abs(arr[i]);
        }
        return new ArrayList<>(resultSet);
    }
}
