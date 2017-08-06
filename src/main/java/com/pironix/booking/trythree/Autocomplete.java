package com.pironix.booking.trythree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ikarayel on 4/2/2017.
 */
public class Autocomplete {

    private class Node {
        private String prefix;
        private Map<Character, Node> children = new HashMap<>();
        boolean isWord;

        private Node(String prefix) {
            this.prefix = prefix;
            this.children = new HashMap<>();
        }
    }

    private Node trie;

    public Autocomplete(String[] dic) {
        trie = new Node("");
        for (String s : dic) {
            insertWord(s);
        }
    }

    public void insertWord(String s) {
        Node curr = trie;
        for (int i = 0; i < s.length(); i++) {
            if (!curr.children.containsKey(s.charAt(i))) {
                curr.children.put(s.charAt(i), new Node(s.substring(0, i + 1)));
            }
            curr = curr.children.get(s.charAt(i));
            if (i == s.length() - 1)
                curr.isWord = true;
        }
    }

    public List<String> getWordsForPrefix(String pre) {
        List<String> results = new ArrayList<>();

        Node curr = trie;
        for (char c : pre.toCharArray()) {
            if (curr.children.containsKey(c)) {
                curr = curr.children.get(c);
            } else {
                return results;
            }
        }
        findAllChildWords(curr, results);
        return results;

    }

    private void findAllChildWords(Node curr, List<String> result) {
        if (curr.isWord)
            result.add(curr.prefix);
        for (Character c : curr.children.keySet()) {
            findAllChildWords(curr.children.get(c), result);
        }
    }
}
