package onemoretime.fibonacci;

/*
 * recursive method Fibonacci
 */

public class Wh_Fibonacci {
    public static int fibonacciRecursive (int n) {
        if (n<=1) return n;
        return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
    }

    public static void main (String[] str) {
        int number = 5;
        for (int i = 1; i <= number; i++) {
            System.out.println("Fib recursive = " + fibonacciRecursive(i));
        }
    }
}

