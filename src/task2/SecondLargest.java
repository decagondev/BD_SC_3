package task2;

/**
 * This class finds the second largest element in an array.
 */
public class SecondLargest {
    public static void main(String[] args) {
        int[] array1 = {12, 35, 1, 10, 34, 1};
        int[] array2 = {10, 5, 10};
        int[] array3 = {10, 10, 10};
        
        System.out.println("Second largest in array1: " + findSecondLargest(array1));
        System.out.println("Second largest in array2: " + findSecondLargest(array2));
        System.out.println("Second largest in array3: " + findSecondLargest(array3));
    }
    
    /**
     * Finds the second largest element in an array
     * @param array The input array
     * @return The second largest element, or Integer.MIN_VALUE if no second largest exists
     */
    public static int findSecondLargest(int[] array) {
        // Check if array has at least two elements
        if (array == null || array.length < 2) {
            return Integer.MIN_VALUE;
        }
        
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        // Find the largest and second largest elements in one pass
        for (int num : array) {
            // If current element is larger than largest
            if (num > largest) {
                // Update second largest to previous largest
                secondLargest = largest;
                // Update largest to current element
                largest = num;
            } 
            // If current element is between largest and second largest
            else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        
        // If no second largest element found (all elements are the same)
        if (secondLargest == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        
        return secondLargest;
    }
}
