package com.pironix.search.binary;

import java.util.Arrays;
import java.util.Scanner;

/**
 * The BinarySearch Solution class
 * <p>
 * implement general and recursive solution for binary search
 *
 * @author ibrahim KARAYEL
 * @version 1.0
 * @sice 9/115/2016
 */
public class BinarySearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter number of numbers :");
        int n = scanner.nextInt();
        int[] numbs = new int[n];
        for (int i = 0; i < n; i++) {
            numbs[i] = scanner.nextInt();
        }
        System.out.println("please enter search key:");
        int key = scanner.nextInt();
        Arrays.sort(numbs);
        System.out.println("key at index: " + binarySearch(numbs, key));
        System.out.println("Recursion key at index: " + binarySearchRecursion(numbs, 0, numbs.length - 1, key));
        System.out.println("key at first index: " + binarySearchFirstIndex(numbs, key));
        System.out.println("key at last index: " + binarySearchLastIndex(numbs, key));

    }


    /**
     * @param numbs given numbers
     * @param low   min number index
     * @param high  max number index
     * @param key   searched key
     * @return searched key index if found otherwise -1
     */
    private static int binarySearchRecursion(int[] numbs, int low, int high, int key) {
        if (low > high)
            return -1;
        int mid = low + (high - low) / 2;
        if (key == numbs[mid])
            return mid;
        else if (key > numbs[mid]) {
            return binarySearchRecursion(numbs, mid + 1, high, key);
        } else {
            return binarySearchRecursion(numbs, low, mid - 1, key);
        }
    }

    /**
     * @param numbs given numbers
     * @param key   searched key
     * @return searched key index if found otherwise -1
     */
    private static int binarySearch(int[] numbs, int key) {
        int low = 0;
        int high = numbs.length - 1;
        int mid;
        while (low <= high) {
            // mid = (low + high) / 2; //if low and high exceed max integer range 2^31-1 there will be an issue
            mid = low + (high - low) / 2;
            if (key == numbs[mid]) {
                return mid;

            } else if (key < numbs[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    /**
     * @param numbs given numbers
     * @param key   searched key
     * @return last occurrence index of searched key if found otherwise -1
     */
    private static int binarySearchLastIndex(int[] numbs, int key) {
        int low = 0;
        int high = numbs.length - 1;
        int mid;
        int result = -1;
        while (low <= high) {
            // mid = (low + high) / 2; //if low and high exceed max integer range 2^31-1 there will be an issue
            mid = low + (high - low) / 2;
            if (key == numbs[mid]) {
                result = mid;
                low = mid + 1;
            } else if (key < numbs[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    /**
     * @param numbs given numbers
     * @param key   searched key
     * @return first occurrence index of searched key if found otherwise -1
     */
    private static int binarySearchFirstIndex(int[] numbs, int key) {
        int low = 0;
        int high = numbs.length - 1;
        int mid;
        int result = -1;
        while (low <= high) {
            // mid = (low + high) / 2; //if low and high exceed max integer range 2^31-1 there will be an issue
            mid = low + (high - low) / 2;
            if (key == numbs[mid]) {
                result = mid;
                high = mid - 1;
            } else if (key < numbs[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

}
