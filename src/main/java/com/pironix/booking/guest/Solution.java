package com.pironix.booking.guest;

import java.util.Arrays;

/**
 * Created by ikarayel on 2/10/2017.
 *
 * @author ibrahim KARAYEL
 *         <p>
 *         Consider a hotel where the guest is checked in and check out.
 *         Find a day when the maximum number of guests stay in a hotel.
 *         example:
 *         Input :
 *         [
 *         {check-in : 1, check-out 4},
 *         {check-in : 2, check-out 5},
 *         {check-in : 10, check-out 12},
 *         {check-in : 5, check-out 9},
 *         {check-in : 5, check-out 12}
 *         ]
 *         Output : 5
 */
public class Solution {


    public static void main(String[] args) {
        int checkIN[] = {1, 2, 10, 5, 5};
        int checkOut[] = {4, 5, 12, 9, 12};
        Arrays.sort(checkIN);
        Arrays.sort(checkOut);

        System.out.println(Arrays.toString(checkIN));
        System.out.println(Arrays.toString(checkOut));


        System.out.println(findMaxGuest(checkIN, checkOut, checkIN.length));

    }

    public static int findMaxGuest(int checkIn[], int checkOut[], int n) {

        int count = 1; // first person checked in
        int i = 1; // to traverse checkIn
        int j = 0; // to traverse checkOut
        int max = 0;
        int day;

        while (i < n && j < n) {

            if (checkIn[i] <= checkOut[j]) {
                count++;
                i++;
                if (count > max) {
                    max = count;
                }
            } else {
                count--;
                j++;
            }

        }
        day = checkIn[count];
        return day;
    }
}
