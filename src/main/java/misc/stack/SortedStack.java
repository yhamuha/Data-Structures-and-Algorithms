package misc.stack;

import java.util.Stack;

    // code needs to be checked !

public class SortedStack {

    public static void main(String[] args) {

        SortedStack sortedStackTest = new SortedStack();
        Stack unsortedStack = new Stack();
        Stack sortedStack = new Stack();

        unsortedStack.push(1);
        unsortedStack.push(5);
        unsortedStack.push(8);

        sortedStack.push(2);
        sortedStack.push(3);

        sortedStackTest.sort(unsortedStack);
        System.out.println(sortedStack);
    }

    void moveElementBiggerTemp(Stack<Integer> unsortedStack, Stack<Integer> sortedStack, int temp) {
        while(!sortedStack.isEmpty() && sortedStack.peek() > temp)
        unsortedStack.push(sortedStack.pop());
    }

    void sort(Stack<Integer> unsortedStack) {
        Stack<Integer> sortedStack = new Stack<>();
        while (!unsortedStack.isEmpty()) {

            int temp = unsortedStack.pop();

            moveElementBiggerTemp(unsortedStack, sortedStack, temp);

            sortedStack.push(temp);
        }

        while (!sortedStack.isEmpty())
            unsortedStack.push(sortedStack.pop());
    }
}
