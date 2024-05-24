package lc.arraysandhashing;

import lc.arraysandhashing.e.TwoOutOfThree;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TwoOutOfThreeTest {

    @Test
    void testMethod(){
        int[] nums1 = {3,1}, nums2 = {2,3}, nums3 = {1,2};
        TwoOutOfThree solution = new TwoOutOfThree();
        List<Integer> expected = Arrays.asList(3,1,2);
        List<Integer> result = solution.twoOutOfThree(nums1, nums2, nums3);
        assertEquals(expected,result);
    }

}