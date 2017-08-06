package com.pironix.booking.smartsubstr;

/**
 * Created by ibrahim KARAYEL on 4/3/2017.
 * <p>
 * "Smart substring"
 * Write a function that takes maximum 30 characters from a string but without cutting the words.
 * <p>
 * "Featuring stylish rooms and moorings for recreation boats, Room Mate Aitana is a designer hotel built in 2013 on an island in the IJ River in Amsterdam."
 * <p>
 * First 30 characters:
 * "Featuring stylish rooms and mo"
 * <p>
 * Smarter approach (max 30 characters, no words are broken):
 * "Featuring stylish rooms and"
 */
public class SmartSubString {

    public static void main(String[] args) {
        String s = "Featuring boats, Room Mate Aitana is a designer hotel built in 2013 on an island in the IJ River in Amsterdam.";
        System.out.println("Smart Sub String: " + findSmartSubString(s.substring(0, 30).toString()));
        s = "Featuring stylish rooms and moorings for recreation boats, Room Mate Aitana is a designer hotel built in 2013 on an island in the IJ River in Amsterdam";
        System.out.println("Smart Sub String: " + findSmartSubString(s.substring(0, 30).toString()));
    }

    private static String findSmartSubString(String s) {
        for (int i = s.length() - 1; i > 0; i--) {
            if (s.charAt(i) == ' ' || s.charAt(i) == '.' || s.charAt(i) == ',') {
                return s.substring(0, i);
            }
        }
        return s;
    }
}
