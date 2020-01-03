package com.pironix.codegeeks.triplets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Count the triplets such that A[i] < B[j] < C[k]
 */
public class Triplet1 {

    public static void main(String[] args) {
        int[] a = {5, 4, 3, 7, 6, 1, 9};
        System.out.println(triplets(a, a.length));


    }

    private static List<Integer> triplets(int[] arr, int n) {
        // sorted triplet is not possible on input having less than 3 elements
        if (n < 3) {
            return null;
        }

        // min[i] = j where 0 <= j < i and arr[j] < arr[i]
        // min[i] = -1 when arr[j] > arr[i] for every index j < i
        int[] min = new int[n];
        Arrays.fill(min, -1);

        // keep an index to the minimum element found so far
        // while traversing the array from left to right
        int min_index_so_far = 0;

        // start from the 1st index as min[0] would be -1
        for (int i = 1; i < n; i++) {
            // update min_index_so_far if current index has less value, else
            // update min[i] with the smallest index to its left
            if (arr[i] < arr[min_index_so_far]) {
                min_index_so_far = i;
            } else {
                min[i] = min_index_so_far;
            }
        }

        // max[i] = j where i < j < n and arr[i] < arr[j]
        // max[i] = -1 when arr[j] < arr[i] for every index j > i
        int[] max = new int[n];
        Arrays.fill(max, -1);

        // keep an index to the maximum element found so far
        // while traversing the array from right to left
        int max_index_so_far = n - 1;

        // start from the second last index as max[n-1] would be -1
        for (int i = n - 2; i >= 0; i--) {
            // update max_index_so_far if current index has more value, else
            // update max[i] with the greatest index to its right
            if (arr[i] > arr[max_index_so_far]) {
                max_index_so_far = i;
            } else
                max[i] = max_index_so_far;
        }

        // traverse the array again and find an index which has both a min
        // element on its left and a max element on its right
        for (int i = 0; i < n; i++) {
            if (min[i] != -1 && max[i] != -1) {
                // create a tuple of the found triplet and returns true
                return List.of(min[i], i, max[i]);
            }
        }

        // no triplet found
        return null;
    }
}
