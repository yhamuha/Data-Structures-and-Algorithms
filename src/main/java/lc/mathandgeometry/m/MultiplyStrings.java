package lc.mathandgeometry.m;

import java.math.BigInteger;

public class MultiplyStrings {
    // O(m*n) O(m+n)
    public String multiply(String num1, String num2) {
        int m = num1.length();
        int n = num2.length();
        int[] pos = new int[m + n];
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');  // multiple based on ASCII's
                int p1 = i + j;                     // high digit (left)
                int p2 = i + j + 1;                 // low digit (right)
                int sum = mul + pos[p2];
                pos[p1] += sum / 10;                // put high digit
                pos[p2] = (sum) % 10;               // put low digit
            }
        }
        StringBuilder sb = new StringBuilder();     // get all except of initial zeroes to sb
        for (int p : pos) {
            if (!(sb.length() == 0 && p == 0)) {
                sb.append(p);
            }
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }
    public static void main(String[] args) {
        String num1 = "22";
        String num2 = "3";
        MultiplyStrings multiplier = new MultiplyStrings();
        System.out.println(multiplier.multiply(num1, num2));
    }
}
