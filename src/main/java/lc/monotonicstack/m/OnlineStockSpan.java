package lc.monotonicstack.m;

import java.util.Stack;

// O(n) O(n)
public class OnlineStockSpan {
    Stack<int[]> stack;
    public OnlineStockSpan() {
        stack = new Stack<>();
    }
    public int next(int price) {
        int span = 1;
        while (!stack.isEmpty() && stack.peek()[0] <= price)
            span += stack.pop()[1];
        stack.push(new int[] {price, span});
        return span;
    }

    public static void main(String[] args) {
        OnlineStockSpan ss = new OnlineStockSpan();
        int[] prices = {100,80,60,70,60,75,85};
        for(int i=0; i<prices.length; i++){
            System.out.print(ss.next(prices[i]));
            System.out.print(" ");
        }
    }
}

