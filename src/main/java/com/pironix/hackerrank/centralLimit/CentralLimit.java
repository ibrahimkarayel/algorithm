package com.pironix.hackerrank.centralLimit;

import java.util.Scanner;

/**
 * The Central Limit Solution class
 *
 * @author ibrahim KARAYEL
 * @version 1.0
 * @sice 9/12/2016
 */
public class CentralLimit {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int maxWeight = scan.nextInt();
        int nBoxes = scan.nextInt();
        int meanWeight = scan.nextInt();
        int sDeviation = scan.nextInt();

        double result = cdf(nBoxes * meanWeight, Math.sqrt(nBoxes) * sDeviation, maxWeight);
        System.out.println(String.format("%.4f", result));

    }

    public static double cdf(double mu, double sigma, double x) {
        return 0.5 * (1 + erf((x - mu) / (sigma * Math.sqrt(2))));
    }

    public static double erf(double z) {
        double t = 1.0 / (1.0 + 0.5 * Math.abs(z));
        double ans = 1 - t * Math.exp(-z * z - 1.26551223 + t *
                (1.00002368 + t * (0.37409196 + t * (0.09678418 + t *
                        (-0.18628806 + t * (0.27886807 + t * (-1.13520398 + t *
                                (1.48851587 + t * (-0.82215223 + t * (0.17087277))))))))));
        if (z >= 0) return ans;
        else return -ans;
    }

}
