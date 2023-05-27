package onemoretime.sumOfDigits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 */
class Wh_SumOfDigitsTest {
    @Test
    public void testSumOfDigits() {
        int number = 12345;
        int expectedSum = 15;
        int actualSum = Wh_SumOfDigits.digitSum(number);
        assertEquals(expectedSum, actualSum);
    }
}