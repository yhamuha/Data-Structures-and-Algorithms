package misc.a__xTraining.factorial;

/**
 *
 */
public class Demo {

    // factorial as recursive
//    public static long factorial(long n) {
//        if (n <=1)
//            return 1;
//        else
//            return n * factorial(n-1);
//    }

    // factorial as iterative
//    public static int getFactorial (int n) {
//        int result = n;
//        if (n >= 1) {
//            for (int i = n-1; i >= 1; i--) {
//                result = result * i;
//            }
//            return result;
//        }
//        else {
//            System.out.println("n has to be positive");
//            return 1;
//        }
//    }

    // 0 -> 1
    //
//    public static int getFactorial2 (int n) {
//        int result = n;
//
//        if (n>=1) {
//            for (int i=n-1; i>=1; i--) {
//                result = result * i;
//            }
//            return result;
//        } else {
//            return 1;
//        }
//
//    }

//
/*static int factorial (int n) {
        if (n<=1) return 1;
        else return n * factorial(n-1);
}*/


        /*static int factorialIterative (int n) {

        int result = n;

        if (n>=1) {
            for (int i=n-1; i>=1; i--) {
                result = result * i;
            }
            return result;
        } else {
            return 1;
        }
    }*/

    // factorial recursive
    static int factorial (int n) {
        if (n<=1) return 1;
        else return n * factorial(n-1);
    }

    // factorial iterative
    static int factorialIterative (int n) {
        int result = n;

        if (n>=1) {
            for (int i=n-1;i>=1;i--) {
                result = result*i;
            }
            return result;
        } else {
            return 1;
        }


    }

    public static void main(String[] args) {
//        System.out.println("Factorial of 5 is: " + factorial(5));
//        System.out.println("Factorial of 5 is: " + getFactorial(5));
//        System.out.println("Factorial of 5 is: " + getFactorial2(5));
//        System.out.println(factorialIterative(5));
        System.out.println(factorial(5));
        System.out.println(factorialIterative(5));
    }
}
