package lc.greedy.e;

public class BestTimeToBuyAndSellStock {
    // O(n) O(1)
    public int maxProfit(int[] prices) {
        int max=0,min=prices[0];
        for(int i=1;i<prices.length;i++)   {
            if(min<prices[i])
                max=Math.max(prices[i]-min,max);
            else
                min=prices[i];
        }
        return max;
    }

    public static void main(String[] args) {
        BestTimeToBuyAndSellStock stock = new BestTimeToBuyAndSellStock();
        int[] prices = {7, 1, 5, 3, 6, 4};
        int maxProfit = stock.maxProfit(prices);
        System.out.println("Maximum profit: " + maxProfit);
    }
}
