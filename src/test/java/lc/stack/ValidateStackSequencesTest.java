package lc.stack;

import lc.stack.m.ValidateStackSequences;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidateStackSequencesTest {
    @Test
    void initTest(){
        int[] pushed = {1,2,3,4,5}, popped = {4,3,5,1,2};
        ValidateStackSequences solution = new ValidateStackSequences();
        boolean expected = false;
        boolean result = solution.validateStackSequences(pushed, popped);
        assertEquals(expected,result);
    }
}