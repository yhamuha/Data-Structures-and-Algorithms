package misc;

/**
 *  The {@code Fibonacci} class represents implementation of Fibonacci.
 *
 *  It includes methods for generation Fibonacci number.
 *
 */
public class Fibonacci {

    /**
     * Unit tests of Fibonacci number.
     *
     * @param args the command-line arguments (none)
     */
    public static void main(String[] args) {
        System.out.println(fibNaive(5));
        System.out.println(fibNaive(10));
        System.out.println(fibEffective(10));
        System.out.println(fibEffective(100));
    }

    /**
     * Return a long value of Fibonacci number.
     * @return a long
     *         fibNaive(10) -> 55
     *
     *  Non effective algorithm
     *  fibNaive (100) by recursive implementation may takes 50_000 years ...
     *  problem is:
     *  ===================
     *  1) grows of tree of invokes is exponentially
     *  2) we have a duplicate nodes
     */
    private static long fibNaive(int n) {

        // return 0 or 1 as condition of base case
        if (n<=1)
            return n;

        // processing recursively
        return fibNaive(n-1) + fibNaive(n-2);
    }
    /**
     * Return a long value of Fibonacci number
     * in effective manner storing elements in array
     * @return a long
     *         fibEffective(100) -> 3736710778780434371
     * 
     */
    private static long fibEffective (int n) {
        long[] arr = new long[n+1];

        arr[0] = 0;
        arr[1] = 1;

        for (int i=2; i<=n; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[n];
    }
}
