package com.pironix.sort.bubble;

public class BubbleSort {

    public static void main(String... args) {


        int[] arr = new int[]{1, 5, 9, 11, 0, 2, 4};
        int[] arr2 = new int[]{1, 2, 3, 4, 5, 6};

  /*      bubbleSort(arr);
        bubbleSort(arr2);
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);

        for (int i = 0; i < arr2.length; i++)
            System.out.println(arr2[i]);

        bubbleSort(arr, arr.length);
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);*/

        bubbleSortRc(arr, arr.length);
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }


    public static void bubbleSortRc(int arr[], int n) {
        // Base case
        if (n == 1)
            return;

        // One pass of bubble sort. After
        // this pass, the largest element
        // is moved (or bubbled) to end.
        for (int i = 0; i < n - 1; i++)
            if (arr[i] > arr[i + 1]) {
                int tmp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = tmp;
            }
        // Largest element is fixed,
        // recur for remaining array
        bubbleSortRc(arr, n - 1);
    }

    /**
     * @param arr
     */
    private static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
    }

    /**
     * @param arr
     * @param n
     */
    private static void bubbleSort(int arr[], int n) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }


}