package lc.binarysearch.e;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubsequenceWithLimitedSumTest {
    @Test
    public void testAnswerQueries1() {
        LongestSubsequenceWithLimitedSum lcs = new LongestSubsequenceWithLimitedSum();

        int[] nums1 = {4, 5, 2, 1};
        int[] queries1 = {3, 10, 21};
        int[] expected1 = {2, 3, 4};
        assertArrayEquals(expected1, lcs.answerQueries(nums1, queries1));
    }

    @Test
    public void testAnswerQueries2() {
        LongestSubsequenceWithLimitedSum lcs = new LongestSubsequenceWithLimitedSum();

        int[] nums2 = {2, 3, 4, 5};
        int[] queries2 = {1};
        int[] expected2 = {0};
        assertArrayEquals(expected2, lcs.answerQueries(nums2, queries2));
    }
}