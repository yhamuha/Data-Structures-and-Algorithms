package onemoretime.powerOfTwo;

/*
 * Power of two. Algo based on the fact that binary presentation of number-1 along with number comparing
 * return 0
 */

public class Wh_PowerOfTwo {
    public static boolean isPowerOfTwo (int number) {
        if (number <=1) return false;
        return (number & (number-1))==0;
    }

    public static void main (String[] str) {
        int number =15;
        System.out.println (isPowerOfTwo(number));
    }
}

