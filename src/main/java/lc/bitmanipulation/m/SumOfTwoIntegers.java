package lc.bitmanipulation.m;

public class SumOfTwoIntegers {
    // O(n) O(1)
    public int getSum(int a, int b) {
        while ((a&b) != 0) {
            int olda = a;
            a = olda^b;
            b = (olda&b) << 1;
        }
        return a|b;
    }
    public static void main(String[] args) {
        SumOfTwoIntegers sumOfTwoIntegers = new SumOfTwoIntegers();

        int a = 5;
        int b = 7;

        System.out.println("Sum of " + a + " and " + b + " is: " + sumOfTwoIntegers.getSum(a, b));
    }
}
