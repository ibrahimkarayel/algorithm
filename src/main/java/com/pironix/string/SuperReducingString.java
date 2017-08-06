package com.pironix.string;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by ikarayel on 3/3/2017.
 */
public class SuperReducingString {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        if (str.isEmpty()) {
            System.out.println("Empty String");
            return;
        }
        if (str.length() == 1) {
            System.out.println(str);
            return;
        }


        Stack<Character> stack = new Stack<Character>();
        stack.push(str.charAt(0));

        for (int i = 1; i < str.length(); i++) {
            if (!stack.isEmpty() && stack.peek() == str.charAt(i)) {
                stack.pop();
            } else {
                stack.push(str.charAt(i));
            }
        }

        if (stack.isEmpty()) {
            System.out.println("Empty String");
            return;
        }
        while (!stack.isEmpty())
            System.out.print(stack.pop());


    }
}
