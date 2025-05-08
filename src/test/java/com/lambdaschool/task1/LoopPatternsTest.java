package com.lambdaschool.task1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LoopPatternsTest {
    private LoopPatterns loopPatterns;

    @BeforeEach
    void setUp() {
        loopPatterns = new LoopPatterns();
    }

    @Test
    void testCreateTriangle() {
        String expected = 
            "  *\n" +
            " ***\n" +
            "*****\n";
        assertEquals(expected, loopPatterns.createTriangle(3));
    }

    @Test
    void testFindPrimes() {
        int[] expected = {2, 3, 5, 7, 11, 13, 17, 19};
        assertArrayEquals(expected, loopPatterns.findPrimes(20));
    }

    @Test
    void testSumOfDigits() {
        assertEquals(6, loopPatterns.sumOfDigits(123));
        assertEquals(10, loopPatterns.sumOfDigits(1234));
        assertEquals(15, loopPatterns.sumOfDigits(12345));
    }
} 