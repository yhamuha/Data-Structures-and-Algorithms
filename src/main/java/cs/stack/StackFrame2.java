package cs.stack;

public class StackFrame2 {

    static void foo(int[] arr) {
        arr[0] = 111;
        arr = null;
    }

    public static void main(String[] args) {
        int[] arr = {5};
        System.out.println(arr[0]); // 5
        foo(arr);
        // exit from previous stack frame
        System.out.println(arr[0]); // 111
    }
}
