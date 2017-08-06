package com.pironix.reverse.reversevowel;

/**
 * Created by ikarayel on 3/28/2017.
 */
public class ReverseVowel {


    private static String vowel = "aeiouAEIOU";

    public static void main(String[] args) {

        String input = "ibram";
        String input2 = "mehmet şen";
        System.out.println(reverseVowels(input));
        System.out.println(reverseVowels(input2));

    }

    private static String reverseVowels(String input) {
        char[] inputChars = input.toCharArray();

        int left = 0;
        int right = input.length() - 1;

        while (left < right) {

            while (left < right && !vowel.contains(inputChars[left] + "")) {
                left++;
            }
            while (left < right && !vowel.contains(inputChars[right] + "")) {
                right--;
            }


            if (inputChars[left] != inputChars[right]) {
                char tmp = inputChars[left];
                inputChars[left] = inputChars[right];
                inputChars[right] = tmp;
            }
            left++;
            right--;


        }
        return String.valueOf(inputChars);
    }
}
