package lc.slidingwindow.m;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringWithoutRepeatingCharactersTest {
    @Test
    public void testLengthOfLongestSubstring() {
        LongestSubstringWithoutRepeatingCharacters lswrc = new LongestSubstringWithoutRepeatingCharacters();

        String input1 = "abcabcbb";
        int expected1 = 3;
        assertEquals(expected1, lswrc.lengthOfLongestSubstring(input1));

        String input2 = "bbbbb";
        int expected2 = 1;
        assertEquals(expected2, lswrc.lengthOfLongestSubstring(input2));

        String input3 = "pwwkew";
        int expected3 = 3;
        assertEquals(expected3, lswrc.lengthOfLongestSubstring(input3));

        String input4 = "";
        int expected4 = 0;
        assertEquals(expected4, lswrc.lengthOfLongestSubstring(input4));
    }

}