package com.pironix.leetcode.removedup;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by ikarayel on 3/5/2017.
 */
public class RemoveDup {

    public static void main(String... args) {
        Set<Integer> set = new HashSet();
        Set<Integer> setLink = new LinkedHashSet<>();

        set.add(1);
        set.add(1);
        set.add(0);
        set.add(1);
        set.add(5);
        set.add(5);
        set.add(2);
        set.add(9);
        set.add(11);
        set.add(10);
        set.add(20);
        set.add(12);
        set.add(10);


        setLink.add(1);
        setLink.add(1);
        setLink.add(0);
        setLink.add(1);
        setLink.add(5);
        setLink.add(5);
        setLink.add(2);
        setLink.add(9);
        setLink.add(11);
        setLink.add(10);
        setLink.add(20);
        setLink.add(12);
        setLink.add(10);

        System.out.println("Set");
        set.forEach(in -> System.out.print(in + " "));

        set.forEach(System.out::print);
        System.out.println("\nLinkedSet");
        setLink.forEach(in -> System.out.print(in + " "));


    }
}
