package misc.m.linkediList;

import java.util.Stack;

public class ArrayStack<T> extends Stack<T> {
    // push/pop O(1); resize O(n)
    private final int DEFAULT_CAPACITY = 2;
    private T[] items = (T[]) new Object[DEFAULT_CAPACITY];
    private int count;

    public T push(T value) {
        if (count == items.length) resize(items.length * 2);
        items[count] = value;
        count++;
        return value;
    }

    public T pop() {
        count--;
        T result = items[count];
        items[count] = null;
        if (count > 0 && count == items.length / 4) resize(items.length / 2);
        return result;
    }

    private void resize(int size) {
        T[] copy = (T[]) new Object[size];
        for (int i = 0; i < this.count; i++)
            copy[i] = items[i];
        items = copy;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public int size() {
        return count;
    }

    public static void main(String[] args) {
        ArrayStack<Integer> stack = new ArrayStack<>();
        System.out.println("Pushing values:");
        for (int i = 1; i <= 8; i++) {
            stack.push(i);
            System.out.println("Pushed " + i + ", size = " + stack.size());
        }
        System.out.println("\nPopping values:");
        while (!stack.isEmpty())
            System.out.println("Popped " + stack.pop() + ", size = " + stack.size());
    }

}
