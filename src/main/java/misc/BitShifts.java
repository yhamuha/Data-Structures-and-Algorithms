package misc;

import java.util.Arrays;

public class BitShifts {

    // driver method
    public static void main(String[] args) {

        /*try {
            System.out.println(Arrays.toString(initBitVector(16)));
        } catch (Exception e) {
            e.printStackTrace();
        }*/

        LSRfor32bit();

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
        int resultForLSR31plusLSR1 = (x >>> 31) >>> 1;
        System.out.println(resultForLSR31);
        System.out.println(resultForLSR31plusLSR1);
    }
}
