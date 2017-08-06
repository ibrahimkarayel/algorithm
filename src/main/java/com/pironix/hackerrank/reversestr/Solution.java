package com.pironix.hackerrank.reversestr;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created on 1/25/2017.
 * <p>
 * print all the characters present in the given string only once in a reverse order.
 * Time & Space complexity should not be more than O(N).
 *
 * @author ibrahim KARAYEL
 */
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(reverseLastOrder(str));

    }

    private static String reverseLastOrder(String str) {
        if (str == null || str.length() < 1)
            throw new IllegalArgumentException("");
        StringBuilder stringBuilder = new StringBuilder();

        String s = "";
        Set<Character> inputSet = new HashSet<>();
        for (int i = str.length() - 1; i > 0; i--) {
            if (!inputSet.contains(str.charAt(i))) {
                inputSet.add(str.charAt(i));
                stringBuilder.append(str.charAt(i));
                s = s + str.charAt(i);
            }

        }
        return stringBuilder.toString();
    }
}
