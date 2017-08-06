package com.pironix.booking.trythree;

import java.util.Scanner;

/**
 * Created by ikarayel on 4/4/2017.
 * <p>
 * <p>
 * 4
 * add hack
 * add hackerrank
 * find hac
 * find hak
 * 2
 * 0
 */
public class ContactList {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Node node = new Node();

        for (int a0 = 0; a0 < n; a0++) {
            String op = in.next();
            String contact = in.next();
            if (op.equals("add")) {
                node.add(contact);
            } else if (op.equals("find")) {
                System.out.println(node.findCount(contact, 0));
            }

        }

    }

    private static class Node {
        private static int NUMBER_OF_CHAR = 26;
        Node[] children = new Node[NUMBER_OF_CHAR];
        int size = 0;

        private int getCharIndex(char c) {
            return c - 'a';
        }

        private Node getNode(char c) {
            return children[getCharIndex(c)];
        }

        private void setNode(char c, Node node) {
            children[getCharIndex(c)] = node;
        }

        private void add(String s) {
            add(s, 0);

        }

        private void add(String s, int index) {
            size++;
            if (index == s.length())
                return;
            char curr = s.charAt(index);
            Node child = getNode(curr);
            if (child == null) {
                child = new Node();
                setNode(curr, child);
            }
            child.add(s, index + 1);
        }


        public int findCount(String s, int index) {
            if (index == s.length())
                return size;
            Node child = getNode(s.charAt(index));
            if (child == null)
                return 0;
            return child.findCount(s, index + 1);
        }
    }
}
