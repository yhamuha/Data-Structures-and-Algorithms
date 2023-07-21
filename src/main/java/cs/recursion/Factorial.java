package cs.recursion;

public class Factorial {


    // with recursion
    public static int factorial (int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        if (n == 0) return 1;
        if (n == 1) return 1;
        return n * factorial(n-1);
    }


    //without recursion
    public static int calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }

        int factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(calculateFactorial(5));
   }
}


