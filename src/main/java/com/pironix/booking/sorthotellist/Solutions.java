package com.pironix.booking.sorthotellist;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * Created by ikarayel on 2/12/2017.
 */

/**
 * Sort hotel list challenge
 * Problem statement
 * Given a set of hotels and its guests reviews, sort the hotels
 * based on a list of words specified by a user. The criteria to sort
 * the hotels should be how many times the words specified by the user is
 * mentioned in the hotel reviews.
 * <p>
 * Input
 * The first line contains a space-separated set of words which
 * we want to find mentions in the hotel reviews.
 * <p>
 * The second line contains one integer M, which is the number of reviews.
 * <p>
 * This is followed by M+M lines, which alternates an hotel ID and a review belonging to that hotel.
 * <p>
 * Output
 * A list of hotel IDs sorted, in descending order, by how many mentions
 * they have of the words specified in the input.
 * <p>
 * Notes
 * – The words to be find will always be singe words line ‘breakfast’ or ‘noise’.
 * Never double words like ‘swimming pool’.
 * – Hotel ud is a 4-byte integer.
 * – Words match should be case-insensitive.
 * – Dots and commas should be ignored.
 * – If a word appears in a review twice, it should count twice.
 * – If two hotels have the same number of mentions, they should be sorted
 * in the output based on their ID, smallest ID first.
 * – In case one or more test cases time out, consider revisiting the runtime
 * complexity of your algorithms.
 */
public class Solutions {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("input001.txt");
        Scanner in = new Scanner(file);
/*
        Scanner in = new Scanner(System.in);
*/


        String[] words = in.nextLine().split(" ");
        Set<String> dict = new HashSet<>();
        for (String word : words) {
            dict.add(word.toLowerCase());
        }

        int m = in.nextInt();

        Map<Integer, Integer> hotel2count = new HashMap<>();
        for (int i = 0; i < m; i++) {
            int id = Integer.parseInt(in.next());
            in.nextLine();

            if (!hotel2count.containsKey(id)) {
                hotel2count.put(id, 0);
            }

            String[] review = in.nextLine().split(" ");
            for (String word : review) {
                // Remove any ' ', ',', '.', '!' or '?' from word
                word = word.replaceAll("[$,.!?]", "").toLowerCase();
                if (dict.contains(word)) {
                    hotel2count.put(id, hotel2count.get(id) + 1);
                }
            }
        }

        List<Map.Entry<Integer, Integer>> sorted = new ArrayList(hotel2count.entrySet());
        Collections.sort(sorted, (o1, o2) -> {
            if (o1.getValue() == o2.getValue()) {
                return o1.getKey() - o2.getKey();
            } else {
                return o2.getValue() - o1.getValue();
            }
        });


        for (Map.Entry<Integer, Integer> hotelEntry : sorted) {
            System.out.print(hotelEntry.getKey() + " ");
        }
    }
}
