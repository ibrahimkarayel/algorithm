package com.pironix.codegeeks;

/**
 * Created by ikarayel on 3/5/2017.
 * <p>
 * Power Set Power set P(S) of a set S is the set of all subsets of S.
 * For example S = {a, b, c} then P(s) = {{}, {a}, {b}, {c}, {a,b}, {a, c}, {b, c}, {a, b, c}}.
 * <p>
 * If S has n elements in it then P(s) will have 2^n elements
 * <p>
 * Input: Set[], set_size
 * 1. Get the size of power set
 * powet_set_size = pow(2, set_size)
 * 2  Loop for counter from 0 to pow_set_size
 * (a) Loop for i = 0 to set_size
 * (i) If ith bit in counter is set
 * Print ith element from set for this subset
 * (b) Print seperator for subsets i.e., newline
 * <p>
 * Set  = [a,b,c]
 * power_set_size = pow(2, 3) = 8
 * Run for binary counter = 000 to 111
 * <p>
 * Value of Counter            Subset
 * 000                    -> Empty set
 * 001                    -> a
 * 011                    -> ab
 * 100                     -> c
 * 101                     -> ac
 * 110                     -> bc
 * 111                     -> abc
 */
public class PowerSet {

    private static void printPowerSet(char[] set, int set_size) {
    /*set_size of power set of a set with set_size
      n is (2**n -1)*/
        int total = 1 << set_size;


    /*Run from counter 000..0 to 111..1*/
        for (int i = 0; i < total; i++) {
            for (int j = 0; j < set_size; j++) {
          /* Check if jth bit in the counter is set
             If set then pront jth element from set */
                if (((i >> j) & 1) == 1) {
                    System.out.print(set[j]);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        char set[] = {'a', 'b', 'c'};
        printPowerSet(set, 3);
    }

}
