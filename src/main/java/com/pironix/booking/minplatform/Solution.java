package com.pironix.booking.minplatform;

/**
 * Created by ikarayel on 2/10/2017.
 */

/**
 * Min Number of Platforms Required for a Railway Station
 * <p>
 * At a bus-station, you have time-table for buses arrival and departure. You need to find the minimum number of platforms so that all the buses can be placed as per their schedule.
 * <p>
 * For example consider the above example.
 * <p>
 * arr[] = {9:00, 9:40, 9:50, 11:00, 15:00, 18:00}
 * dep[] = {9:10, 12:00, 11:20, 11:30, 19:00, 20:00}
 * <p>
 * All events sorted by time.
 * <p>
 * Total platforms at any time can be obtained by subtracting total departures from total arrivals by that time.
 * <p>
 * Time     Event Type     Platforms
 * 9:00       A                1
 * 9:10       D                0
 * 9:40       A                1
 * 9:50       A                2
 * 11:00      A                3
 * 11:20      D                2
 * 11:30      D                1
 * 12:00      D                0
 * 15:00      A                1
 * 18:00      A                2
 * 19:00      D                1
 * 20:00      D                0
 */
public class Solution {


    public static void main(String[] args) {
        double arr[] = {9.00, 9.40, 9.50, 11.00, 15.00, 18.00};
        double dep[] = {9.10, 12.00, 11.20, 11.30, 19.00, 20.00};


        System.out.println(findPlatform(arr, dep, arr.length));
        System.out.println(findPlatform2(arr, dep, arr.length));

        System.out.println("*****************************************");
        double arrival[] = {1.00, 1.40, 1.50, 2.00, 2.15, 4.00};
        double departure[] = {1.10, 3.00, 2.20, 2.30, 3.15, 6.00};

        System.out.println(findPlatform(arrival, departure, arrival.length));
        System.out.println(findPlatform2(arrival, departure, arrival.length));

    }


    public static int findPlatform2(double[] arr, double[] dep, int n) {
        int i = 1, j = 0;
        int result = 1;
        int need = 1;

        while (i < n && j < n) {
            if (arr[i] < dep[j]) {
                need++;
                if (need > result) {
                    result = need;
                }
                i++;
            } else {
                need--;
                j++;
            }
        }

        return result;
    }


    public static int findPlatform(double arr[], double dep[], int n) {
        int platform_needed = 1, result = 1;
        int i = 1, j = 0;

        // Similar to merge in merge sort to process all events
        while (i < n && j < n) {
            if (arr[i] < dep[j]) {
                platform_needed++;
                i++;
                if (platform_needed > result)  // Update result if needed
                    result = platform_needed;
            } else {// Else decrements count of platforms needed
                platform_needed--;
                j++;
            }
            System.out.print(platform_needed + " ");
        }
        System.out.println("\n**************************************************");
        return result;
    }
}
