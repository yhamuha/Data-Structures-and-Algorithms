package lc.arraysandhashing;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindTheDifferenceOfTwoArraysTest {
    @Test
    void testDifference(){
        FindTheDifferenceOfTwoArrays solution = new FindTheDifferenceOfTwoArrays();
        int[] nums1 = {1,2,3}, nums2 = {2,4,6};
        List<List<Integer>> expected = List.of(List.of(1, 3), List.of(4, 6));
        List<List<Integer>> result = solution.findDifference(nums1,nums2);
        assertEquals(expected, result);
    }
}