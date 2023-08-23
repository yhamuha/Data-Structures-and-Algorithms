package lc.arrays;

public class BestTimeBuyAndSell {

    public static int maxProfit(int[] prices) {
        int profit = 0, left = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[left]) {
                profit = Math.max(profit, prices[i] - prices[left]);
            } else {
                left = i;
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] prices = new int[] {18,5,17,3,7,1};
        System.out.println(maxProfit(prices));
    }
}
