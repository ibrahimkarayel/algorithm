package com.pironix.hackerrank.camelCase;

import java.util.Scanner;

/**
 * The CamelCase solutions class
 *
 * @author ibrahim KARAYEL
 * @version 1.0
 * @sice 9/10/2016
 */
public class CamelCase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(writeCamelCase(s));

    }

    public static int writeCamelCase(String str) {
        if (str == null || str.isEmpty())
            return 0;
        int c = 0;
        for (String w : str.split("(?<!(^|[A-Z]))(?=[A-Z])|(?<!^)(?=[A-Z][a-z])")) {
            c++;
        }
        return c;
    }
}
