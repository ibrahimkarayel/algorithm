package com.pironix.reverse.string;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Created by ikarayel on 3/26/2017.
 */
public class ReverseLinkedList {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(reverseByStack(list));
    }


    private static List<Integer> reverseByStack(LinkedList<Integer> list) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < list.size(); i++) {
            stack.push(list.get(i));
        }
        list.clear();
        while (!stack.isEmpty()) {
            list.push(stack.pop());
        }
        return list;
    }
}
