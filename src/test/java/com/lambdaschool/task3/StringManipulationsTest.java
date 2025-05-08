package com.lambdaschool.task3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;

class StringManipulationsTest {
    private StringManipulations stringManip;

    @BeforeEach
    void setUp() {
        stringManip = new StringManipulations();
    }

    @Test
    void testIsPalindrome() {
        assertTrue(stringManip.isPalindrome("A man a plan a canal Panama"));
        assertFalse(stringManip.isPalindrome("race a car"));
        assertFalse(stringManip.isPalindrome("hello"));
        assertTrue(stringManip.isPalindrome(""));
        assertFalse(stringManip.isPalindrome(null));
    }

    @Test
    void testCountCharacters() {
        Map<Character, Integer> result = stringManip.countCharacters("hello");
        assertEquals(1, result.get('h'));
        assertEquals(1, result.get('e'));
        assertEquals(2, result.get('l'));
        assertEquals(1, result.get('o'));

        assertTrue(stringManip.countCharacters("").isEmpty());
        assertTrue(stringManip.countCharacters(null).isEmpty());
    }

    @Test
    void testFindLongestWord() {
        assertEquals("longest", stringManip.findLongestWord("This is the longest word"));
        assertEquals("single", stringManip.findLongestWord("A single word"));
        assertEquals("", stringManip.findLongestWord(""));
        assertEquals("", stringManip.findLongestWord(null));
    }

    @Test
    void testFindLongestWordWithMultipleSpaces() {
        assertEquals("multiple", stringManip.findLongestWord("Testing    multiple   spaces"));
    }
} 