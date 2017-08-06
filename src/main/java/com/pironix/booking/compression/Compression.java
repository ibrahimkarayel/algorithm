package com.pironix.booking.compression;

import java.util.Stack;

/**
 * Created by ikarayel on 3/5/2017.
 *
 * @author ibrahim KARAYEL
 *         <p>
 *         There's a very simple compression algorithm that takes subsequent characters and just emits how often they were seen.
 *         <p>
 *         Ex:
 *         abababaabbbaaaaa
 */
public class Compression {

    public static void main(String[] args) {
        String str = "abababaabbbaaaaa";

        System.out.println(compression(str));
        printUnique(str);
    }

    private static void printUnique(String input) {
        Stack<Character> stack = new Stack<>();
        for (int index = 0; index < input.length(); index++) {
            if (!stack.isEmpty() && stack.peek() == input.charAt(index)) {
                continue;
            } else {
                stack.push(input.charAt(index));
            }
        }
        System.out.println(stack.toString());
    }

    private static String compression(String str) {

        char[] chs = str.toCharArray();

        StringBuilder builder = new StringBuilder();
        int count = 1;
        for (int i = 0; i < chs.length; i++) {

            if (i < chs.length - 1 && chs[i] == chs[i + 1]) {
                count++;
                continue;
            }

            builder.append(chs[i] + "" + count);
            count = 1;
        }
        return builder.toString();
    }
}
