package com.pironix.booking.balancad_parentheses;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by ikarayel on 2/11/2017.
 *
 * @author ibrahim KARAYEL
 */
public class Solution {

    private static Map<Character, Character> parenthesesMapLeft = new HashMap<>();
    private static Map<Character, Character> parenthesesMapRight = new HashMap<>();

    static {
        parenthesesMapLeft.put('(', '(');
        parenthesesMapRight.put(')', '(');
        parenthesesMapLeft.put('[', '[');
        parenthesesMapRight.put(']', '[');
        parenthesesMapLeft.put('{', '{');
        parenthesesMapRight.put('}', '{');
    }

    public static void main(String[] args) {
        System.out.println("Please enter input");
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        System.out.println(isBalanced(str));
    }

    public static boolean isBalanced(String str) {

        boolean result = false;
        if (str.length() < 2)
            return false;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            if (!parenthesesMapRight.containsKey(ch) &&
                    !parenthesesMapLeft.containsKey(ch)) {
                continue;
            }
            if (parenthesesMapLeft.containsKey(ch)) {
                stack.push(ch);
            } else {
                if (!stack.isEmpty() && stack.pop() == parenthesesMapRight.get(ch).charValue()) {
                    result = true;
                } else {
                    return false;
                }
            }

        }
        if (!stack.isEmpty())
            return result = false;
        return result;
    }
}
