package com.pironix.hackerrank.voting;

import java.util.*;

/**
 * The Voting Solution class
 *
 * @author ibrahim KARAYEL
 * @version 1.0
 * @sice 9/11/2016
 */
public class VotingSolution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter number of votes");
        int n = scanner.nextInt();
        Map<String, Integer> voteMap = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String name = scanner.next();
            if (voteMap.containsKey(name)) {

                voteMap.put(name, voteMap.get(name).intValue() + 1);
            } else {
                voteMap.put(name, 1);
            }
        }

        System.out.println(winner(voteMap));

    }

    public static String winner(Map<String, Integer> voteMap) {
      /*  for (Map.Entry<String, Integer> entry : voteMap.entrySet()) {
            System.out.print(entry.getKey() + " " + entry.getValue() +" ");
        }*/
        List<Map.Entry<String, Integer>> aList = new ArrayList<>(voteMap.entrySet());
/*
        Collections.sort(aList, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> e1,
                               Map.Entry<String, Integer> e2) {
                return e2.getValue().compareTo(e1.getValue());

            }
        });*/
        Collections.sort(aList, Comparator.comparing(Map.Entry::getValue));


        System.out.println(aList);
        return aList.get(aList.size() - 1).getKey();
    }
}
