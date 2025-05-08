package task1;

/**
 * This class calculates the sum of digits in a number.
 */
public class SumOfDigits {
    public static void main(String[] args) {
        // Test cases
        int number1 = 12345;
        int number2 = 9876;
        
        System.out.println("Sum of digits in " + number1 + " is: " + sumDigits(number1));
        System.out.println("Sum of digits in " + number2 + " is: " + sumDigits(number2));
    }
    
    /**
     * Calculates the sum of digits in a number
     * @param number The input number
     * @return Sum of all digits
     */
    public static int sumDigits(int number) {
        // Handle negative numbers by converting to positive
        number = Math.abs(number);
        
        int sum = 0;
        
        // Loop until number becomes 0
        while (number > 0) {
            // Extract the last digit
            int digit = number % 10;
            
            // Add the digit to sum
            sum += digit;
            
            // Remove the last digit
            number /= 10;
        }
        
        return sum;
    }
}
