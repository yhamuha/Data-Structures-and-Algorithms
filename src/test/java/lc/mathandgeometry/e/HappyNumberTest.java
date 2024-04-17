package lc.mathandgeometry.e;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HappyNumberTest {
    @Test
    public void testIsHappy() {
        HappyNumber happyNumber = new HappyNumber();
        assertTrue(happyNumber.isHappy(19));
        assertFalse(happyNumber.isHappy(4));
    }
}