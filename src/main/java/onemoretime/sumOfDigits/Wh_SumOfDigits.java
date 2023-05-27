package onemoretime.sumOfDigits;

/*
 * sum of digits
 */

public class Wh_SumOfDigits {
    public static int digitSum (int number) {
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        return sum;
    }

    public static void main (String[] str) {
        int number = 1234;
        System.out.println ("Sum of digits is: " + digitSum(number));
    }
}
