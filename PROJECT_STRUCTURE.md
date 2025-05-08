# Project Structure

## Root Directory
- `README.md` - Project overview and instructions
- `SUBMISSION.md` - Guidelines for submitting the sprint challenge
- `PROJECT_STRUCTURE.md` - This file, explaining the project organization

## Source Code (`src` directory)
The source code is organized into packages by task:

### Task 1: Loop Patterns (`src/task1`)
- `TriangularPattern.java` - Creates a triangular pattern using nested loops
- `PrimeNumbers.java` - Finds all prime numbers below 100 using the Sieve of Eratosthenes
- `SumOfDigits.java` - Calculates the sum of digits in a number

### Task 2: Array Operations (`src/task2`)
- `ReverseArray.java` - Reverses an array in-place without additional data structures
- `SecondLargest.java` - Finds the second largest element in an array
- `MergeSortedArrays.java` - Merges two sorted arrays into a single sorted array

### Task 3: String Manipulations (`src/task3`)
- `Palindrome.java` - Checks if a string is a palindrome
- `CharCount.java` - Counts the occurrence of each character in a string
- `LongestWord.java` - Finds the longest word in a sentence
- `README.md` - Additional documentation for string manipulation tasks

### Task 4: Pass-by-value Demonstration (`src/task4`)
- `PassByValueDemo.java` - Demonstrates Java's pass-by-value behavior
- `PassByValueVisual.java` - Provides visual representations of pass-by-value concepts
- `Person.java` - A class used for reference type demonstrations

## How to Run
To compile and run any individual class:

```bash
# Navigate to the project root
cd java-sprint-challenge

# Compile
javac src/task1/TriangularPattern.java -d bin

# Run
java -cp bin task1.TriangularPattern
```

You can replace `task1.TriangularPattern` with any other class path as needed.
