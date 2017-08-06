package com.pironix.permutation;

/**
 * Created by ikarayel on 3/6/2017.
 */
public class PermuteInt {

    public static void main(String[] args) {

        int[] a = {1, 2, 3};
        permute(0, a);
    }

    public static void permute(int start, int[] input) {
        if (start == input.length) {
            //System.out.println(input);
            for (int x : input) {
                System.out.print(x);
            }
            System.out.println("");
        } else {
            for (int i = start; i < input.length; i++) {
                // swapping
                int temp = input[i];
                input[i] = input[start];
                input[start] = temp;
                // swap(input[i], input[start]);

                permute(start + 1, input);
                // swap(input[i],input[start]);

                int temp2 = input[i];
                input[i] = input[start];
                input[start] = temp2;
            }
        }

    }
}

