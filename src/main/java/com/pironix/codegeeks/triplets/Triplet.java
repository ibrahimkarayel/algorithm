package com.pironix.codegeeks.triplets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Count the triplets such that A[i] < B[j] < C[k]
 */
public class Triplet {

    public static void main(String[] args) {
        int[] a = {1, 5, 9};
        int[] b = {10, 5, 12};
        int[] c = {8, 12, 11};

    }

    private static List<List<Integer>> triplets(int[] a, int[] b, int[] c) {

        List<List<Integer>> triplets = new ArrayList<>();

        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);

        return triplets;
    }
}
