package com.pironix.reverse.string;

import java.util.Stack;

/**
 * Created by ikarayel on 3/26/2017.
 */
public class ReverseString {

    public static void main(String[] args) {
        String test = "hello";
        String test2 = "hello ibrahim";
        System.out.println(reverse(test2));
        System.out.println(reverseByStack(test2));
    }

    private static String reverse(String str) {
        int left = 0;
        int right = str.length() - 1;
        char[] chars = str.toCharArray();
        while (left <= right) {
            swap(chars, left, right);
            left++;
            right--;
        }
        return String.valueOf(chars);
    }

    private static void swap(char[] chars, int i, int j) {
        char tmp = chars[i];
        chars[i] = chars[j];
        chars[j] = tmp;
    }

    private static String reverseByStack(String str) {
        str = str.replaceAll(" ", "");
        Stack<Character> cStack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            cStack.push(str.charAt(i));
        }

        char[] result = new char[cStack.size()];
        int i = 0;
        while (!cStack.isEmpty()) {
            result[i++] = cStack.pop();
        }
        return String.valueOf(result);
    }
}
