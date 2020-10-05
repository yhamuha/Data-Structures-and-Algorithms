package misc.bitwise;

public class SwapBitsFromEvenToOdd {


    public static void main(String[] args) {
        System.out.println(pairwiseSwap(8));
    }

    static int pairwiseSwap(int num){
        int oddMask = 0xAAAAAAAA;       // 1010 .... 1010
        int evenMask = 0x55555555;      // 0101 .... 0101

        oddMask = (num & oddMask);      // all odd to 0
        oddMask = oddMask >>> 1;        // shift even to odd
                                        // >>>: do not need to use sign bit

        evenMask = (num & evenMask);    // all even to 0
        evenMask = evenMask << 1;       // shift odd to even

        return oddMask | evenMask;      // merge
    }
}
