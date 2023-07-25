package leetcode.bigo;

public class BigOMeasurements {

    // O(N^2)
    void printUnorderedPairs(int[] arrayA, int[] arrayB) {
        for (int i = 0; i < arrayA.length; i++) {
            for (int j = 0; j < arrayB.length; j++) {
                for (int k = 0; k < 100_000; k++) {
                    System.out.println(arrayA[i] + "," + arrayB[j]);
                }
            }
        }
    }

    // O(sqrt(N))
    static boolean isPrime(int n) {
        for (int x = 2; x * x <= n; x++) {
            if (n % x == 0) {
                return false;
            }
        }
        return true;
    }

    // O(n) linear
    int factorial(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    // O(2^N) expotential
    int fib(int n) {
        if (n <= 0) return 0;
        else if (n==1) return 1;
        return fib(n-1) + fib (n-2);

    }
}
