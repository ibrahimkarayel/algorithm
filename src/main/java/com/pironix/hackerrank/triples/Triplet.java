package com.pironix.hackerrank.triples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Count triplets with sum smaller than a given value
 */
public class Triplet {
    public static void main(String[] args) {
        //  Below are triplets with sum less than 12
        //(1, 3, 4), (1, 3, 5), (1, 3, 7) and(1, 4, 5)
        int arr[] = {5, 1, 3, 4, 7};
        int sum = 12;
       System.out.println(countTripletsSmallerThan(arr, sum));
        System.out.println(countTripletsSmallerThanSort(arr, sum));
    }

    private static int countTripletsSmallerThan(int[] arr, int sum) {
        int count = 0;
        List<List<Integer>> listOf3lets = new ArrayList<>();

        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] < sum) {
                        count++;
                        listOf3lets.add(List.of(arr[i], arr[j], arr[k]));
                    }
                }
            }
        }
        System.out.println(listOf3lets);
        return count;
    }

    private static int countTripletsSmallerThanSort(int[] arr, int sum) {
        Arrays.sort(arr);
        int count = 0;
        List<List<Integer>> listOf3lets = new ArrayList<>();
        for (int i = 0; i < arr.length - 2; i++) {
            int j = i + 1, k = arr.length - 1;
            while (j < k) {
                // If sum of current triplet is more or equal,
                // move right corner to look for smaller values
                if (arr[i] + arr[j] + arr[k] >= sum) {
                    k--;
                } else {
                    // This is important. For current i and j, there
                    // can be total k-j third elements.
                    count += (k - j);
                    j++;

                }
            }


        }
        System.out.println(listOf3lets);
        return count;
    }
}
