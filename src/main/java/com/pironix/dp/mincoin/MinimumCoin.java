package com.pironix.dp.mincoin;

/**
 * Created by ikarayel on 3/26/2017.
 * <p>
 * Input: coins[] = {25, 10, 5}, V = 30
 * Output: Minimum 2 coins required
 * We can use one coin of 25 cents and one of 5 cents
 * <p>
 * Input: coins[] = {9, 6, 5, 1}, V = 11
 * Output: Minimum 2 coins required
 * We can use one coin of 6 cents and 1 coin of 5 cents
 * <p>
 * If V == 0, then 0 coins required.
 * If V > 0
 * minCoin(coins[0..m-1], V) = min {1 + minCoins(V-coin[i])}
 * where i varies from 0 to m-1
 * and coin[i] <= V
 */
public class MinimumCoin {

    public static void main(String[] args) {
        int[] coins = {25, 10, 5};
        int[] coins2 = {1, 5, 10, 25};
        // System.out.println(minCoinRecursive(coins, 5));
/*        System.out.println(minCoinRecursive(coins2, 32));
        System.out.println(minCoinRecursive(coins2, 7));
        System.out.println(minCoinRecursive(coins2, 2));*/
        System.out.println("********************************");
        System.out.println(minCoinDP(coins2, 32));
        System.out.println(minCoinDP(coins2, 7));
        System.out.println(minCoinDP(coins2, 2));
    }


    private static int minCoinDP(int coins[], int V) {
        // table[i] will be storing the minimum number of coins
        // required for i value.  So table[V] will have result
        int[] table = new int[V + 1];

        // Base case (If given value V is 0)
        table[0] = 0;

        // Initialize all table values as Infinite
        for (int i = 1; i <= V; i++)
            table[i] = Integer.MAX_VALUE;

        // Compute minimum coins required for all
        // values from 1 to V
        for (int i = 1; i <= V; i++) {
            // Go through all coins smaller than i
            for (int j = 0; j < coins.length; j++)
                if (coins[j] <= i) {
                    int sub_res = table[i - coins[j]];
                    if (sub_res != Integer.MAX_VALUE && sub_res + 1 < table[i])
                        table[i] = sub_res + 1;
                }
        }
        return table[V];
    }

    private static int minCoinRecursive(int[] coins, int val) {
        if (val == 0)
            return 0;
        int min = val;
        for (int i = 0; i < coins.length; i++) {
            if (val >= coins[i]) {
                min = Math.min(min, 1 + minCoinRecursive(coins, val - coins[i]));
            }
        }
        return min;
    }
}
