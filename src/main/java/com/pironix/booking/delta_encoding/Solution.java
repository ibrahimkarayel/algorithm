package com.pironix.booking.delta_encoding;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by ikarayel on 2/11/2017.
 *
 * @author ibrahim KARAYEL
 *         <p>
 *         Problem
 *         <p>
 *         Given a list of numbers, e.g.:
 *         <p>
 *         25626 25757 24367 24267 16 100 2 7277
 *         Output a delta encoding for the sequence. In a delta encoding, the first element is reproduced as is.
 *         Each subsequent element is represented as the numeric difference from the element before it.
 *         E.g. for the sequence above, the delta encoding would be:
 *         <p>
 *         25626 131 -1390 -100 -24251 84 -98 7275
 *         However, if a difference value does not fit in a single signed byte, i.e. -127 <= x <= 127, then,
 *         instead of the difference, we would like to use an escape token, printing it.
 *         <p>
 *         This will denote that the value following the escape token is a full four-byte difference value, rather than a one-byte different value.
 *         <p>
 *         For this exercise, we'll declare -128 as the escape token.
 *         <p>
 *         Following the same example above, the final result would be:
 *         <p>
 *         25626 -128 131 -128 -1390 -100 -128 -24251 84 -98 -128 7275
 */

public class Solution {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> inputs = new ArrayList<>();

        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            inputs.add(num);
        }
        List<Integer> items = delta(inputs);
        items.forEach(item -> System.out.print(item + " "));
    }

    public static List<Integer> delta(List<Integer> inputs) {
        List<Integer> ints = new ArrayList<>();
        ints.add(inputs.get(0));
        for (int i = 1; i < inputs.size(); i++) {
            int num = inputs.get(i) - inputs.get(i - 1);
            if (num > 127 || num < -127) {
                ints.add(-128);
                ints.add(num);
            } else {
                ints.add(num);
            }

        }
        return ints;
    }
}