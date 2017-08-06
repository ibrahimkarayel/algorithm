package com.pironix.booking.listword;

import java.util.HashMap;

/**
 * Created by ikarayel on 3/28/2017.
 */
public class ListWord {

    public static void main(String[] args) throws java.lang.Exception {
        String arr[] = {"aca", "hello", "world", "cat", "sdb", "acacabcatghhellomvnsdb"};
        String input = "acacabcatghhellomvnsdb";

        HashMap<String, Integer> map = new HashMap<>();
        // put all words into map - O(l)
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], 0);
            int len = arr[i].length();
            int j = input.indexOf(arr[i].charAt(0));
            while (j < input.length()) {
                try {
                    String str = input.substring(j, len + j);
                    if (str.equals(arr[i])) {
                        map.put(str, map.get(str) + 1);
                    }

                } catch (StringIndexOutOfBoundsException e) {

                }
                j++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " : " + map.get(arr[i]));
        }

    }
}
