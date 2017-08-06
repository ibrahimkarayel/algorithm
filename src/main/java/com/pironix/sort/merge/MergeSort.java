package com.pironix.sort.merge;

/**
 * Created by ikarayel on 3/4/2017.
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 9, 11, 0, 2, 4};
        mergeSort(arr, 0, arr.length);

        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }

    private static void mergeSort(int[] arr, int left, int right) {

        if (left >= right)
            return;
        int middle = left + (right - left) / 2;
        mergeSort(arr, left, middle);
        mergeSort(arr, middle + 1, right);
        merge(arr, left, middle, right);
    }

    private static void merge(int[] arr, int left, int middle, int right) {
    }
}
