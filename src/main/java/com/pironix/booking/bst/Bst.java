package com.pironix.booking.bst;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ikarayel on 3/2/2017.
 *
 * @author ibrahim KARAYEL
 */
public class Bst {

    public static void main(String[] args) {
        //20 8 4 12 10 14 22
        Bst bst = new Bst();
        bst.insert(20);
        bst.insert(8);
        bst.insert(4);
        bst.insert(12);
        bst.insert(10);
        bst.insert(14);
        bst.insert(22);
        System.out.print("In order: ");
        bst.displayInOrder(bst.root);
        System.out.println();
        System.out.print("Pre order: ");
        bst.displayPreOrder(bst.root);
        System.out.println();
        System.out.print("Post order: ");
        bst.displayPostOrder(bst.root);
        System.out.println();

        System.out.println("Path: ");
        printPaths(bst.root, new ArrayList<>(), 0);
    }

    private Node root;

    public Bst() {
        this.root = null;

    }

    public void insert(int value) {
        Node node = new Node(value);
        if (root == null) {
            root = node;
            return;
        }
        Node current = root;
        Node parent;
        while (true) {
            parent = current;
            if (value < current.getValue()) {
                current = current.getLeft();
                if (current == null) {
                    parent.setLeft(node);
                    return;
                }
            } else {
                current = current.getRight();
                if (current == null) {
                    parent.setRight(node);
                    return;
                }

            }
        }
    }


    /**
     * Algorithm In order(tree)
     * 1. Traverse the left subtree, i.e., call Inorder(left-subtree)
     * 2. Visit the root.
     * 3. Traverse the right subtree, i.e., call Inorder(right-subtree)
     *
     * @param root
     */
    public void displayInOrder(Node root) {
        if (root != null) {
            displayInOrder(root.getLeft());
            System.out.print(" " + root.getValue());
            displayInOrder(root.getRight());
        }
    }

    /**
     * Algorithm Pre order(tree)
     * 1. Visit the root.
     * 2. Traverse the left subtree, i.e., call Preorder(left-subtree)
     * 3. Traverse the right subtree, i.e., call Preorder(right-subtree)
     *
     * @param root
     */
    public void displayPreOrder(Node root) {
        if (root != null) {
            System.out.print(" " + root.getValue());
            displayPreOrder(root.getLeft());
            displayPreOrder(root.getRight());
        }
    }

    /**
     * Algorithm Post order(tree)
     * 1. Traverse the left subtree, i.e., call Postorder(left-subtree)
     * 2. Traverse the right subtree, i.e., call Postorder(right-subtree)
     * 3. Visit the root.
     *
     * @param root
     */
    public void displayPostOrder(Node root) {
        if (root != null) {
            displayPostOrder(root.getLeft());
            displayPostOrder(root.getRight());
            System.out.print(" " + root.getValue());

        }
    }

    private static int size(Node node) {
        if (node == null)
            return 0;
        else
            return (size(node.getLeft()) + 1 + size(node.getRight()));
    }


    private static void printPaths(Node root, List<Integer> path, int pathLen) {
        if (root == null) {
            return;
        }
        pathLen++;
        path.add(root.getValue());
        if (root.getLeft() == null && root.getRight() == null) {
            print(path, pathLen);
        } else {
            printPaths(root.getLeft(), path, pathLen);
            printPaths(root.getRight(), path, pathLen);
        }
    }

    private static void print(List<Integer> path, int pathLen) {
        for (int i = 0; i < pathLen; i++) {
            System.out.print(path.get(i) + " ");
        }
        System.out.println();
    }


    public boolean find(int value) {
        Node current = root;

        while (current != null) {
            if (current.getValue() == value)
                return true;
            if (current.getValue() > value) {
                current = current.getLeft();
            } else if (current.getValue() < value) {
                current = current.getRight();
            }
        }
        return false;
    }

}
