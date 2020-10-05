package misc.bitwise;

public class TwoBinaryNumberInBitDifference {
    public static void main(String[] args) {

        int a = 29; // 0001 1101
        int b = 15; // 0000 1111
        // differ in:     x   x

        System.out.println(countBits(a,b));
    }

    static int countBits( int a, int b) {
        int diffBits = a^ b;
        int oneCount = 0;

        while (diffBits != 0) {
            if ((diffBits & 1) == 1) oneCount++;
            diffBits = diffBits >>> 1;
        }
        return oneCount;
    }
}
