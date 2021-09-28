package misc.problem_solving;

/**
 *
 */
public class MaxProfit {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

    // O(n), O(1)
    static int maxProfit(int prices[]) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        int sellIndex = 0, buyIndex = 0;
        for (int i = 0; i < prices.length; i++) {
            // set minprice
            if (prices[i] < minprice) {
                minprice = prices[i];
            }
            // set maxprofit if difference > maxprofit
            else if ((prices[i] - minprice) > maxprofit) {
                maxprofit = prices[i] - minprice;
            }
        }
        return maxprofit;
    }
}
