package lc.arraysandhashing;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

class IntersectionOfMultipleArraysTest {
    @Test
    public void testIntersection() {
        IntersectionOfMultipleArrays solution = new IntersectionOfMultipleArrays();
        int[][] nums = {{3, 1, 2, 4, 5}, {1, 2, 3, 4}, {3, 4, 5, 6}};
        List<Integer> expected = Arrays.asList(3, 4);
        List<Integer> result = solution.intersection(nums);
        assertEquals(expected, result);
    }
}



