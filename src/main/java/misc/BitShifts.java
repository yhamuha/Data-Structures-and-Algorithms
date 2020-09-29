package misc;

public class BitShifts {

    // driver method
    public static void main(String[] args) throws Exception {
//        try {
//            System.out.println(Arrays.toString(initBitVector(16)));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        // LSRfor32bit();
//        /*int i = 20;
//        System.out.println(getHighestBit(i) + " " + getLowestBit(i));*/
//        // traversal
//        /*lowToHigh(i);*/
//
//        // how to implement Math.ceil inside JDK
//        /*Math.ceil(100.0);
//        System.out.println();*/
//
        // 2^6
        // bitwiseSandbox();

        System.out.println(inverseBits((byte) 15, 2));
        System.out.println(setBits((byte) 16, 2));
        System.out.println(unsetBits((byte) 15, 2));
        System.out.println(unsetLSBits((byte) 15, 6));
        System.out.println(unsetMSBits((byte) 15, 2));
        System.out.println(getBit((byte) 15, 3));



    }

    static void bitwiseSandbox() throws Exception {

        long[] bitVector = BitShifts.initBitVector(12);

        // needs bitVector methods

        // logical operations
        byte x = 0000_0000_0000_0011;
        byte y = 0000_0000_0000_0101;
        System.out.print("&:"+ (x&y) + " |: " + (x|y) + " ^: " + (x^y));




    }



    // (data>>>i)&1u
    static byte getBit(byte data, int i) {
        // data>>>1
        byte tmp = (byte)(data>>>i);
        // (data>>>i)&1u
        return (byte)(tmp&1);
    }

    // (~0u>>>i)&data
    static byte unsetMSBits(byte data, int i) {
        // ~0u>>>1
        byte tmp = (byte)(~0<<i);
        // (~0u>>>1)|data
        return (byte)(tmp&data);
    }

    // (~0u<<i)&data
    static byte unsetLSBits(byte data, int i) {
        // ~0u<<1
        byte tmp = (byte)(~0<<i);
        // (~0u<<1)|data
        return (byte)(tmp&data);
    }

    // ~(1u<<i)&data
    static byte unsetBits(byte data, int i) {
        // ~1u<<1
        byte tmp = (byte)~(1<<i);
        // ~(1u<<1)|data
        return (byte)(tmp&data);
    }

    // (1u<<i)|data
    static byte setBits(byte data, int i) {
        // 1u<<1
        byte tmp = (byte)(1<<i);
        // (1u<<1)|data
        return (byte)(tmp|data);
    }

    // (1u<<i)^data
    static byte inverseBits(byte data, int i){
        // 1u<<1
        byte tmp = (byte)(1 << i);
        // (1u<<1)^data
        return (byte)(tmp^data);
    }

    // arithmetic right shift
    static byte asr (byte n, int count) {
        return (byte) ((byte) n >>> count);
    }

    // logical left shift
    static byte lsl (byte n, int count) {
        return (byte) ((byte) n << count);
    }
    // logical right shift
    static byte lsr (byte n, int count) {
        return (byte) ((byte) n >> count);
    }

    // array for bit vector
    static long[] initBitVector(long bitsCount) throws Exception {

        // check for type overflow
        if (bitsCount < 0 || bitsCount > 137_438_953_408L)
            throw new Exception("bits should be from 1 to 137_438_953_408");

        long VECTOR_SIZE = bitsCount;

        int bucketCount = (int) (((bitsCount - 1) >> 6) + 1);

        return new long[bucketCount];
    }


    // ASR(L) doesn't work with float and double types
    static void floatDoubleShiftTest () {
        float x = 1f;
        double y = 1d;
        int result;

//        result = x << 1;
//        result = y << 1;
    }

    // Logical Shift to Right for 31 bit int
    static void LSRfor32bit (){
        int x = 0b10000000_00000000_00000000_00000000;
        int resultForLSR31 = (x >>> 31);
        // but we ca'nt do that using >> 32:
        int resultForLSR32 = (x >>> 32);
        int resultForLSR31plusLSR1 = (x >>> 31) >>> 1;
        System.out.println(resultForLSR31);
        System.out.println(resultForLSR32);
        System.out.println(resultForLSR31plusLSR1);
    }

    // get MSB
    static int getHighestBit (int data) {
        return data >> 31;
    }

    // get LSB
    static int getLowestBit (int data) {
        return data & 1;
    }

    // lowToHighTraversal bit by bit on int
    static void lowToHigh(int bits) {
        int data = bits;
        /*for (int i=0; i< 32; i++)*/
        // we can decrease not necessaries cpu's cycles
        while (data !=0) {
            int bit = getLowestBit(data);
            System.out.print(bit);
            data = data >> 1;
        }
    }

}
