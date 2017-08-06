package com.pironix.hackerearth;

/**
 * Created by ikarayel on 1/9/2017.
 */
public class PalindromeNumber {

    public static void main(String[] args) {

        /*Scanner s = new Scanner(System.in);
        String str = s.next();
        System.out.println(isPalindrome(str));*/

        System.out.println(isPalindrome(121));

    }

    private static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int comp = 0;
        int copy = x;
        while (copy != 0) {
            comp = comp * 10 + copy % 10;
            copy = copy / 10;
        }
        return x == comp;
    }
}
