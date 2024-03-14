package lc.strings;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RemoveLetterToEqualizeFrequencyTest {
    private RemoveLetterToEqualizeFrequency obj;

    @Before
    public void setUp() {
        obj = new RemoveLetterToEqualizeFrequency();
    }

    @Test
    public void testWordLengthLessThanOrEqualTo2() {
        assertTrue(obj.equalFrequency("ab"));
    }

    @Test
    public void testSingleCharacter() {
        assertTrue(obj.equalFrequency("a"));
    }

    @Test
    public void testAllCharactersWithEqualFrequency() {
        assertTrue(obj.equalFrequency("abcde"));
    }

    @Test
    public void testOneCharacterWithDifferentFrequency() {
        assertTrue(obj.equalFrequency("hello"));
    }

    @Test
    public void testTwoCharactersWithDifferentFrequencies() {
        assertTrue(obj.equalFrequency("aaabb"));
    }

    @Test
    public void testAllCharactersWithDifferentFrequencies() {
        assertFalse(obj.equalFrequency("aabbccddee"));
    }

    @Test
    public void testLongStringWithEqualFrequencies() {
        assertFalse(obj.equalFrequency("abcdefgabcdefg"));
    }

    @Test
    public void testLongStringWithDifferentFrequencies() {
        assertFalse(obj.equalFrequency("aaabbbcccdddeeefff"));
    }
}