package lc.monotonicstack.e;

import java.util.Arrays;
import java.util.Stack;

public class FinalPricesWithASpecialDiscountInAShop {
    // O(n) O(n)
    public int[] finalPrices(int[] prices) {
        Stack<Integer> st=new Stack<>();
        for(int i=prices.length-1; i>=0; i--){
            while( st.size()>0 && st.peek()>prices[i])
                st.pop();
            int n = prices[i];
            if(!st.isEmpty())
                prices[i]=prices[i]- st.peek();
            st.push(n);
        }
        return prices;
    }

    public static void main(String[] args) {
        int[] prices = {8,4,6,2,3};
        FinalPricesWithASpecialDiscountInAShop fpd = new FinalPricesWithASpecialDiscountInAShop();
        System.out.println(Arrays.toString(fpd.finalPrices(prices)));
    }
}
