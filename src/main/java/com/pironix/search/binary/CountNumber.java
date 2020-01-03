package com.pironix.search.binary;

/**
 * Count number of occurrences (or frequency) in a sorted array
 */
public class CountNumber {
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 2, 2, 3, 3, 5, 5, 5, 9, 9, 11};
        System.out.println("Count of 2 ->  " + countNumber(arr, 2));
        System.out.println("Count of 3 ->  " + countNumber(arr, 3));
        System.out.println("Count of 5 ->  " + countNumber(arr, 5));
        System.out.println("Count of 9 ->  " + countNumber(arr, 9));
        System.out.println("Count of 4 ->  " + countNumber(arr, 4));
        System.out.println("Count of 11 ->  " + countNumber(arr, 11));
    }

    private static int countNumber(int[] arr, int x) {
        int min = findIndex(arr, x, true);
        if (min <= 0) {
            return 0;
        }
        int max = findIndex(arr, x, false);

        return max - min + 1;

    }

    private static int findIndex(int[] arr, int x, boolean isFirst) {
        int low = 0;
        int high = arr.length - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == arr[mid]) {
                result = mid;
                if (isFirst) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else if (x < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

}
