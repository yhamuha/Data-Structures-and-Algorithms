package lc.bitmanipulation.m;

public class SumOfTwoIntegers {
    // O(n) O(1)
    public int getSum(int a, int b) {
        while ((a&b) != 0) {
            int olda = a;
            a = olda^b; // get digit with "no carrie"
            b = (olda&b) << 1; // get and left shift "carrie" digit
        }
        return a|b; // merge "no carries" digits
    }
    public static void main(String[] args) {
        SumOfTwoIntegers sumOfTwoIntegers = new SumOfTwoIntegers();

        int a = 5;
        int b = 7;

        System.out.println("Sum of " + a + " and " + b + " is: " + sumOfTwoIntegers.getSum(a, b));
    }
}
