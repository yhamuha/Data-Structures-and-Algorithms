package cs.bitmanipulations;

public class BitVector {

    int HDD = 1;
    int PRINT = 2;
    int SCREEN = 4;
    int NETWORK = 8;
    int EXDRIVE = 16;

    long VECTOR_SIZE;

    void processData(int flags) {
        if ((flags & HDD) != 0) System.out.println("HDD");
        if ((flags & PRINT) != 0) System.out.println("PRINT");
        if ((flags & SCREEN) != 0) System.out.println("SCREEN");
        if ((flags & NETWORK) != 0) System.out.println("NETWORK");
        if ((flags & EXDRIVE) != 0) System.out.println("EXDRIVE");
    }

    public static void main(String[] args) {
        BitVector bv = new BitVector();
        bv.processData(1);
    }

    long[] initBitVector(long bitsCount) throws Exception {

        // 64 bit type for cell; 32 bit in each of cell (2^31 -1)
        // 137_438_953_408 = 64 * (2^31-1)
        if (bitsCount < 0 || bitsCount > 137_438_953_408L)
            throw new Exception("bitsCount should be from 1 to 137,438,953,408");
        VECTOR_SIZE = bitsCount;
        // /64 equals of /2^6 (>> 6)
        int bucketsCount = (int) (((bitsCount - 1) >> 6) + 1);
        return new long[bucketsCount];
    }

    void validateRange(long[] bitVector, long bitIndex) throws Exception {
        long bitLastIndex = VECTOR_SIZE - 1;
        if (bitIndex < 0 || bitIndex > bitLastIndex)
            throw new Exception("bitIndex should be in range from 0 to " + bitLastIndex);
    }
    void setBit(long[] bitVector, long bitIndex) throws Exception {
        validateRange(bitVector, bitIndex);
        int bucketIndex = (int) (bitIndex >> 6);
        bitVector[bucketIndex] |= 1L << bitIndex;
    }
    void unsetBit(long[] bitVector, long bitIndex) throws Exception {
        validateRange(bitVector, bitIndex);
        int bucketIndex = (int) (bitIndex >> 6);
        bitVector[bucketIndex] &= ~(1L << bitIndex);
    }
}
