package com.pironix.bitmanipulation.lonleyInt;

/**
 * Created by ikarayel on 3/11/2017.
 *
 * @author ibrahim KARAYEL
 */
public class LonelyInteger {

    public static void main(String[] args) {
        int[] arr = {1, 1, 5, 5, 9, 9, 12, 12, 11, 11, 99};
        System.out.println(lonelyNumber(arr));
    }

    /**
     * The XOR operator will return a 1, or TRUE, if both numbers being compared are different.
     * But, if the numbers being compared are the same it will return a 0 for FALSE.
     *
     * @param nums
     * @return
     */
    private static int lonelyNumber(int[] nums) {
        int alone = 0;
        for (int in : nums) {
            alone ^= in;
        }
        return alone;
    }
}
