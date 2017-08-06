package com.pironix.booking.wc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * Created by ikarayel on 3/11/2017.
 */
public class WordCount {
    public static void main(String[] args) {

        File file = new File("wc.txt");

        try (Scanner scanner = new Scanner(file)) {

            Map<String, Integer> map = new HashMap<>();


            while (scanner.hasNextLine()) {
                String[] words = scanner.nextLine().split(" ");

                for (String in : words) {
                    if (!map.containsKey(in)) {
                        map.put(in, 1);
                    } else {
                        map.put(in, map.get(in) + 1);
                    }
                }
            }

            List<Map.Entry<String, Integer>> sort = new ArrayList(map.entrySet());
            Collections.sort(sort, (o1, o2) -> o2.getValue() - o1.getValue());

            for (Map.Entry<String, Integer> hotelEntry : sort) {
                System.out.println(hotelEntry.getKey() + " " + hotelEntry.getValue());
            }
            System.out.println("*******************************************");
            printMap(map);


        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }


    static void printMap(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> wordEntry : map.entrySet()) {
            System.out.println(wordEntry.getKey() + " -> " + wordEntry.getValue());
        }
    }
}
