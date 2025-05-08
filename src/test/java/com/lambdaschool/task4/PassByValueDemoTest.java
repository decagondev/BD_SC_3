package com.lambdaschool.task4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PassByValueDemoTest {
    private PassByValueDemo demo;

    @BeforeEach
    void setUp() {
        demo = new PassByValueDemo();
    }

    @Test
    void testModifyPrimitive() {
        int x = 5;
        int original = demo.modifyPrimitive(x);
        assertEquals(5, original);
        assertEquals(5, x);  // Original value remains unchanged
    }

    @Test
    void testModifyObject() {
        int[] numbers = {5, 10, 15};
        int original = demo.modifyObject(numbers);
        assertEquals(5, original);
        assertEquals(100, numbers[0]);  // Array element is modified
        assertEquals(10, numbers[1]);   // Other elements remain unchanged
    }

    @Test
    void testModifyObjectWithNull() {
        assertThrows(IllegalArgumentException.class, () -> demo.modifyObject(null));
    }

    @Test
    void testReassignReference() {
        int[] numbers = {5, 10, 15};
        int[] original = demo.reassignReference(numbers);
        assertArrayEquals(new int[]{5, 10, 15}, original);
        assertArrayEquals(new int[]{5, 10, 15}, numbers);  // Original array remains unchanged
    }

    @Test
    void testReassignReferenceWithNull() {
        assertThrows(IllegalArgumentException.class, () -> demo.reassignReference(null));
    }

    @Test
    void testMutableObject() {
        PassByValueDemo.MutableObject obj = new PassByValueDemo.MutableObject(5);
        assertEquals(5, obj.getValue());
        obj.setValue(10);
        assertEquals(10, obj.getValue());
    }
} 