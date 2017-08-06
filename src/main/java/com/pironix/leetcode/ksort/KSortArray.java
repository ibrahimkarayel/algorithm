package com.pironix.leetcode.ksort;

import java.util.PriorityQueue;

/**
 * Created by ikarayel on 3/25/2017.
 */
public class KSortArray {

    public static void main(String[] args) {

    }

    private class QueueNode implements Comparable<QueueNode> {

        int array, index, value;

        public QueueNode(int array, int index, int value) {
            this.array = array;
            this.index = index;
            this.value = value;
        }

        @Override
        public int compareTo(QueueNode o) {
            if (value > o.value) return 1;
            if (value < o.value) return -1;
            return 0;
        }

        public int[] merge(int[][] arrays) {
            PriorityQueue<QueueNode> pq = new PriorityQueue<>();
            int size = 0;
            for (int i = 0; i < arrays.length; i++) {
                size += arrays[i].length;
                if (arrays[i].length > 0) {
                    pq.add(new QueueNode(i, 0, arrays[i][0]));
                }
            }

            int[] result = new int[size];
            for (int i = 0; !pq.isEmpty(); i++) {
                QueueNode n = pq.poll();
                result[i] = n.value;
                int newIndex = n.index + 1;

                if (newIndex < arrays[n.array].length) {
                    pq.add(new QueueNode(n.array, newIndex, arrays[n.array][newIndex]));
                }
            }
            return result;
        }

    }
}
