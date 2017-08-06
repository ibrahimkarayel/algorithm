package com.pironix.hackerrank.wallethub;

import com.pironix.wallethub.Palindrome;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * The Palindrome Test class
 * Created ibrahim on 1/21/2017.
 *
 * @author ibrahim KARAYEL
 */
public class PalindromeTest {


    private static String input1 = "1221";
    private static String input2 = "11211";
    private static String input3 = "babab";
    private static String input4 = "mam mam";
    private static String input5 = "EY Edip Adanada pide ye";
    private static String input6 = "";
    private static String input7 = "11211";
    private static String input8 = "ab ? ba";
    private static String input9 = "mam . mam";
    private static String input10 = "EY , Edip Adanada pide , ye";
    private static String input11 = "EY , 121 , ye";
    private static String input12 = "| |";

    private static String inputF1 = "25";
    private static String inputF2 = "12";
    private static String inputF3 = "12 ali";
    private static String inputF4 = "abam";
    private static String inputF5 = "mama m";


    @BeforeClass
    public static void oneTimeSetUp() throws Exception {
        System.out.println("@BeforeClass - oneTimeSetUp");


    }

    @AfterClass
    public static void oneTimeTearDown() {
        System.out.println("@AfterClass - oneTimeTearDown");
    }

    @Test
    public void isPalindrome() throws Exception {
        assertTrue(Palindrome.isPalindrome(input1));
        assertTrue(Palindrome.isPalindrome(input2));
        assertTrue(Palindrome.isPalindrome(input3));
        assertTrue(Palindrome.isPalindrome(input4));
        assertTrue(Palindrome.isPalindrome(input5));
        assertTrue(Palindrome.isPalindrome(input6));
        assertTrue(Palindrome.isPalindrome(input7));
        assertTrue(Palindrome.isPalindrome(input8));
        assertTrue(Palindrome.isPalindrome(input9));
        assertTrue(Palindrome.isPalindrome(input10));
        assertTrue(Palindrome.isPalindrome(input11));
        assertTrue(Palindrome.isPalindrome(input12));
    }

    @Test
    public void isNotPalindrome() throws Exception {
        assertFalse(Palindrome.isPalindrome(inputF1));
        assertFalse(Palindrome.isPalindrome(inputF2));
        assertFalse(Palindrome.isPalindrome(inputF3));
        assertFalse(Palindrome.isPalindrome(inputF4));
        assertFalse(Palindrome.isPalindrome(inputF5));

    }

    @Test
    public void testAlphaAndDigits() {
/*
        String alphaAndDigits = input.replaceAll("[^a-zA-Z0-9\\s]+", " ").toUpperCase();
*/
    }

}