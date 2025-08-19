package lc.greedy.e;

public class BestTimeToBuyAndSellStock {
    // O(n) O(1) #amazon
    public int maxProfit(int[] prices) {
        int prev = prices[0];
        int max = 0;
        for(int i=1; i<prices.length; i++){
            if (prev < prices[i])
                    max = Math.max(max, prices[i] - prices[prev]);
            else
                prev = prices[i];
        }
        return max;
    }

    public static void main(String[] args) {
        BestTimeToBuyAndSellStock stock = new BestTimeToBuyAndSellStock();
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(stock.maxProfit(prices));
    }
}
