package lc.stack;

import java.util.Stack;

public class MinStack {

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> min_vals = new Stack<>();

    public MinStack() {

    }

    public void push(int val) {
        if (min_vals.isEmpty() || val <= min_vals.peek()) {
            min_vals.push(val);
        }
        stack.push(val);
    }

    public void pop() {
        if(stack.peek().equals(min_vals.peek())) {
            min_vals.pop();
        }
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    // O(1), O(n)
    public int getMin() {
        return min_vals.peek();
    }

    public static void main(String[] args) {
        MinStack ms = new MinStack();
        ms.push(11);
        ms.push(2);
        ms.push(3);
        System.out.println(ms.getMin());
    }
}

/*
    existent solutions:
    using 2 stacks:     min_vals contains always min element
    using 1 stack
 */
