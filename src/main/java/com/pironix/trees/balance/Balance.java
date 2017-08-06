package com.pironix.trees.balance;

/**
 * Created by ikarayel on 3/19/2017.
 */
public class Balance {


    public static void main(String[] args) {
        Node node = new Node(8);
        Node node2 = new Node(5);
        Node node3 = new Node(5);
        Node node4 = new Node(5);
        Node node5 = new Node(5);
        Node node6 = new Node(5);
    }

    static class Node {
        Node left;
        Node right;
        int value;

        Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }

    }

    public boolean isBalanced(Node node) {
        return balancedHeiht(node) > -1;
    }

    private int findHeight(Node node) {
        if (node == null)
            return -1;
        int hLeft = findHeight(node.left);
        int hRight = findHeight(node.right);
        return Math.max(hLeft, hRight) + 1;

    }

    private static int balancedHeiht(Node node) {
        if (node == null)
            return 0;
        int hLeft = balancedHeiht(node.left);
        int hRight = balancedHeiht(node.right);
        if (hLeft == -1 || hRight == -1)
            return -1;
        if (Math.abs(hLeft - hRight) > 1)
            return -1;

        return Math.max(hLeft, hRight) + 1;

    }
}
