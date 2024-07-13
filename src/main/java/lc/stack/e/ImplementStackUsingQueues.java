package lc.stack.e;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueues {
    // O(n) O(n)
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();
    public void push(int x) {
        while( q1.size() > 0)
            q2.add(q1.poll());
        q1.add(x);
        while( q2.size() > 0 )
            q1.add(q2.poll());
    }
    public int pop() {
        return q1.poll();
    }
    public int top() {
        return q1.peek();
    }
    public boolean empty() {
        return q1.size() == 0;
    }

    public static void main(String[] args) {
        ImplementStackUsingQueues stack = new ImplementStackUsingQueues();
        stack.push(1);
        stack.push(2);
        System.out.print(stack.top() + " ");
        System.out.print(stack.pop()+ " ");
        System.out.print(stack.empty());
    }
}
