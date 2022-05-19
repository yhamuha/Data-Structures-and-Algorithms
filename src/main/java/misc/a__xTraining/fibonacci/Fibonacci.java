package misc.a__xTraining.fibonacci;

/**
 *
 */
public class Fibonacci {

    /**
     * Unit tests of Fibonacci number.
     *
     * @param args the command-line arguments (none)
     */
    public static void main(String[] args) {

//       System.out.println(fibonacciRecursive(6));
       System.out.println("fib effective: " + fibonacciIteration(10));
    }

    static long fibonacciRecursive (int n) {

        if (n<=1) return n;
        return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);

    }

//    private static long fibRecursion (int n) {
//        if (n<=1) return n;
//        return fibRecursion(n-1) + fibRecursion(n-2);
//    }


//    0, 1, 1, 2, 3, 5, 8, etc..
//    x = arr[x-1] + arr[x-2]
//    3 (1) = x-1, (1) + x-2, (0)
//    4 (2) = x-1, (1) + x-2, (1)

//    private static long fibonacci (int n) {
//       // base case
//       if (n<=0) return n;
//       // recursion
//       return fibonacci(n-1) + fibonacci(n-2);
//    }

    // effective iteration method
//    private static long fibonacciIteration (int n) {
//        // create array+1 size
//        long[] arr = new long[n+1];
//        // init [0] and [1] element
//        arr[0] = 0;
//        arr[1] = 1;
//        // iterate through array started from 2 element
//        // put to each step cell the result
//        for (int i=2; i<=n; i++) {
//            arr[i] = arr[i-1] + arr[i-2];
//        }
//        return arr[n];
//    }

    static int fibonacciIteration (int n) {

        int[] arr = new int[n+1];

        arr[0] = 0;
        arr[1] = 1;

        for (int i=2; i<=n; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[n];
    }

}

