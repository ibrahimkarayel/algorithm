package com.pironix.leetcode.missingnum;

/**
 * Created by ikarayel on 4/5/2017.
 */
public class MissingOne {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 7};
        System.out.println(findOneMissing(arr));
    }

    private static int findOneMissing(int[] arr) {
        int totatXor = 0;
        int arrXor = 0;
        for (int i = 1; i <= arr.length + 1; i++) {
            totatXor ^= i;
        }

        for (int i = 0; i < arr.length; i++) {
            arrXor ^= arr[i];
        }
        return totatXor ^ arrXor;
    }

    /**
     * find total of missing number
     * then find for each half
     * ex 1,2,5,6 =missing 3 and 4
     * actual= 1,2 ,3 ,4 ,5 ,6
     * sum=3+4=4
     * 3
     * <p>
     * 1^2^3  ^ 1^2 =3
     * 4^5^6  ^ 5^6 =4
     *
     * @param arr
     * @return
     */
    private static int[] findTwoMissing(int[] arr) {

        long totalSum = arr.length * (arr.length + 1) / 2;
        long arrSum = 0;
        for (int i : arr) arrSum += i;

        int pivot = (int) ((totalSum - arrSum) / 2);
        int totalLeftXor = 0;
        int arrLeftXor = 0;

        int totalRightXor = 0;
        int arrRihtXor = 0;


        for (int i = 1; i <= pivot; i++) {
            totalLeftXor ^= i;
        }
        for (int i = pivot + 1; i <= arr.length; i++) {
            totalRightXor ^= i;
        }

        for (int i : arr) {
            if (i <= pivot)
                arrLeftXor ^= i;
            else
                arrRihtXor ^= arr[i];
        }
        return new int[]{totalLeftXor ^ arrLeftXor, totalRightXor ^ arrRihtXor};


    }
}
