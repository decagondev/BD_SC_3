/**
 * This class implements a solution to find all prime numbers below a given limit
 * using the Sieve of Eratosthenes algorithm.
 */
public class PrimeNumbers {
    public static void main(String[] args) {
        // Implement a solution to find all prime numbers below 100
        
        int limit = 100;
        
        System.out.println("Prime numbers below " + limit + ":");
        
        // Using Sieve of Eratosthenes algorithm
        // Initialize a boolean array where isPrime[i] indicates if i is prime
        boolean[] isPrime = new boolean[limit];
        
        // Initialize all numbers as prime
        for (int i = 2; i < limit; i++) {
            isPrime[i] = true;
        }
        
        // Mark non-primes using Sieve of Eratosthenes
        for (int p = 2; p * p < limit; p++) {
            // If p is prime, mark its multiples as non-prime
            if (isPrime[p]) {
                for (int i = p * p; i < limit; i += p) {
                    isPrime[i] = false;
                }
            }
        }
        
        // Print all prime numbers
        for (int i = 2; i < limit; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
