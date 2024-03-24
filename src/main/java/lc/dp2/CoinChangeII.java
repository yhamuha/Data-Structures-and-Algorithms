package lc.dp2;

import java.util.Arrays;

public class CoinChangeII {
    // O(m*n) O(m*n)
    public int change(int amount, int[] coins) {
        int[][] dp = new int[coins.length+1][amount+1];
        dp[0][0] = 1;
        for (int i = 1; i <= coins.length; i++) {
            dp[i][0] = 1;
            for (int j = 1; j <= amount; j++) {
                dp[i][j] = dp[i-1][j] + (j >= coins[i-1] // if current amount >= denomination
                                            ? dp[i][j-coins[i-1]] : 0);
            }
        }
        return dp[coins.length][amount];
    }

    public static void main(String[] args) {
        CoinChangeII coinChange = new CoinChangeII();
        int amount = 5;
        int[] coins = {1, 2, 5};
        System.out.println(coinChange.change(amount, coins));
    }
}
