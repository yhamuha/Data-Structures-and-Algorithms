package lc.twopointer;

public class BuyTwoChocolates {
    // O(n) O(1)
    public int buyChoco(int[] prices, int money) {
        int minA=101,minB=101;
        for(int i=0;i<prices.length;i++)
            if(prices[i]<minA){
                minB=minA;
                minA=prices[i];
            }else if(prices[i]<minB)
                minB=prices[i];
        if(minA+minB<=money)
            return money-minA-minB;
        return money;
    }
    public static void main(String[] args) {
        BuyTwoChocolates buyTwoChocolates = new BuyTwoChocolates();
        int[] prices = {1, 2, 2};
        int money = 3;
        int remainingMoney = buyTwoChocolates.buyChoco(prices, money);
        System.out.println(remainingMoney);
    }
}
