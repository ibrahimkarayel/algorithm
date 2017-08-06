package com.pironix.arrays;

import java.util.*;

/**
 * Created by ikarayel on 5/1/2017.
 * <p>
 * Given a list of names ( first name and last name), sort the list by their last names.
 *
 * @author ibrahim KARAYEL
 */
public class SortNamesByLastName {

    public static void main(String[] args) {
        String[] list = {"Daenerys Targaryen", "Jon Snow", "Tyrion Lannister", "Joffrey Baratheon"};
        sortByLastName(list);
    }

    private static void sortByLastName(String[] fullNames) {

        Map<String, String> fulNameMap = new HashMap<>();
        for (String in : fullNames) {
            String[] full = in.split(" ");
            fulNameMap.put(full[0], full[1]);

        }
        List<Map.Entry<String, String>> sorted = new ArrayList(fulNameMap.entrySet());

        Collections.sort(sorted, Comparator.comparing(Map.Entry::getValue));

       /* Collections.sort(sorted, (o1, o2) -> o1.getValue().compareTo(o2.getValue()));

        Collections.sort(sorted, new Comparator<Map.Entry<String, String>>() {
            @Override
            public int compare(Map.Entry<String, String> o1, Map.Entry<String, String> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
*/
        for (Map.Entry<String, String> in : sorted) {
            System.out.println(in.getKey() + " " + in.getValue());
        }
    }
}
