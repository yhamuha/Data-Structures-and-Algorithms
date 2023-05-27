package onemoretime.powerOfTwo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 */
class Wh_PowerOfTwoTest {

    @Test
    void isPowerOfTwoTest() {
        // Test cases
        int[] testCases = {4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384};

        for (int number : testCases) {
            assertTrue(Wh_PowerOfTwo.isPowerOfTwo(number), number + " should be a power of two");
        }
    }

}