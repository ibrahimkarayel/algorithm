package com.pironix.hackerrank.peak;

import java.util.Scanner;


/**
 * The Peak One Dimension Array  Solution class
 *
 * @author ibrahim KARAYEL
 * @version 1.0
 * @sice 9/15/2016.
 * <p>
 * * An array element is peak if it is NOT smaller than its neighbors.
 * for corner elements, wee need to consider only one neighbor.
 * if array ordered asc 10 20 30 40 last element is always peak
 * if array ordered desc 10 9 8 7  first element is always peak
 * if  all elements of input array are same, every element is a peak
 */
public class PeakOneD {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter number of numbers:");
        int n = scanner.nextInt();
        if (n < 2)
            return;
        int[] numbs = new int[n];
        for (int i = 0; i < n; i++) {
            numbs[i] = scanner.nextInt();
        }
        System.out.println("**********************slow*****************:");
        System.out.println(peakSimple(numbs));

        System.out.println("**********************fast*****************:");
        System.out.println(peakFast(numbs, 0, numbs.length));

        System.out.println("**********************slow all*****************:");
        for (int in : peakAllSimple(numbs))
            if (n > 0)
                System.out.print(in + " ");

    }

    /**
     * @param numbs given array
     * @return Return only one peak element
     */
    public static int peakSimple(int[] numbs) {
        for (int i = 0; i < numbs.length; i++) {
            if (i == 0 && numbs[i] >= numbs[i + 1]) {
                return numbs[i];
            } else if (i == numbs.length - 1 && numbs[i] >= numbs[i - 1]) {
                return numbs[i];
            } else if (i > 0 && (numbs[i] >= numbs[i - 1] && numbs[i] >= numbs[i + 1]))
                return numbs[i];
        }
        return 0;
    }

    /**
     * @param numbs given array
     * @return Return all  peak elements
     */
    public static int[] peakAllSimple(int[] numbs) {
        int peaks[] = new int[numbs.length];
        int k = 0;
        for (int i = 0; i < numbs.length; i++) {
            if (i == 0 && numbs[i] >= numbs[i + 1]) {
                peaks[k++] = numbs[i];
            } else if (i == numbs.length - 1 && numbs[i] >= numbs[i - 1]) {
                peaks[k++] = numbs[i];
            } else if (i > 0 && (numbs[i] >= numbs[i - 1] && numbs[i] >= numbs[i + 1]))
                peaks[k++] = numbs[i];
        }
        return peaks;
    }

    /**
     * @param numbs given array
     * @param start start element index
     * @param end   last element index
     * @return Return only one peak element
     */
    public static int peakFast(int[] numbs, int start, int end) {
        int mid = (start + end) / 2;
        if (mid > 0 && numbs[mid - 1] > numbs[mid]) {
            return peakFast(numbs, start, mid - 1);
        } else if (mid < numbs.length - 1 && numbs[mid] < numbs[mid + 1]) {
            return peakFast(numbs, mid + 1, end);
        }
        return numbs[mid];
    }

}
