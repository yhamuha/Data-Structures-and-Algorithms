package onemoretime.prime;

/* Prime is a number which divided by itself only;
 * If number divide to some other number function should return false
 */

public class Wh_PrimeNumberChecker {

    public static boolean isPrime (int number) {
        if (number <=1) return false;
        // i*i for performance enhance
        // Math.sqrt is costly operation
        for (int i = 2; i*i <=number; i++) {
            if (number % i ==0) return false;
        }
        return true;
    }

    public static void main (String[] str) {
        int start = 1;
        int end = 50;

        System.out.println("Prime numbers between " + start + "and" + end + " is :");
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print (i + " ");
            }
        }
    }
}

