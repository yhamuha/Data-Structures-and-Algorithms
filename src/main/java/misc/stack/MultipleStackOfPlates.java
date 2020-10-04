package misc.stack;

import java.util.Stack;

public class MultipleStackOfPlates {

    Stack<Stack<Integer>> stacksList = new Stack<>();
    int SINGLE_STACK_SIZE = 3;

    Stack<Integer> getLastStack() {
        return stacksList.peek();
    }

    boolean lastStackIsFull() {
        if (stacksList.isEmpty()) return false;
        return getLastStack().size() == SINGLE_STACK_SIZE;
    }

    void deleteLastStack() {
        stacksList.pop();
    }

    // push values into stacks which have dynamical behaviour
    void push(int value) {
        if (stacksList.isEmpty() || lastStackIsFull())
            stacksList.push(new Stack<Integer>());
        getLastStack().push(value);
    }


}
