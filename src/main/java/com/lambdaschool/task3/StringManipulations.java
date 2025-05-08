package com.lambdaschool.task3;

import java.util.HashMap;
import java.util.Map;

public class StringManipulations {
    
    /**
     * Checks if a string is a palindrome
     * @param str The string to check
     * @return true if the string is a palindrome, false otherwise
     */
    public boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }
        
        // Convert to lowercase and remove non-alphanumeric characters
        str = str.toLowerCase().replaceAll("[^a-z0-9]", "");
        
        // Empty string is considered a palindrome
        if (str.isEmpty()) {
            return true;
        }
        
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }

    /**
     * Counts the occurrence of each character in a string
     * @param str The string to analyze
     * @return Map containing character counts
     */
    public Map<Character, Integer> countCharacters(String str) {
        if (str == null) {
            return new HashMap<>();
        }

        Map<Character, Integer> charCount = new HashMap<>();
        
        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        
        return charCount;
    }

    /**
     * Finds the longest word in a sentence
     * @param sentence The sentence to analyze
     * @return The longest word in the sentence
     */
    public String findLongestWord(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) {
            return "";
        }

        // Split by any number of whitespace characters
        String[] words = sentence.trim().split("\\s+");
        if (words.length == 0) {
            return "";
        }

        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        
        return longestWord;
    }
} 