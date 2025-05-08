package com.lambdaschool.task4;

public class PassByValueDemo {
    
    /**
     * Demonstrates that modifying a primitive parameter doesn't affect the original value
     * @param x The primitive value to modify
     * @return The original value of x
     */
    public int modifyPrimitive(int x) {
        int original = x;
        x = x + 10;  // This modification won't affect the caller's value
        return original;
    }

    /**
     * Demonstrates that modifying an object through a reference parameter affects the original object
     * @param numbers The array to modify
     * @return The original first element of the array
     */
    public int modifyObject(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }
        
        int original = numbers[0];
        numbers[0] = 100;  // This modification affects the original array
        return original;
    }

    /**
     * Demonstrates that reassigning a reference parameter doesn't affect the original reference
     * @param numbers The array reference to reassign
     * @return The original array
     */
    public int[] reassignReference(int[] numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("Array must not be null");
        }
        
        int[] original = numbers.clone();
        numbers = new int[]{1, 2, 3};  // This reassignment won't affect the caller's reference
        return original;
    }

    // Helper class for demonstrating object modification
    public static class MutableObject {
        private int value;

        public MutableObject(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }
} 