package misc.problem_solving;
import java.math.BigInteger;

/**
 *
 */
public class AddBinary {
    public static void main(String[] args) {
    String a = "001";
    String b = "011";
    System.out.println(addBinary2(a,b));
    }

    // using built-in with drawbacks
    static String addBinary(String a, String b) {
        return Integer.toBinaryString(Integer.parseInt(a, 2) + Integer.parseInt(b, 2));
    }

    static String addBinary2(String a, String b) {
        BigInteger x = new BigInteger(a, 2);
        BigInteger y = new BigInteger(b, 2);
        BigInteger zero = new BigInteger("0", 2);
        BigInteger carry, answer;
        while (y.compareTo(zero) != 0) {
            answer = x.xor(y);
            carry = x.and(y).shiftLeft(1);
            x = answer;
            y = carry;
        }
        return x.toString(2);
    }
}
