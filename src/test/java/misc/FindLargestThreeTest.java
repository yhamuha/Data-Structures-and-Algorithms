package misc;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertArrayEquals;

class FindLargestThreeTest {

    @Test
    public void testFindLargestThree() {
        int[] input1 = {19, 5, 78, 1, 33, 11, 20};
        int[] expected1 = {78, 33, 20};
        assertArrayEquals(expected1, FindLargestThree.findLargestThree(input1));

        int[] input2 = {5, 2, 1};
        int[] expected2 = {5, 2, 1};
        assertArrayEquals(expected2, FindLargestThree.findLargestThree(input2));

        int[] input3 = {10, 8};
        int[] expected3 = new int[0];
        assertArrayEquals(expected3, FindLargestThree.findLargestThree(input3));
    }

}



