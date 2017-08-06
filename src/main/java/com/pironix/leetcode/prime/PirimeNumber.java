package com.pironix.leetcode.prime;

/**
 * Created by ikarayel on 3/26/2017.
 */
public class PirimeNumber {

    public static void main(String[] args) {
        System.out.println(isPrime(7));
    }

    private static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        if (num == 2 || num == 3)
            return true;

        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                System.out.println(i);
                return false;
            }
        }
        return true;
    }
}
