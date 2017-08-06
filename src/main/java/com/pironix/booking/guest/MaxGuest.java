package com.pironix.booking.guest;

/**
 * Created by ikarayel on 4/3/2017.
 *
 * @author ibrahim KARAYEL
 */
public class MaxGuest {

    public static void main(String[] args) {
        int[] checkIn = {1, 2, 10, 5, 5};
        int[] checkOut = {4, 5, 12, 9, 12};

        System.out.println("Day: " + getDay(checkIn, checkOut));
    }

    private static int getDay(int[] checkIn, int[] checkOut) {
        int max = 0;
        int currMax = 0;
        int day = -1;

        int i = 0, j = 0;
        while (i < checkIn.length && j < checkOut.length) {
            if (checkIn[i] <= checkOut[j]) {
                currMax++;
                i++;
                if (max < currMax) {
                    max = currMax;
                    day = checkIn[max];
                }
            } else {
                currMax--;
                j++;
            }
        }
        System.out.println("Max :" + max);
        return day;
    }
}
