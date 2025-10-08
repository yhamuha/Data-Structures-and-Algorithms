package misc.m.linkediList;

import java.util.Stack;

public class LinkedListStack<T> extends Stack<T> {
    // Time: push/pop O(1); Space O(n) for nodes
    private Node<T> head = null;
    private int count = 0;

    public T push(T value) {
        head = new Node<>(value, head);
        count++;
        return value;
    }

    public T pop() {
        if (isEmpty()) throw new RuntimeException("Stack is empty");
        T result = head.value;
        head = head.next;
        count--;
        return result;
    }

    public T peek() {
        if (isEmpty()) throw new RuntimeException("Stack is empty");
        return head.value;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        return count;
    }

    public static void main(String[] args) {
        LinkedListStack<Integer> stack = new LinkedListStack<>();
        for (int i = 1; i <= 5; i++) {
            stack.push(i);
            System.out.println("Push " + i + ", size = " + stack.size());
        }
        System.out.println("\nPeek top: " + stack.peek());
        System.out.println("\nPop values:");
        while (!stack.isEmpty()) {
            System.out.println("Pop " + stack.pop() + ", size = " + stack.size());
        }
    }
}
