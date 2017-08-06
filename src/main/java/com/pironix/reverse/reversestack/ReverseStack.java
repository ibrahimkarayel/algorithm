package com.pironix.reverse.reversestack;

import java.util.Stack;

/**
 * Created by ikarayel on 3/26/2017.
 */
public class ReverseStack {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
/*        stack.push(4);
        stack.push(5);
        stack.push(6);*/
/*        while (!stack.isEmpty())
            System.out.println(stack.pop());*/

        reverse(stack);
        while (!stack.isEmpty())
            System.out.println(stack.pop());
    }


    private static Stack<Integer> reverse(Stack<Integer> stack) {
        if (stack.isEmpty())
            return stack;
        int tmp = stack.pop();
        reverse(stack);
        insertBottom(stack, tmp);
        return stack;
    }

    private static void insertBottom(Stack<Integer> stack, int x) {
        if (stack.isEmpty()) {
            stack.push(x);
            return;

        }
        int tmp = stack.pop();
        insertBottom(stack, x);
        stack.push(tmp);
    }
}
