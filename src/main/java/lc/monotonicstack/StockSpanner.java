package lc.monotonicstack;

import java.util.Stack;

// O(n) O(n)
public class StockSpanner {
    Stack<int[]> stack;
    public StockSpanner() {
        stack = new Stack<>();
    }

    public int next(int price) {
        int span = 1;
        while (!stack.isEmpty() && stack.peek()[0] <= price) {
            span += stack.pop()[1];
        }
        stack.push(new int[] {price, span});
        return span;
    }

    public static void main(String[] args) {
        StockSpanner ss = new StockSpanner();
        System.out.print(ss.next(100));
        System.out.print(ss.next(80));
        System.out.print(ss.next(60));
        System.out.print(ss.next(70));
        System.out.print(ss.next(60));
        System.out.print(ss.next(75));
        System.out.print(ss.next(85));
    }
}

