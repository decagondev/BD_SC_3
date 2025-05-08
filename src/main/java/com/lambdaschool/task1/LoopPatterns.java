package com.lambdaschool.task1;

public class LoopPatterns {
    
    /**
     * Creates a triangular pattern using nested loops
     * @param height The height of the triangle
     * @return String representation of the triangle
     */
    public String createTriangle(int height) {
        StringBuilder triangle = new StringBuilder();
        for (int i = 1; i <= height; i++) {
            // Add spaces
            for (int j = 1; j <= height - i; j++) {
                triangle.append(" ");
            }
            // Add stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                triangle.append("*");
            }
            triangle.append("\n");
        }
        return triangle.toString();
    }

    /**
     * Finds all prime numbers below a given number
     * @param limit The upper limit to check for primes
     * @return Array of prime numbers
     */
    public int[] findPrimes(int limit) {
        boolean[] isPrime = new boolean[limit];
        int count = 0;
        
        // Initialize all numbers as prime
        for (int i = 2; i < limit; i++) {
            isPrime[i] = true;
        }
        
        // Sieve of Eratosthenes
        for (int i = 2; i * i < limit; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < limit; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        
        // Count primes
        for (int i = 2; i < limit; i++) {
            if (isPrime[i]) count++;
        }
        
        // Create result array
        int[] primes = new int[count];
        int index = 0;
        for (int i = 2; i < limit; i++) {
            if (isPrime[i]) {
                primes[index++] = i;
            }
        }
        
        return primes;
    }

    /**
     * Calculates the sum of digits in a number
     * @param number The number to sum digits of
     * @return Sum of all digits
     */
    public int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
} 