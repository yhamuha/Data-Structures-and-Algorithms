package misc.eScience_2022.B_bitwise;

/**
 *
 */
public class PairwiseSwap {
    public static void main(String[] args) {
        int num = 9;
        System.out.println(pairwiseSwap(num));
    }

    //      1001
    // odd  1010
    // &    1000
    // >>>1 0100

    //      1001
    // even 0101
    // &    0001
    // <<1  0010

    // swap odd and even bits in uint32
    static int pairwiseSwap(int num) {
        int oddMask = 0xAAAAAAAA;
        int evenMask = 0x55555555;
        oddMask = (num & oddMask);  // put to "0" all odd "1"'s
        oddMask = oddMask >>> 1;    //
        evenMask = (num & evenMask);// put to "0" all even "1"'s
        evenMask = evenMask << 1;   //
        return oddMask | evenMask;
    }
}
