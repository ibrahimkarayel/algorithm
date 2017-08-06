package com.pironix.hackerearth;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * The Anagram  Solution class
 *
 * @author ibrahim KARAYEL
 * @version 1.0
 *          Created by ibrahim on 1/21/2017.
 */
public class AnagramDiff {

    /**
     * @param first  String
     * @param second String
     * @return count of will be replaced for given strings
     */
    public static int numberNeeded(String first, String second) {

        char[] s1 = first.toCharArray();
        char[] s2 = second.toCharArray();

        Map<Character, Integer> map = new HashMap<>();
        for (char in : s1) {

            if (!map.containsKey(in)) {
                map.put(in, 1);
            } else {
                map.put(in, map.get(in) + 1);
            }

        }

        int sameCount = 0;
        for (char in : s2) {

            if (map.containsKey(in)) {
                sameCount++;
                if (map.get(in) > 1) {
                    map.put(in, map.get(in) - 1);
                } else {
                    map.remove(in);
                }
            }
        }
        return (s1.length + s2.length) - (2 * sameCount);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
