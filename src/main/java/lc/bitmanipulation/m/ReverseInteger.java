package lc.bitmanipulation.m;

public class ReverseInteger {
    // O(log n) O(1) #ibm
    public int reverse(int x) {
        long result = 0;
        int lastDigit;
        while (x != 0) {
            lastDigit = x % 10;
            result = result * 10 + lastDigit;
            x = x / 10;

            if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE)
                return 0;
        }
        return (int) result;
    }

    public static void main(String[] args) {
        ReverseInteger reverseInteger = new ReverseInteger();
        int num1 = 123;
        System.out.println(reverseInteger.reverse(num1));
    }
}
