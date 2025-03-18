package lc.stack.m;

import java.util.Stack;

public class MinStack {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> min_values = new Stack<>();
    // O(1) O(n)
    public MinStack() {}
    public void push(int val) {
        if (min_values.isEmpty() || val <= min_values.peek())
            min_values.push(val);
        stack.push(val);
    }
    public void pop() {
        if(stack.peek().equals(min_values.peek()))
            min_values.pop();
        stack.pop();
    }
    public int top() {return stack.peek();}
    public int getMin(){return min_values.peek();}

    public static void main(String[] args) {
        MinStack ms = new MinStack();
        ms.push(-2);
        ms.push(0);
        ms.push(-3);
        System.out.print(ms.getMin() + " ");
        ms.pop();
        System.out.print(ms.top()+ " ");
        System.out.print(ms.getMin());
    }
}
