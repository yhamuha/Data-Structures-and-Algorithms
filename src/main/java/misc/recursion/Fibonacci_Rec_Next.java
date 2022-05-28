package misc.recursion;

/**
 *
 */
public class Fibonacci_Rec_Next {
    public static void main(String[] args) {
        System.out.println(fib_rec(10));
    }

    static int fib_rec(int i) {
        /*if (i==0) return 0;
        if (i==1) return 1;*/
        if (i <= 1) return i;

        return fib_rec(i-1) + fib_rec (i-2);
    }
}
