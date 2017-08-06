package com.pironix.uber;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * The MoveZeroes Solution class
 *
 * @author ibrahim KARAYEL
 * @version 1.0
 *          11/19/2016.
 */
public class MoveZeroes {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter array size");

        int size = scanner.nextInt();
        int[] arrZeroes = new int[size];
        System.out.println("please enter your numbers");
        for (int i = 0; i < size; i++) {
            arrZeroes[i] = scanner.nextInt();
        }
        System.out.println(moveZeroesToEnd(arrZeroes));

    }

    public static List<Integer> moveZeroesToEnd(int[] original) {
        List<Integer> tmp = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < original.length; i++) {
            if (original[i] != 0) {
                tmp.add(original[i]);
            } else {
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            tmp.add(0);
        }

        return tmp;

    }
}
