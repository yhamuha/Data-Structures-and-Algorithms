package lc.stack.m;

import java.util.Stack;

public class DesignBrowserHistory {
    // O(n)-worst O(n)
    Stack<String> backwardStack = new Stack<>();
    Stack<String> forwardStack = new Stack<>();
    public DesignBrowserHistory(String homepage) {
        backwardStack.push(homepage);
    }
    public void visit(String url) {
        while(!forwardStack.isEmpty()) forwardStack.pop();
        backwardStack.push(url);
    }

    public String back(int steps) {
        while(backwardStack.size()>1 && steps-- > 0){
            forwardStack.push(backwardStack.peek());
            backwardStack.pop();
        }
        return backwardStack.peek();
    }

    public String forward(int steps) {
        while(!forwardStack.isEmpty() && steps-- > 0){
            backwardStack.push(forwardStack.peek());
            forwardStack.pop();
        }
        return backwardStack.peek();
    }

    public static void main(String[] args) {
        DesignBrowserHistory bh = new DesignBrowserHistory("google");
        bh.visit("facebook");
        bh.visit("google");
        bh.visit("amazon");
        System.out.println(bh.back(1));
        System.out.println(bh.forward(1));

    }
}

