package lc.slidingwindow.m;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestRepeatingCharacterReplacementTest {
    @Test
    public void testCharacterReplacement() {
        LongestRepeatingCharacterReplacement lrc = new LongestRepeatingCharacterReplacement();
        assertEquals(4, lrc.characterReplacement("AABABBA", 1));
        assertEquals(5, lrc.characterReplacement("AAAAA", 2));
        assertEquals(7, lrc.characterReplacement("BBBBBBB", 0));
        assertEquals(5, lrc.characterReplacement("ABABAB", 2));
        assertEquals(1, lrc.characterReplacement("A", 0));
        assertEquals(0, lrc.characterReplacement("", 1));
        assertEquals(7, lrc.characterReplacement("ABABBAAAABA", 2));
        assertEquals(3, lrc.characterReplacement("XYZ", 2));
    }
}