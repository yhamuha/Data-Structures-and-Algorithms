package misc;

public class countBits {

    // 11101   a
    // 01111   b
    // 10010   ^

    // return count of 1's from the bits sequence after XOR
    int countBits(int a, int b) {
        int diffBits = a ^ b;
        int onesCount = 0;

        while (diffBits !=0) {
            if ((diffBits & 1) == 1) onesCount++;
            diffBits = diffBits >>> 1;
        }
        return onesCount;
    }

    // get lsb
    int getLowestBit(int data) {
        return data & 1;
    }

    // data traversal bit by bit
    void lowToHigh(int bits) {
        int data = bits;

        for(int i=0;i<32;i++) {
            int bit = getLowestBit(data);
            System.out.println(bit);
            data = data >>> 1;
        }
    }
}
