package com.pironix.string;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by ikarayel on 3/3/2017.
 */
public class CheckDuplicate {

    public static void main(String[] args) {

        System.out.println(checkDuplicate("ibrahim"));
        System.out.println(checkDuplicate("abcde "));
        System.out.println(checkDuplicate("melihim"));
        System.out.println(checkDuplicate("fatMA"));
    }

    private static boolean checkDuplicate(String str) {
        Set<Character> characterSet = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (characterSet.contains(ch)) {
                return true;
            } else {
                characterSet.add(ch);
            }
        }
        return false;
    }
}
