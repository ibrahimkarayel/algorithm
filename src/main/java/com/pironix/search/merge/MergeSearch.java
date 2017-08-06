package com.pironix.search.merge;

import java.util.Arrays;

/**
 * Created by ikarayel on 2/24/2017.
 */
public class MergeSearch {

    static int[] arr = new int[]{1, 2, 5, 8, 0, 9, 12, 6};

    public static void main(String[] args) {

    }

    public void mergeSort(int low, int high) {
        int mid = low + (high - low) / 2;

        if (low < high) {
            mergeSort(low, mid);
            mergeSort(mid + 1, high);
            merge(low, mid, high);
        }
    }

    private void merge(int low, int mid, int high) {
        int[] b = arr.clone();
        int[] c = Arrays.copyOf(arr, arr.length);

    }
}
