package lc.slidingwindow.e;


/*
*   7 1 5 3 6 4
*   res: 5 (buy for 1 -> sell for 6)
*/
public class BestTimeToBuyAndSellStock {
    int maxProfit (int[] prices) {
        int prevDay = 0;
        int maxProfit = 0;
        for(int nextDay=0; nextDay<prices.length; nextDay++) {
            if (prices[prevDay] < prices[nextDay]) {
                int currProfit = prices[nextDay] - prices[prevDay];
                maxProfit = Math.max(maxProfit, currProfit);
            } else {
                prevDay = nextDay;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        var bttb = new BestTimeToBuyAndSellStock();
        System.out.println(bttb.maxProfit(new int[]{7,1,5,3,6,4}));
    }
}
