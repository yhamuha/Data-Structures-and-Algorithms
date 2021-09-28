package misc.problem_solving;

/**
 *
 */
public class NumberOf1Bits {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(hammingWeight(n));
    }

    // Get numbers of "1" bits
    // O(1), O(1)
    static int hammingWeight(int n) {
        int bits = 0;
        int mask = 1;
        for (int i = 0; i < 32; i++) {
            if ((n & mask) != 0) {
                // we've found "1"
                bits++;
            }
            // otherwise mask = mask << 1
            mask <<= 1;
        }
        return bits;
    }

}
