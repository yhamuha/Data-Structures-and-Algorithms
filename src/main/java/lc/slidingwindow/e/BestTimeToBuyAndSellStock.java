package lc.slidingwindow.e;

public class BestTimeToBuyAndSellStock {
    // O(n) O(1)
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int prev = 0;
        for(int next=0; next<prices.length; next++){
            if(prices[prev] < prices[next]) {
                int currentProfit = prices[next] - prices[prev];
                maxProfit = Math.max(currentProfit,maxProfit);
            } else
                prev = next;
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        var bttb = new BestTimeToBuyAndSellStock();
        System.out.println(bttb.maxProfit(new int[]{7,1,5,3,6,4}));
    }
}
