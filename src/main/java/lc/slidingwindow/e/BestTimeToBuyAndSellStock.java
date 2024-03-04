package lc.slidingwindow.e;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int prevDay = 0;
        int maxProfit = 0;

        for (int nextDay=0; nextDay <= prices.length-1; nextDay++) {
            if (prices[prevDay] < prices[nextDay]) {
                int currentProfit = prices[nextDay] - prices[prevDay];
                maxProfit = Math.max(maxProfit, currentProfit);
            } else {
                prevDay = nextDay;
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        var bttb = new BestTimeToBuyAndSellStock();
        System.out.println(bttb.maxProfit(new int[]{1,2}));
    }
}
