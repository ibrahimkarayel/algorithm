package com.pironix.hackerrank.collatz;

import java.util.*;

/**
 * Created by ikarayel on 12/10/2016.
 */
public class CollatzChallenge {

    public static void main(String[] args) {
        int start, count;
        Scanner scan = new Scanner(System.in);

        count = scan.nextInt();
        for (int i = 0; i < count; i++) {
            start = scan.nextInt();
            System.out.println(getMaxChain(start));
        }

       /* System.out.println(longestChain(start));
        System.out.println(longestChain(start).size());*/


    }

    public static int getMaxChain(int key) {
        Map<Integer, Integer> resultMap = new HashMap<>();
        for (int i = 1; i <= key; i++) {
            //System.out.printf("i:"+i +" longestChain: "+longestChain(i).size());
            resultMap.put(i, longestChain(i).size());
        }
        List<Map.Entry<Integer, Integer>> aList = new ArrayList<>();
        Collections.sort(aList, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> e1,
                               Map.Entry<Integer, Integer> e2) {
                return e2.getValue() - e1.getValue();

            }
        });

        return aList.get(0).getKey();

    }

    public static List<Integer> longestChain(int start) {
        List<Integer> chain = new ArrayList<>();
        if (start <= 0)
            throw new IllegalArgumentException("Chain must start by positive number");

        chain.add(start);
        while (start != 1) {

            if (start % 2 == 0) {
                start = start / 2;
            } else {
                start = start * 3 + 1;
            }
            chain.add(start);
        }
        return chain;

    }
}
