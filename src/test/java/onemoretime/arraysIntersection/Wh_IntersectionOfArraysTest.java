package onemoretime.arraysIntersection;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 */
class Wh_IntersectionOfArraysTest {

    @Test
    void intersection() {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        int[] expectedIntersection = {2};
        int[] actualIntersection = Wh_IntersectionOfArrays.intersection(nums1, nums2);

        assertArrayEquals(expectedIntersection, actualIntersection);
    }
}