package com.pironix.booking.editdistance;

/**
 * Created by ikarayel on 2/26/2017.
 */

// A Naive recursive Java program to find minimum number
// operations to convert str1 to str2
public class EditDistance {


    public static void main(String args[]) {
        String str1 = "sunday";
        String str2 = "saturday";

        System.out.println(editDist(str1, str2, str1.length(), str2.length()));
        System.out.println(editDistDP(str1, str2, str1.length(), str2.length()));
    }


    static int editDist(String str1, String str2, int m, int n) {
        // If first string is empty, the only option is to
        // insert all characters of second string into first
        if (m == 0) return n;

        // If second string is empty, the only option is to
        // remove all characters of first string
        if (n == 0) return m;

        // If last characters of two strings are same, nothing
        // much to do. Ignore last characters and get count for
        // remaining strings.
        if (str1.charAt(m - 1) == str2.charAt(n - 1))
            return editDist(str1, str2, m - 1, n - 1);

        // If last characters are not same, consider all three 00000000000055555555555555555555555555555555444444444444444
        // operations on last character of first string, recursively
        // compute minimum cost for all three operations and take
        // minimum of three values.
        return 1 + Math.min(Math.min(editDist(str1, str2, m, n - 1),    // Insert
                editDist(str1, str2, m - 1, n)),   // Remove
                editDist(str1, str2, m - 1, n - 1)); // Replace


    }

    static int editDistDP(String str1, String str2, int m, int n) {
        // If first string is empty, the only option is to
        // insert all characters of second string into first
        if (m == 0) return n;

        // If second string is empty, the only option is to
        // remove all characters of first string
        if (n == 0) return m;
        int[][] editDis = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0)
                    editDis[i][j] = j;
                else if (j == 0)
                    editDis[i][j] = i;
                else if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    editDis[i][j] = editDis[i - 1][j - 1];
                } else {
                    editDis[i][j] = 1 + (Math.min(Math.min(editDis[i][j - 1], editDis[i - 1][j]), editDis[i - 1][j - 1]));
                }


            }

        }
        return editDis[m][n];

    }


}
