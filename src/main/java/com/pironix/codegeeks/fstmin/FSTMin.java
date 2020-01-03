package com.pironix.codegeeks.fstmin;

import java.util.Arrays;

/**
 * Find the first, second and third minimum elements in an array in O(n).
 */
public class FSTMin {

    public static void main(String[] args) {
        int[] arr = {9, 4, 1, 7, 12, 6, -5};
        int[] fstMin = findFirstSecondThirdMin(arr);
        System.out.println(Arrays.toString(fstMin));

    }

    private static int[] findFirstSecondThirdMin(int[] arr) {

        int[] fstMin = new int[3];
        fstMin[0] = Integer.MAX_VALUE; // first min
        fstMin[1] = Integer.MAX_VALUE; // secondMin
        fstMin[2] = Integer.MAX_VALUE; // thirdMin
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < fstMin[0]) {
                fstMin[2] = fstMin[1];
                fstMin[1] = fstMin[0];
                fstMin[0] = arr[i];
            } else if (arr[i] < fstMin[1]) {
                fstMin[2] = fstMin[1];
                fstMin[1] = arr[i];
            } else if (arr[i] < fstMin[2]) {
                fstMin[2] = arr[i];
            }
        }
        return fstMin;
    }
}
