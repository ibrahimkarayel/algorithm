package com.pironix.dp.fibonacci;

/**
 * Created by ikarayel on 3/12/2017.
 */
public class Fibonacci {


    public static void main(String[] args) {

        System.out.println(fibonacciDP(9));
        System.out.println(fibonacci(9));
    }

    private static long fibonacciDP(int n) {
        if (n < 0)
            return -1;
        long[] cache = new long[n + 1];
        cache[0] = 0;
        cache[1] = 1;

        for (int i = 2; i <= n; i++) {
            cache[i] = cache[i - 1] + cache[i - 2];

        }
        return cache[n];

    }

    private static long fibonacci(int n) {
        if (n < 0)
            return -1;
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);

    }
}
