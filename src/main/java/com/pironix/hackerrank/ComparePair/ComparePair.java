package com.pironix.hackerrank.ComparePair;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by ikarayel on 3/28/2017.
 */
public class ComparePair {

    public static void main(String[] args) {
        List<Player> players = new ArrayList<>();
        players.add(new Player("ibrahim", 10));
        players.add(new Player("ismail", 11));
        players.add(new Player("Deniz", 8));
        players.add(new Player("Ali", 5));
        players.add(new Player("Adem", 8));
        players.add(new Player("Ayşe", 10));


        Collections.sort(players, (o1, o2) -> {
            if (o1.score == o2.score) {
                return o1.name.compareTo(o2.name);
            } else {
                return o2.score - o1.score;
            }
        });

        for (Player in : players)
            System.out.println(in.name + " " + in.score);

    }

}
