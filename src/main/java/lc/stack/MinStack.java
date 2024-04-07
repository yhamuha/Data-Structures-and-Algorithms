package lc.stack;

import java.util.Stack;

public class MinStack {
    Stack<Integer> stack = new Stack<>();       // stack1
    Stack<Integer> min_vals = new Stack<>();    // stack2
    public MinStack() {
    }
    public void push(int val) {
        if (min_vals.isEmpty() || val <= min_vals.peek()) {
            min_vals.push(val);
        }
        stack.push(val);
    }
    public void pop() {
        if(stack.peek().equals(min_vals.peek())) {  // sync both stacks
            min_vals.pop();                         // remove from 1st
        }
        stack.pop();                                // and 2st stack
    }

    public int top() {return stack.peek();}

    // O(1), O(n)
    public int getMin(){return min_vals.peek();}

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

/*
    existent solutions:
    using 2 stacks:     min_vals contains always min element
    using 1 stack
 */
