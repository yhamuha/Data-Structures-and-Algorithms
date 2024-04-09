package lc.stack;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueues {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();
    public ImplementStackUsingQueues() {
    }
    // O(n)
    public void push(int x) {
        while( q1.size() > 0)
            q2.add(q1.poll());
        q1.add(x);
        while( q2.size() > 0 )
            q1.add(q2.poll());
        return;
    }
    // O(1)
    public int pop() {
        return q1.poll();
    }
    // O(1)
    public int top() {
        return q1.peek();
    }
    // O(1)
    public boolean empty() {
        return q1.size() == 0;
    }

    public static void main(String[] args) {
        ImplementStackUsingQueues isuq = new ImplementStackUsingQueues();
        isuq.push(1);
        isuq.push(2);
        System.out.print(isuq.top() + " ");
        System.out.print(isuq.pop()+ " ");
        System.out.print(isuq.empty());
    }
}
