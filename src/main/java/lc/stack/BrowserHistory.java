package lc.stack;

import java.util.Stack;

public class BrowserHistory {

    Stack<String> bStack = new Stack<>();
    Stack<String> fStack = new Stack<>();

    public BrowserHistory(String homepage) {
        bStack.push(homepage);
    }

    public void visit(String url) {
        while(!fStack.isEmpty()) fStack.pop();
        bStack.push(url);

    }

    public String back(int steps) {
        while(bStack.size()>1 && steps-- > 0){
            fStack.push(bStack.peek());
            bStack.pop();
        }
        return bStack.peek();
    }

    public String forward(int steps) {
        while(!fStack.isEmpty() && steps-- > 0){
            bStack.push(fStack.peek());
            fStack.pop();
        }
        return bStack.peek();
    }

    public static void main(String[] args) {
        BrowserHistory bh = new BrowserHistory("google");
        bh.visit("facebook");
        bh.visit("google");
        bh.visit("amazon");
        System.out.println(bh.back(1));

    }
}

/*
    two stack approach
 */
