package com.pironix.leetcode.kmost;

import java.util.*;

/**
 * Created by ikarayel on 4/2/2017.
 * <p>
 * Given a list of string , write a funk to find the k most frequently recurring string
 * <p>
 * if we use hasMap<String,Integer> sort by key and sort (nlogn)
 * if we use threeMap<String,Integer> sort by key and sort (nlogn) re-sort every time
 */
public class KmostFrequently {

    public static void main(String[] args) {
        String[] strings = {"a", "a", "b"};
        System.out.println(kMost(strings, 1));
    }

    private static String kMost(String[] inputs, int key) {

        Map<String, Integer> map = new HashMap<>();
        for (String input : inputs) {

            if (map.containsKey(input)) {
                map.put(input, map.get(input) + 1);
            } else {
                map.put(input, 1);

            }

        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, (o1, o2) -> o2.getValue() - o1.getValue());

        if (list.size() > key)
            return list.get(key).getKey();
        return null;

    }
}

