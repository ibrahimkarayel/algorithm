package com.pironix.hackerrank.circulararray;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by ikarayel on 9/12/2016.
 */
public class CircularArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        String[] nums = scanner.nextLine().split(" ");


        if (inputs.length < 3)
            return;

        List<String> numLink = new LinkedList<>(Arrays.asList(nums));


    }

    public static List<String> shiftArr() {
        return null;
    }

}
