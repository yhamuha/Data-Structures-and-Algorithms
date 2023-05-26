package onemoretime.fibonacci;

/*
 * Fibonacci sequence: 0 + 1 + 3 + n
 * iterative and recursive method existing
 */

public class Wh_Fibonacci_sequence {
    public static long calc_fibonacci_seq (int number){
        if (number <= 1) return number;

        long fib = 0;
        long prev0 = 0;
        long prev1 = 1;

        for (int i=2; i<=number; i++) {
            fib = prev0 + prev1;
            // shift values for prev0 and prev1
            prev0 = prev1;
            prev1 = fib;
        }
        return fib;
    }

    public static void main (String[] str) {
        int number = 5;
        for (int i =1; i<=number; i++) {
            System.out.println ("Fibonacci seq for " + number + "is : " + calc_fibonacci_seq(i));
        }
    }
}

