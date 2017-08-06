package com.pironix.thoughtworks.findnum;

/**
 * The FindNumber Solution class
 *
 * @author ibrahim KARAYEL
 * @version 1.0
 *          11/30/2016
 *          <p>
 *          Find numbers 1-1000 which are even and divisible by 7 and also sum of individual digit is 7.
 */
public class FindNumbers {

    private static final int max = 1000;
    private static final int SEVEN = 7;

    public static void main(String[] args) {
        findEvenDivisibleBy7AndSumDigit7();
    }


    private static void findEvenDivisibleBy7AndSumDigit7() {

        for (int i = 1; i < max; i++) {
            if (i % 2 == 0 && i % 7 == 0) {
                int sum = 0;
                int tmp = i;
                while (tmp > 0) {
                    sum = sum + tmp % 10;
                    tmp = tmp / 10;

                }
                if (sum == SEVEN)
                    System.out.print(i + " ");
            }
        }
    }

   /* private static int sumOfDigits(int tmp) {
        int sum = 0;
        while (tmp > 0) {
            sum = sum + tmp % 10;
            tmp = tmp / 10;
        }
        return sum;
    }*/

}
