package com.lambdaschool.task2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArrayOperationsTest {
    private ArrayOperations arrayOps;

    @BeforeEach
    void setUp() {
        arrayOps = new ArrayOperations();
    }

    @Test
    void testReverseArray() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] expected = {5, 4, 3, 2, 1};
        arrayOps.reverseArray(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    void testReverseArrayWithEvenLength() {
        int[] arr = {1, 2, 3, 4};
        int[] expected = {4, 3, 2, 1};
        arrayOps.reverseArray(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    void testFindSecondLargest() {
        int[] arr = {5, 2, 8, 1, 9};
        assertEquals(8, arrayOps.findSecondLargest(arr));
    }

    @Test
    void testFindSecondLargestWithDuplicates() {
        int[] arr = {5, 5, 8, 8, 9};
        assertEquals(8, arrayOps.findSecondLargest(arr));
    }

    @Test
    void testFindSecondLargestThrowsException() {
        int[] arr = {1};
        assertThrows(IllegalArgumentException.class, () -> arrayOps.findSecondLargest(arr));
    }

    @Test
    void testMergeSortedArrays() {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};
        int[] expected = {1, 2, 3, 4, 5, 6};
        assertArrayEquals(expected, arrayOps.mergeSortedArrays(arr1, arr2));
    }

    @Test
    void testMergeSortedArraysWithDuplicates() {
        int[] arr1 = {1, 2, 2};
        int[] arr2 = {2, 3, 3};
        int[] expected = {1, 2, 2, 2, 3, 3};
        assertArrayEquals(expected, arrayOps.mergeSortedArrays(arr1, arr2));
    }
} 