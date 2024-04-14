package lc.bitmanipulation.e;

public class ReverseBits {
    // O(32) O(1)
    public int reverseBits(int n) {
        int rev = 0;
        for (int i = 0; i < 32; i++) {
            rev <<= 1;
            rev |= (n & 1);
            n >>= 1;
        }
        return rev;
    }
    public static void main(String[] args) {
        ReverseBits reverseBits = new ReverseBits();
        int n = 43261596;
        System.out.println("Reversed bits of " + n + ": " + reverseBits.reverseBits(n));
    }
}
