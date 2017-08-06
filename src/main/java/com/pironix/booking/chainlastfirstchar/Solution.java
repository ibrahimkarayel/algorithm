package com.pironix.booking.chainlastfirstchar;

import java.util.*;

/**
 * Created by ikarayel on 2/11/2017.
 *
 * @author ibrahim KARAYEL
 *         The input is a list of names in random order.
 *         We need a function that chains elements of the
 *         list in such a way that the last character of an name is the same as the first one of the next name.
 *         <p>
 *         For instance:
 *         <p>
 *         Input: ["Raymond", "Nora", "Daniel", "Louie", "Peter", "Esteban"]
 *         Output: ["Peter", "Raymond", "Daniel", "Louie", "Esteban", "Nora"]
 *         There should be only one solution, so the first element is unique.
 */
public class Solution {

    /**
     * Raymond Nora Daniel Louie Peter Esteban
     *
     * @param args
     */
    public static void main(String[] args) {
       /* Scanner in = new Scanner(System.in);
        System.out.println("Please enter names size");
        int size = in.nextInt();
        String[] names = new String[size];
        for (int i = 0; i < size; i++) {
            names[i] = in.next();
            System.out.println(names[i]);
        }
*/
        //String[] names = {"Raymond", "Nora", "Daniel", "Louie", "Peter", "Esteban"};
        String[] names = {"Mehmet", "Ali", "Ibrahim"};
        System.out.println("************************************");
        String[] result = chainNames(names);
        Arrays.stream(result).forEach(num -> System.out.println(num));
    }

    private static String[] chainNames(String[] names) {
        Map<Character, String> first = new HashMap<>();
        Set<Character> last = new HashSet<>();
        for (String name : names) {
            char ch = name.charAt(0);
            first.put(ch, name);
            ch = name.toUpperCase().charAt(name.length() - 1);
            last.add(ch);
        }


        // Find the head of the sequence
        // If first character of a name does not appear in last-character list then that name must be the head
        String head = null;
        for (String name : names) {
            char firstChar = name.charAt(0);
            if (!last.contains(firstChar)) {
                head = name;
                break;
            }
        }

        Map<String, String> backtracking = new HashMap<>(); // for a sequence name_i, name_j: map[name_j] -> name_i
        String tail = head;
        char lastChar = tail.toUpperCase().charAt(tail.length() - 1);
        while (first.containsKey(lastChar)) {
            // If we have a name whose first character is equal to the current chain last character

            String name = first.get(lastChar);

            // Point the new name to its previous (which is tail)
            backtracking.put(name, tail);

            // Set the new name as the new tail
            tail = name;

            // Remove new name from map
            first.remove(lastChar);


            // Get last character of the new tail
            lastChar = tail.toUpperCase().charAt(tail.length() - 1);
        }

        String[] ans = new String[names.length];
        int cursor = ans.length - 1;
        ans[cursor] = tail;
        cursor--;
        while (tail != null) {
            String prev = backtracking.get(tail);
            if (prev != null) {
                ans[cursor] = prev;
                cursor--;
            }
            tail = prev;
        }

        return ans;
    }


}
