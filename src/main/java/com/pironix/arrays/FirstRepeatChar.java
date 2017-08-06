package com.pironix.arrays;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by ikarayel on 5/1/2017.
 * <p>
 * Given a string, write an algo­rithm to find the first repeat­ing char­ac­ter in it.
 * <p>
 * Ex:String input = "horizon tutorials"
 * Output: 'o'
 * <p>
 * String input = "algorithms"
 * Output: No repeating character found.
 *
 * @author ibrahim KARAYEL
 */
public class FirstRepeatChar {

    public static void main(String[] args) {

        String input = "horizon tutorials";
        findFirstRepeatChar(input);
        findFirstRepeatCharSet(input);

        System.out.println("*********************");
        input = "algorithms";
        findFirstRepeatChar(input);
        findFirstRepeatCharSet(input);

    }


    /**
     * Naive approach
     * Time complexity is O(N^2).
     *
     * @param input
     */
    private static void findFirstRepeatChar(String input) {
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    System.out.println(chars[i]);
                    return;
                }

            }
        }
    }

    /**
     * Time complexity is O(N)
     * Space complexity is O(N)
     *
     * @param input
     */
    private static void findFirstRepeatCharSet(String input) {
        Set<Character> characters = new HashSet<>();
        for (Character in : input.toCharArray()) {
            if (characters.contains(in)) {
                System.out.println(in);
                return;
            } else {
                characters.add(in);
            }
        }
    }
}
