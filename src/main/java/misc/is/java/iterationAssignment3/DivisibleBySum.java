package misc.is.java.iterationAssignment3;

public class DivisibleBySum {

    static public boolean isDivisible (int num) {
        int sum =0;
        int temp = num;

        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }

        if (temp % sum == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int num1 = 2250;
        int num2 = 123;
        System.out.println(num1 + " is divisible on sum: " + isDivisible(num1));
        System.out.println(num2 + " is divisible on sum: " + isDivisible(num2));
    }
}
