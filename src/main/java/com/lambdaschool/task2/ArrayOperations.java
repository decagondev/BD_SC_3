package com.lambdaschool.task2;

public class ArrayOperations {
    
    /**
     * Reverses an array in-place without using additional data structures
     * @param arr The array to reverse
     */
    public void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left < right) {
            // Swap elements
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            
            left++;
            right--;
        }
    }

    /**
     * Finds the second largest element in an array
     * @param arr The array to search
     * @return The second largest element
     * @throws IllegalArgumentException if array has less than 2 elements
     */
    public int findSecondLargest(int[] arr) {
        if (arr.length < 2) {
            throw new IllegalArgumentException("Array must have at least 2 elements");
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("No second largest element found");
        }

        return secondLargest;
    }

    /**
     * Merges two sorted arrays into a single sorted array
     * @param arr1 First sorted array
     * @param arr2 Second sorted array
     * @return Merged sorted array
     */
    public int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        // Compare and merge
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                result[k++] = arr1[i++];
            } else {
                result[k++] = arr2[j++];
            }
        }

        // Copy remaining elements from arr1
        while (i < arr1.length) {
            result[k++] = arr1[i++];
        }

        // Copy remaining elements from arr2
        while (j < arr2.length) {
            result[k++] = arr2[j++];
        }

        return result;
    }
} 