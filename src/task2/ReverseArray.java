package task2;

/**
 * This class demonstrates how to reverse an array in-place.
 */
public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        
        System.out.println("Original Array:");
        printArray(array);
        
        reverseArray(array);
        
        System.out.println("Reversed Array:");
        printArray(array);
    }
    
    /**
     * Reverses an array in-place without using additional data structures
     * @param array The array to be reversed
     */
    public static void reverseArray(int[] array) {
        // Implement this method to reverse the array in-place
        if (array == null || array.length <= 1) {
            return; // No need to reverse empty or single-element arrays
        }
        
        int left = 0;
        int right = array.length - 1;
        
        // Swap elements from both ends moving inward
        while (left < right) {
            // Swap elements
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            
            // Move indices toward the center
            left++;
            right--;
        }
    }
    
    /**
     * Helper method to print an array
     * @param array The array to be printed
     */
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
