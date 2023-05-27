package onemoretime.arraysIntersection;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 */
class IntersectionTwoArraysTest {

    @Test
    void interSection() {
        int[] num1 = {1,2,2,1};
        int[] num2 = {2,2};
        int[] expectedIntersection = {2};
        int[] actualIntersection = IntersectionTwoArrays.interSection(num1,num2);
        assertArrayEquals(expectedIntersection,actualIntersection);
    }
}