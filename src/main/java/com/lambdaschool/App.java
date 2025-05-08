package com.lambdaschool;

import com.lambdaschool.task1.LoopPatterns;
import com.lambdaschool.task2.ArrayOperations;
import com.lambdaschool.task3.StringManipulations;
import com.lambdaschool.task4.PassByValueDemo;

public class App {
    public static void main(String[] args) {
        // Task 1: Loop Patterns
        System.out.println("Task 1: Loop Patterns");
        LoopPatterns loopPatterns = new LoopPatterns();
        
        System.out.println("\nTriangle Pattern:");
        System.out.println(loopPatterns.createTriangle(5));
        
        System.out.println("Prime numbers below 20:");
        int[] primes = loopPatterns.findPrimes(20);
        for (int prime : primes) {
            System.out.print(prime + " ");
        }
        System.out.println("\n");

        // Task 2: Array Operations
        System.out.println("\nTask 2: Array Operations");
        ArrayOperations arrayOps = new ArrayOperations();
        
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Original array:");
        printArray(arr);
        
        arrayOps.reverseArray(arr);
        System.out.println("Reversed array:");
        printArray(arr);
        
        // Task 3: String Manipulations
        System.out.println("\nTask 3: String Manipulations");
        StringManipulations stringManip = new StringManipulations();
        
        String palindrome = "A man a plan a canal Panama";
        System.out.println("Is '" + palindrome + "' a palindrome? " + 
                          stringManip.isPalindrome(palindrome));
        
        // Task 4: Pass-by-value Demonstration
        System.out.println("\nTask 4: Pass-by-value Demonstration");
        PassByValueDemo passDemo = new PassByValueDemo();
        
        int x = 5;
        System.out.println("Original primitive value: " + x);
        passDemo.modifyPrimitive(x);
        System.out.println("After modification attempt: " + x);
        
        int[] numbers = {5, 10, 15};
        System.out.println("\nOriginal array:");
        printArray(numbers);
        passDemo.modifyObject(numbers);
        System.out.println("After modifying object:");
        printArray(numbers);
    }
    
    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
} 