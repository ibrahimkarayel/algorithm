package com.pironix.booking.maxelement;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ikarayel on 2/26/2017.
 */
public class Solution {


    public static void main(String[] args) {

        int myArray[] = {2, 2, 7, 7, 2, 1, 5, 4, 5, 1, 1};
        int myArray2[] = {2, 3, 4, 7, 10};


        System.out.println(findCommonElement(myArray, myArray2));
    }

    /**
     * @param a
     * @param b
     * @return commonElements
     */
    public static List<Integer> findCommonElement(int[] a, int[] b) {

        List<Integer> commonElements = new ArrayList<Integer>();

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    //Check if the list already contains the common element
                    if (!commonElements.contains(a[i])) {
                        //add the common element into the list
                        commonElements.add(a[i]);
                    }
                }
            }
        }
        return commonElements;
    }
}


