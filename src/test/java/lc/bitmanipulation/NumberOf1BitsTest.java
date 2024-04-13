package lc.bitmanipulation;

import lc.bitmanipulation.e.NumberOf1Bits;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOf1BitsTest {
    @Test
    public void testHammingWeight() {
        NumberOf1Bits solution = new NumberOf1Bits();

        assertEquals(3, solution.hammingWeight(11));
        assertEquals(1, solution.hammingWeight(128));
        assertEquals(0, solution.hammingWeight(0));
    }
}