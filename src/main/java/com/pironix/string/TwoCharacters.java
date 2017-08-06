package com.pironix.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by ikarayel on 3/3/2017.
 */
public class TwoCharacters {

    public static void main(String[] args) throws IllegalAccessException {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        String s = in.next();
        System.out.print(removeTwoChar(s, len));
    }

    public static int removeTwoChar(String str, int n) throws IllegalAccessException {

        if (str.length() != n)
            throw new IllegalAccessException("Wrong param");
        if (str.length() == 1)
            return 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                str = str.replaceAll(String.valueOf(str.charAt(i)), "");
                i = 0;
            }

        }
        Map<Character, Integer> map = new HashMap();
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), map.get(str.charAt(i) + 1));
            } else map.put(str.charAt(i), +1);

        }


        return str.length();
    }
}
