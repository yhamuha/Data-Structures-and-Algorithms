package lc.mathandgeometry.m;

import java.math.BigInteger;

public class MultiplyStrings {
    // O(n) O(1)
    public String multiply(String num1, String num2) {
        BigInteger a=new BigInteger(num1);
        BigInteger b=new BigInteger(num2);
        BigInteger c=a.multiply(b);
        return c+"";
    }
    public static void main(String[] args) {
        String num1 = "123";
        String num2 = "456";
        MultiplyStrings multiplier = new MultiplyStrings();
        System.out.println(multiplier.multiply(num1, num2));
    }
}
