package task2;

/**
 * This class merges two sorted arrays into a single sorted array.
 */
public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8, 10};
        
        int[] merged = mergeSortedArrays(arr1, arr2);
        
        System.out.println("Merged array:");
        for (int num : merged) {
            System.out.print(num + " ");
        }
    }
    
    /**
     * Merges two sorted arrays into a single sorted array
     * @param arr1 First sorted array
     * @param arr2 Second sorted array
     * @return New array containing all elements from arr1 and arr2, sorted
     */
    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        // Handle edge cases
        if (arr1 == null || arr1.length == 0) {
            return arr2;
        }
        if (arr2 == null || arr2.length == 0) {
            return arr1;
        }
        
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] result = new int[n1 + n2];
        
        // Pointers for arr1, arr2, and result
        int i = 0, j = 0, k = 0;
        
        // Compare elements from both arrays and add the smaller one to result
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                result[k++] = arr1[i++];
            } else {
                result[k++] = arr2[j++];
            }
        }
        
        // Add remaining elements from arr1, if any
        while (i < n1) {
            result[k++] = arr1[i++];
        }
        
        // Add remaining elements from arr2, if any
        while (j < n2) {
            result[k++] = arr2[j++];
        }
        
        return result;
    }
}
