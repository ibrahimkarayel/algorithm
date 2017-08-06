package com.pironix.hackerrank.armstrong;

import java.util.Scanner;

/**
 * The ArmstrongSolution solutions class
 *
 * @author ibrahim KARAYEL
 * @version 1.0
 * @date 10/1/2016
 */
public class ArmstrongSolution {

    private static final int POWER_DIGIT = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter number");
        int num = scanner.nextInt();
        System.out.println("Method 1 Armstrong number : " + findArmstrong(num));
        System.out.println("Method 2 Armstrong number : " + findArmstrong(String.valueOf(num)));
        int recursion = powRecursion(num);
        System.out.println("Method 3 Armstrong number : " + (recursion == num ? num : -1));

    }


    /**
     * @param num given number
     * @return if num is armstrong return num otherwise -1
     */
    private static int findArmstrong(int num) {
        if (num < 0)
            return -1;
        if (num == 0 || num == 1) {
            return num;
        } else {
            int sum = 0;
            int copyNum = num;
            while (copyNum != 0) {
                int lastDigit = copyNum % 10;
                sum += (lastDigit * lastDigit * lastDigit);
                copyNum = copyNum / 10;
            }
            if (sum == num) {
                return num;
            }
        }
        return -1;
    }

    /**
     * @param num given number
     * @return the sum pow of all digits in number
     */
    private static int powRecursion(int num) {
        if (num == 0)
            return 0;
        else
            return (int) Math.pow(num % 10, POWER_DIGIT) + powRecursion(num / 10);

    }

    /**
     * @param num string value of number
     * @return if num is armstrong return num otherwise -1
     */
    private static int findArmstrong(String num) {
        int sum = 0;
        if (Integer.parseInt(num) < 0)
            return -1;
        for (int i = 0; i < num.length(); i++) {
            int digit = Character.getNumericValue(num.charAt(i));
            sum += (digit * digit * digit);
        }
        if (sum == Integer.valueOf(num))
            return sum;
        return -1;
    }


}
