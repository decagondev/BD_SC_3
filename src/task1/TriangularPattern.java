package task1;

/**
 * This class demonstrates a triangular pattern using nested loops.
 */
public class TriangularPattern {
    public static void main(String[] args) {
        // Create a triangular pattern using nested loops
        // Example output:
        // *
        // **
        // ***
        // ****
        // *****
        
        int rows = 5; // You can change the number of rows
        
        // Outer loop for rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop for columns
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Move to next line after each row
            System.out.println();
        }
    }
}
