package cs.stack;

import java.util.ArrayList;
import java.util.List;

public class StackOnArrayList {
    List<Integer> stack = new ArrayList<Integer>();

    public StackOnArrayList() {
    }

    public void push(int n) {
        stack.add(n);
    }

    public int pop() {
        return stack.remove(stack.size() - 1);
    }

    public int peek() {
        return stack.get(stack.size()-1);
    }

    public int size() {
        return stack.size();
    }

    public static void main(String[] args) {
        StackOnArrayList stack = new StackOnArrayList();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.peek());
        stack.pop();
        stack.pop();
        System.out.println(stack.peek());
    }
}
