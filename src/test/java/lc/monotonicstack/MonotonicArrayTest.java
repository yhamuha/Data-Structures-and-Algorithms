package lc.monotonicstack;

import lc.monotonicstack.e.MonotonicArray;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MonotonicArrayTest {

    private MonotonicArray monotonicArray;

    @BeforeEach
    public void setUp() {
        monotonicArray = new MonotonicArray();
    }

    @Test
    public void testIsMonotonic1() {
        int[] nums1 = {1, 2, 2, 3};
        assertTrue(monotonicArray.isMonotonic(nums1));
    }

    @Test
    public void testIsMonotonic2() {
        int[] nums2 = {3, 2, 1};
        assertTrue(monotonicArray.isMonotonic(nums2));
    }

    @Test
    public void testIsMonotonic3() {
        int[] nums3 = {1, 3, 2};
        assertFalse(monotonicArray.isMonotonic(nums3));
    }

    @Test
    public void testIsMonotonic4() {
        int[] nums4 = {5, 3, 2, 4, 1};
        assertFalse(monotonicArray.isMonotonic(nums4));
    }

}