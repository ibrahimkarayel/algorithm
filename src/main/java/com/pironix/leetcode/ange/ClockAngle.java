package com.pironix.leetcode.ange;

/**
 * Created by ikarayel on 4/4/2017.
 * <p>
 * find ange in a clock
 */
public class ClockAngle {

    public static void main(String[] args) {

    }

    private static double findClock(int hour, int minutes) {
        final double MINITUS_PER_HOUR = 60;
        final double DEGREES_PER_MINUTE = 360 / MINITUS_PER_HOUR;
        final double DEGREES_PER_HOUR = 360 / 12;

        double minuteAngele = minutes * DEGREES_PER_MINUTE;
        double hourAngle = hour * DEGREES_PER_HOUR + (minutes / MINITUS_PER_HOUR) * DEGREES_PER_HOUR;
        double diff = Math.abs(minuteAngele - hourAngle);
        if (diff > 180)
            return 360 - diff;
        return diff;
    }
}
