package com.pironix.dp.knapsack;

/**
 * Created by ikarayel on 3/11/2017.
 */
public class KnapSackRecursive {


    static int[] val = new int[]{60, 100, 120};
    static int[] wt = new int[]{10, 20, 30};
    static int W = 50;

    public static void main(String[] args) {
        System.out.println(knapSack(W, wt, val, val.length));
        System.out.println(knapSackDP(W, wt, val, val.length));
    }


    private static int knapSackDP(int W, int wt[], int val[], int n) {

        int cache[][] = new int[n + 1][W + 1];
        // Build table cache[][] in bottom up manner
        for (int i = 1; i <= n; i++) {
            for (int w = 1; w <= W; w++) {
               /* if (i == 0 || w == 0)
                    cache[i][w] = 0;*/
                if (wt[i - 1] <= w)
                    cache[i][w] = Math.max(val[i - 1] + cache[i - 1][w - wt[i - 1]], cache[i - 1][w]);
                else
                    cache[i][w] = cache[i - 1][w];
            }
        }
        return cache[n][W];
    }

    private static int knapSack(int W, int wt[], int val[], int n) {
        // Base Case
        if (n == 0 || W == 0)
            return 0;

        // If weight of the nth item is more than Knapsack capacity W, then
        // this item cannot be included in the optimal solution
        if (wt[n - 1] > W)
            return knapSack(W, wt, val, n - 1);

            // Return the maximum of two cases: (1) nth item included (2) not included
        else return Math.max(val[n - 1] + knapSack(W - wt[n - 1], wt, val, n - 1),
                knapSack(W, wt, val, n - 1)
        );
    }
}
