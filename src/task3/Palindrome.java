package task3;

/**
 * This class checks if a string is a palindrome.
 * A palindrome is a word, phrase, number, or other sequence of characters
 * that reads the same forward and backward.
 */
public class Palindrome {
    public static void main(String[] args) {
        // Test cases
        String str1 = "racecar";
        String str2 = "hello";
        String str3 = "Madam";  // Case-sensitive
        String str4 = "A man, a plan, a canal: Panama";  // With spaces and punctuation
        
        System.out.println("\"" + str1 + "\" is a palindrome: " + isPalindrome(str1));
        System.out.println("\"" + str2 + "\" is a palindrome: " + isPalindrome(str2));
        System.out.println("\"" + str3 + "\" is a palindrome (case-sensitive): " + isPalindrome(str3));
        System.out.println("\"" + str3 + "\" is a palindrome (case-insensitive): " + isPalindromeIgnoreCase(str3));
        System.out.println("\"" + str4 + "\" is a palindrome (ignoring non-alphanumeric): " + 
                          isPalindromeIgnoreNonAlphanumeric(str4));
    }
    
    /**
     * Checks if a string is a palindrome (case-sensitive)
     * @param str The input string
     * @return true if the string is a palindrome, false otherwise
     */
    public static boolean isPalindrome(String str) {
        if (str == null || str.length() <= 1) {
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
     * Checks if a string is a palindrome (case-insensitive)
     * @param str The input string
     * @return true if the string is a palindrome, false otherwise
     */
    public static boolean isPalindromeIgnoreCase(String str) {
        if (str == null || str.length() <= 1) {
            return true;
        }
        
        // Convert to lowercase for case-insensitive comparison
        str = str.toLowerCase();
        
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
     * Checks if a string is a palindrome (ignoring non-alphanumeric characters)
     * @param str The input string
     * @return true if the string is a palindrome, false otherwise
     */
    public static boolean isPalindromeIgnoreNonAlphanumeric(String str) {
        if (str == null || str.length() <= 1) {
            return true;
        }
        
        // Convert to lowercase for case-insensitive comparison
        str = str.toLowerCase();
        
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            // Skip non-alphanumeric characters from left
            while (left < right && !Character.isLetterOrDigit(str.charAt(left))) {
                left++;
            }
            
            // Skip non-alphanumeric characters from right
            while (left < right && !Character.isLetterOrDigit(str.charAt(right))) {
                right--;
            }
            
            // Compare characters
            if (left < right && str.charAt(left) != str.charAt(right)) {
                return false;
            }
            
            left++;
            right--;
        }
        
        return true;
    }
}
