package lc.dp.m;

import java.util.Arrays;

public class CoinChange {
    // O(n * amount) O(amount)
    public int coinChange(int[] coins, int amount) {
        int[] cache = new int[amount + 1];
        Arrays.fill(cache, amount + 1);

        //total amount of coins to make up amount 0 is 0
        cache[0] = 0;

        for(int i = 1; i < amount + 1; i++){
            int curAmount = i;
            for(int coin : coins){
                if(curAmount - coin >= 0){
                    cache[curAmount] = Math.min(cache[curAmount - coin] + 1, cache[curAmount]);
                }
            }
        }
        return cache[amount] == amount + 1 ? -1 : cache[amount];
    }

    public static void main(String[] args) {
        var cc = new CoinChange();
        int[] coins = {1,2,5};
        int amount = 11;
        System.out.println(cc.coinChange(coins, amount));
    }
}
