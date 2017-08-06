package com.pironix.wallethub;

import java.util.Scanner;

/**
 * The Palindrome class
 * Created ibrahim on 1/21/2017.
 *
 * @author ibrahim KARAYEL
 */
public class Palindrome {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (!input.equals("q")) {
            System.out.println("Please enter a string or [-> q to quit]");
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("q")) {
                System.out.println("By By");
                return;
            }
            System.out.println(isPalindrome(input));
        }


    }

    /**
     * isPalindrome function  check string is palindrome or not
     * If n is even, it performs [n/2] comparisons
     * If n is odd, it performs ​​[n−1/2] comparisons.
     * Time: In the worst case, when the word is a palindrome, this algorithm performs [n/2]inequality comparisons.
     * Complexity: O(N)
     * Space: Constant
     * <p></p>
     * ignoring capitalization but does not ignoring whitespace , punctuation and special chars
     * <p></p>
     * for ignoring whitespace, punctuation and special chars like ( * ? = ' ) add
     * str=str.replaceAll("[^\\p{IsAlphabetic}^\\p{IsDigit}]", "") before the for loop
     *
     * @param str input string
     * @return <code>true</code> if the string palindrome ;<code>false</code> otherwise
     */
    public static boolean isPalindrome(String str) {
        int n = str.length();
        for (int i = 0; i < n / 2; ++i) {
            if (Character.toLowerCase(str.charAt(i)) !=
                    Character.toLowerCase(str.charAt(n - i - 1))) return false;
        }
        return true;
    }

}
