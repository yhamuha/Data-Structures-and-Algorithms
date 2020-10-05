package misc.stack;

public class StacksInArray {
    int STACK_SIZE = 2;
    int STACKS_COUNT = 3;
    int[] STACKS = new int[STACK_SIZE * STACKS_COUNT];
    int[] STACK_SIZES = new int[STACKS_COUNT];

    boolean isOutOfRange(int stackIndex) {
        return stackIndex < 0 ||
                stackIndex > STACKS_COUNT - 1;
    }

    boolean isEmpty(int stackIndex) {
        return STACK_SIZES[stackIndex] == 0;
    }

    int getStackTop(int stackIndex) {
        int offset = stackIndex * STACK_SIZE;
        return offset + STACK_SIZES[stackIndex] - 1;
    }

    void push(int stackIndex, int value) throws Exception {
        if (isOutOfRange(stackIndex))
            throw new Exception("Stack index out of range");
        int stackTop = getStackTop(stackIndex);
        if (STACK_SIZES[stackIndex] == STACK_SIZE)
            throw new Exception("Stack overflow");
        STACKS[stackTop + 1] = value;
        STACK_SIZES[stackIndex] += 1;
    }

    int pop(int stackIndex) throws Exception {
        if (isOutOfRange(stackIndex))
            throw new Exception("Stack index out of range");
        if (isEmpty(stackIndex))
            throw new Exception("Stack " + stackIndex + " is empty");
        int stackTop = getStackTop(stackIndex);
        STACK_SIZES[stackIndex] -= 1;
        return STACKS[stackTop];
    }

    int peek(int stackIndex) throws Exception {
        if (isOutOfRange(stackIndex))
            throw new Exception("Stack index out of range");
        if (isEmpty(stackIndex))
            throw new Exception("Stack " + stackIndex + " is empty");
        int stackTop = getStackTop(stackIndex);
        return STACKS[stackTop];
    }
}

