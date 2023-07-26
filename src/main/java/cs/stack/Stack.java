package cs.stack;

public class Stack {

    static int STACK_TOP =  -1;
    static int STACK_SIZE = 3;
    static int[] STACK = new int[STACK_SIZE];

    static void push(int value) throws Exception {
        if (STACK_TOP == STACK_SIZE - 1) {
            throw new Exception("Stack overflow");
        }
        STACK_TOP += 1;
        STACK[STACK_TOP] = value;
    }

    static int pop() throws Exception {
        if (STACK_TOP == -1) throw new Exception("Stack is empty");
        int value = STACK[STACK_TOP];
        STACK_TOP -= 1;
        return value;
    }

    public static void main(String[] args) {
        try {
            push(1);
            pop();  //
            push(1);
            push(1); // 1 1 1
            // push(1); // Stack overflow
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
