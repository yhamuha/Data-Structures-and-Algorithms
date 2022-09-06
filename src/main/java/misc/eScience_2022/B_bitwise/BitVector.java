package misc.eScience_2022.B_bitwise;

public class BitVector {

    static long VECTOR_SIZE = 0;

    public static void main(String[] args) throws Exception {
        long[] bitVector = initBitVector(50);
        setBit(bitVector, 3);
        unsetBit(bitVector, 4);
        setBit(bitVector, 17);
        boolean a = getBit(bitVector, 3);
        boolean b = getBit(bitVector, 4);
        boolean c = getBit(bitVector, 17);
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
    }

    static long[] initBitVector(long bitsCount) throws Exception {
        if (bitsCount < 0 || bitsCount > 137_438_953_408L)
            throw new Exception("bitsCount should be from 1 to 137,438,953,408");
        VECTOR_SIZE = bitsCount;
        int bucketsCount = (int) (((bitsCount - 1) >> 6) + 1);
        return new long[bucketsCount];
    }

    // simply bitVector range validation
    static void validateRange(long[] bitVector, long bitIndex) throws Exception {
        long bitLastIndex = VECTOR_SIZE - 1;
        if (bitIndex < 0 || bitIndex > bitLastIndex)
            throw new Exception("bitIndex should be in range from 0 to " + bitLastIndex);
    }

    static void setBit(long[] bitVector, long bitIndex) throws Exception {
        validateRange(bitVector, bitIndex);
        int bucketIndex = (int) (bitIndex >> 6);
        long indexInBucket = bitIndex % 64;
        bitVector[bucketIndex] |= 1L << indexInBucket;
    }

    static void unsetBit(long[] bitVector, long bitIndex) throws Exception {
        validateRange(bitVector, bitIndex);
        int bucketIndex = (int) (bitIndex >> 6);
        long indexInBucket = bitIndex % 64;
        bitVector[bucketIndex] &= ~(1L << indexInBucket);
    }

    static boolean getBit(long[] bitVector, long bitIndex) throws Exception {
        validateRange(bitVector, bitIndex);
        int bucketIndex = (int) (bitIndex >> 6);
        long indexInBucket = bitIndex % 64;
        return ((bitVector[bucketIndex] >>> indexInBucket) & 1) == 1;
    }
}
