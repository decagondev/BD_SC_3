package task3;

import java.util.HashMap;
import java.util.Map;

/**
 * This class counts the occurrence of each character in a string.
 */
public class CharCount {
    public static void main(String[] args) {
        // Test cases
        String str1 = "hello world";
        String str2 = "programming";
        
        System.out.println("Character count in \"" + str1 + "\":");
        countCharacters(str1);
        
        System.out.println("\nCharacter count in \"" + str2 + "\":");
        countCharacters(str2);
    }
    
    /**
     * Counts and prints the occurrence of each character in a string
     * @param str The input string
     */
    public static void countCharacters(String str) {
        if (str == null || str.isEmpty()) {
            System.out.println("Empty or null string");
            return;
        }
        
        // Using HashMap to store character counts
        Map<Character, Integer> charCountMap = new HashMap<>();
        
        // Count each character
        for (char c : str.toCharArray()) {
            // Update count in the map
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        
        // Print character counts
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            char c = entry.getKey();
            int count = entry.getValue();
            
            // Print character and its count
            if (c == ' ') {
                System.out.println("Space: " + count);
            } else {
                System.out.println("'" + c + "': " + count);
            }
        }
    }
}
