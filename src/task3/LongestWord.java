package task3;

/**
 * This class finds the longest word in a sentence.
 */
public class LongestWord {
    public static void main(String[] args) {
        // Test cases
        String sentence1 = "The quick brown fox jumps over the lazy dog";
        String sentence2 = "Java programming is fun and challenging";
        String sentence3 = "Hello world";
        
        System.out.println("Longest word in \"" + sentence1 + "\": " + findLongestWord(sentence1));
        System.out.println("Longest word in \"" + sentence2 + "\": " + findLongestWord(sentence2));
        System.out.println("Longest word in \"" + sentence3 + "\": " + findLongestWord(sentence3));
    }
    
    /**
     * Finds the longest word in a sentence
     * @param sentence The input sentence
     * @return The longest word, or an empty string if the sentence is empty
     */
    public static String findLongestWord(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return "";
        }
        
        // Split the sentence into words using space as delimiter
        String[] words = sentence.split(" ");
        
        String longestWord = "";
        
        // Find the longest word
        for (String word : words) {
            // Remove any punctuation (optional)
            String cleanWord = word.replaceAll("[^a-zA-Z0-9]", "");
            
            // Update longest word if current word is longer
            if (cleanWord.length() > longestWord.length()) {
                longestWord = cleanWord;
            }
        }
        
        return longestWord;
    }
}
