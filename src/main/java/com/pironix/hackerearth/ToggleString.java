package com.pironix.hackerearth;

import java.util.Scanner;

/**
 * Created by ikarayel on 1/9/2017.
 */
public class ToggleString {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String str = s.next();
        String res = findToggle(str);
        System.out.println(res);

    }

    private static String findToggle(String str) {
        if (str == null || str.length() <= 0)
            return null;
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            byte b = (byte) str.charAt(i);

            if (b >= 97 && b <= 122) {

                buffer.append(Character.toUpperCase((char) b));
            } else if (b >= 65 && b <= 90) {
                buffer.append(Character.toLowerCase((char) b));
            } else
                return null;
        }
        return buffer.toString();
    }
}
