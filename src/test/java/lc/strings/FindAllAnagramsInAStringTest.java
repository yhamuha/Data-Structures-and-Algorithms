package lc.strings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindAllAnagramsInAStringTest {

    private FindAllAnagramsInAString anagramFinder;

    @BeforeEach
    public void setUp() {
        anagramFinder = new FindAllAnagramsInAString();
    }

    @Test
    public void testFindAnagrams_AnagramFoundAtBeginning() {
        List<Integer> result = anagramFinder.findAnagrams("cbaebabacd", "abc");
        assertEquals(Arrays.asList(0, 6), result);
    }

    @Test
    public void testFindAnagrams_AnagramNotFound() {
        List<Integer> result = anagramFinder.findAnagrams("hello", "abc");
        assertEquals(Arrays.asList(), result);
    }

    @Test
    public void testFindAnagrams_AnagramFoundMultipleTimes() {
        List<Integer> result = anagramFinder.findAnagrams("abab", "ab");
        assertEquals(Arrays.asList(0, 1, 2), result);
    }

    @Test
    public void testFindAnagrams_AnagramFoundAtEnd() {
        List<Integer> result = anagramFinder.findAnagrams("abcdcba", "abc");
        assertTrue(result.contains(4));
    }
}