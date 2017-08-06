package com.pironix.wallethub;

import java.util.*;

/**
 * The Complementary Pair class
 * Created by ikarayel on 1/21/2017.
 *
 * @author ibrahim KARAYEL
 */
public class ComplementaryPairs {


    public static void main(String args[]) {
        printPair(getRandomArray(9, -5, 15), 11);
        printPair(getRandomArray(10, 0, 15), 12);
    }


    /*
     Need additional space O(n) could be problem if array is very large (not in-place)
     N iterate through array and insert values
     in a Set Collection   add() contains() both takes O(1) complexity.
     So total complexity of solution would be O(N).

         Does not count all distinct pairs with difference equal to k
        if you want this Insert all distinct elements of arr[] in a  hash map
        ignore an element if already present in the hash map.

     In-Place Solution
     An efficient in-place solution would be to sort the array and use two pointers to scan through array from both direction
     The complexity of this sorting  solution would be O(NlogN) due to sorting
     */

    /**
     * Given an array of integers finds two elements in the array whose sum is equal to n.
     * <p>
     * * @param numbers
     * * @param n
     */

    public static void findPairs(int[] numbers, int n) {
        if (numbers.length < 2) {
            throw new IllegalArgumentException("number size must be greater than 2 ");
        }
        Set<Integer> set = new HashSet(numbers.length);
        Map<Integer, Integer> map = new HashMap<>();
        for (int value : numbers) {
            int target = n - value;
            if (!set.contains(target)) {
                set.add(value);
            } else {
                System.out.printf("(%d, %d) %n", value, target);
                //result.add(String.format("(%d, %d) %n", value, target));
            }
        }
    }


    /**
     * Utility method to find two elements in an array that sum to k.
     *
     * @param random random int array
     * @param k      Complementary Pair Sum
     */
    public static void printPair(int[] random, int k) {
        System.out.println("Random Integers : " + Arrays.toString(random));
        System.out.println("Complementary pairs with : " + k);
        findPairs(random, k);
    }


    /**
     * Utility method to return random array of Integers in a given range
     *
     * @param limit returned array size
     * @param low   min value
     * @param high  max value
     * @return
     */
    public static int[] getRandomArray(int limit, int low, int high) {
        if (low >= high) {
            throw new IllegalArgumentException("max must be greater than min");
        }
        if (limit < 2) {
            throw new IllegalArgumentException("limit must be greater than 2");
        }
        return new Random().ints(limit, low, high).toArray();
    }


}
