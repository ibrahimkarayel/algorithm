package com.pironix.booking.trythree;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ikarayel on 4/2/2017.
 */
public class Try {

    private final TryNode root;

    public Try() {
        this.root = new TryNode();
    }

    public class TryNode {
        Map<Character, TryNode> child;
        boolean endOfWord;

        public TryNode() {
            this.child = new HashMap<>();
            this.endOfWord = false;
        }
    }

    public void insert(String word) {
        TryNode current = root;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            TryNode node = current.child.get(ch);
            if (node == null) {
                node = new TryNode();
                current.child.put(ch, node);
            }
            current = node;
        }
        current.endOfWord = true;
    }

    public void insertRecursive(String word) {
        insertRecursive(root, word, 0);

    }

    private void insertRecursive(TryNode current, String word, int index) {

        if (index == word.length()) {
            current.endOfWord = true;
            return;
        }
        char ch = word.charAt(index);
        TryNode node = current.child.get(ch);
        if (node == null) {
            node = new TryNode();
            current.child.put(ch, node);
        }
        insertRecursive(node, word, index + 1);
    }


    public boolean search(String word) {
        TryNode current = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            TryNode node = current.child.get(ch);
            if (node == null) {
                return false;
            }
            current = node;
        }
        return current.endOfWord;
    }


    public boolean searchRecursive(String word) {
        return searchRecursive(root, word, 0);

    }

    private boolean searchRecursive(TryNode current, String word, int index) {

        if (index == word.length()) {
            return current.endOfWord;
        }
        char ch = word.charAt(index);
        TryNode node = current.child.get(ch);
        if (node == null) {
            return false;
        }
        return searchRecursive(node, word, index + 1);
    }

    public void delete(String word) {
        delete(root, word, 0);

    }

    private boolean delete(TryNode current, String word, int index) {
        if (index == word.length()) {
            if (!current.endOfWord) {
                return false;
            }
            current.endOfWord = false;
            return current.child.size() == 0;
        }

        char ch = word.charAt(index);
        TryNode node = current.child.get(ch);
        if (node == null) {
            return false;
        }
        boolean shouldDelCurrNode = delete(node, word, index + 1);
        if (shouldDelCurrNode) {
            current.child.remove(ch);
            return current.child.size() == 0;
        }
        return false;
    }

    public static void main(String[] args) {
        Try aTry = new Try();
        aTry.insert("ali");
        aTry.insert("alem");
        aTry.insert("adem");
        System.out.println(aTry.search("al"));

    }
}
