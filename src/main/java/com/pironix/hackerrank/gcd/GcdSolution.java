package com.pironix.hackerrank.gcd;

/**
 * The Great common divisor Solution class
 * <p>
 * Created  on 9/12/2016
 * </p>
 *
 * @author ibrahim KARAYEL
 * @version 1.0
 */
public class GcdSolution {

    public static void main(String[] args) {
 /*       System.out.println(gcdRecursive(10, 20));
        System.out.println(gcd2(12, 25));
        System.out.println(gcd3(12, 16));*/

        System.out.println(gcdRecursive(12,20));
       /* for (int i = 0; i < 100; i++) {
            System.out.println(i + " ve " + (i + 5) + "->" + gcd2(i, i + 5));
        }*/
    }

    public static int gcdRecursive(int a, int b) {
        if (b == 0)
            return a;
        if (a==0)
            return b;
        return gcdRecursive(b, a % b);
    }



    public static int gcd2(int a, int b) {
        int tmp;
        while (b != 0) {
            tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    public static int gcd3(int a, int b) {
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        return a;
    }


}
