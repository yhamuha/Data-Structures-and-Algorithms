package lc.stack;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {

        Queue<Integer> q = new LinkedList<>();
        public MyStack() {
        }

        // O(n), O(1)
        public void push(int x) {
          q.add(x);
          int k = q.size();
          for (int i=0; i< k-1; i++) {
              int first = q.remove();
              q.add(first);
          }
        }

        // O(n), O(1)
        public int pop() {
            return q.remove();
        }
        public int top() {
            return q.peek();
        }
        public boolean empty() {
            return q.isEmpty();
        }

    /*
     Your MyStack object will be instantiated and called as such:

     MyStack obj = new MyStack();
     obj.push(x);
     int param_2 = obj.pop();
     int param_3 = obj.top();
     boolean param_4 = obj.empty();
     */


    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.top());
    }
}
