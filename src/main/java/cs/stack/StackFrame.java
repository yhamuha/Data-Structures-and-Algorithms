package cs.stack;

public class StackFrame {
    static void foo (int value) {
        value = 222;
    }

    public static void main(String[] args) {
        int value = 1;
        System.out.println(value); // 1
        foo(value);
        System.out.println(value); // 1
    }
}
