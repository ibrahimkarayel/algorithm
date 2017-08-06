package com.pironix.hackerearth;

import java.util.Scanner;

/**
 * Created by ikarayel on 1/9/2017.
 */
public class PalindromeString {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String str = s.next();
        System.out.println(isPalindrome(str));

    }

    private static String isPalindrome(String str) {
        if (str == null || str.length() <= 0)
            return null;
        int j = str.length() - 1;
        int i = 0;
        while (i <= j) {
            if (str.charAt(i++) != str.charAt(j--))
                return "NO";
        }
        return "YES";
    }

}
