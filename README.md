# Java Fundamentals Sprint Challenge

## Introduction
This Sprint Challenge focuses on fundamental Java programming concepts including loops, arrays, and pass-by-value behavior. You will demonstrate your understanding by implementing several key functions and algorithms.

## Project Setup

### Prerequisites
- Java Development Kit (JDK) 17 or higher
- Gradle 7.0 or higher

### Getting Started
1. Clone this repository to your local machine:
   ```bash
   git clone <your-repository-url>
   cd java-sprint-challenge
   ```

2. Build the project:
   ```bash
   ./gradlew build
   ```

## Project Structure
```
java-sprint-challenge/
├── src/
│   ├── main/java/com/lambdaschool/
│   │   ├── task1/          # Loop Patterns
│   │   ├── task2/          # Array Operations
│   │   ├── task3/          # String Manipulations
│   │   ├── task4/          # Pass-by-value Demonstration
│   │   └── App.java        # Main application
│   └── test/java/com/lambdaschool/
│       ├── task1/          # Loop Patterns tests
│       ├── task2/          # Array Operations tests
│       ├── task3/          # String Manipulations tests
│       └── task4/          # Pass-by-value tests
├── build.gradle            # Gradle build configuration
└── settings.gradle         # Project settings
```

## Running Tests

### Running All Tests
To run all tests:
```bash
./gradlew test
```

### Running Specific Test Classes
To run tests for a specific task:
```bash
# Task 1: Loop Patterns
./gradlew test --tests "com.lambdaschool.task1.LoopPatternsTest"

# Task 2: Array Operations
./gradlew test --tests "com.lambdaschool.task2.ArrayOperationsTest"

# Task 3: String Manipulations
./gradlew test --tests "com.lambdaschool.task3.StringManipulationsTest"

# Task 4: Pass-by-value
./gradlew test --tests "com.lambdaschool.task4.PassByValueDemoTest"
```

### Viewing Test Reports
After running tests, you can find the test reports at:
```
build/reports/tests/test/index.html
```

## Task Details

### Task 1: Loop Patterns
Implement various loop patterns to generate specific outputs:
1. Create a triangular pattern using nested loops
2. Find all prime numbers below 100
3. Calculate the sum of digits in a number

### Task 2: Array Operations
Implement different array operations:
1. Reverse an array in-place without using additional data structures
2. Find the second largest element in an array
3. Merge two sorted arrays into a single sorted array

### Task 3: String Manipulations
Implement string manipulation algorithms:
1. Check if a string is a palindrome
2. Count the occurrence of each character in a string
3. Find the longest word in a sentence

### Task 4: Pass-by-value Demonstration
Demonstrate Java's pass-by-value behavior with both primitive and reference types:
1. Show that modifying a primitive parameter doesn't affect the original value
2. Show that modifying an object through a reference parameter affects the original object
3. Show that reassigning a reference parameter doesn't affect the original reference

## Running the Application
To run the main application:
```bash
./gradlew run
```

## Evaluation Criteria
Your submission will be evaluated based on:
1. Correctness - Does the code work as expected?
2. Code Quality - Is the code well-organized, readable, and properly commented?
3. Efficiency - Are the algorithms implemented efficiently?
4. Understanding - Does the implementation demonstrate understanding of core Java concepts?

## How to Submit Your Sprint Challenge

1. Ensure all tests are passing:
   ```bash
   ./gradlew test
   ```

2. Commit your changes:
   ```bash
   git add .
   git commit -m "Complete Java Fundamentals Sprint Challenge"
   ```

3. Push to your repository:
   ```bash
   git push origin main
   ```

4. Submit your Sprint Challenge:
   - Go to the Sprint Challenge section of the portal
   - Select the Java Fundamentals Sprint Challenge
   - Input your GitHub repository link
   - Add any additional notes or comments if needed
   - Click the "Submit" button to finalize your submission

## Time Guidelines
You have 3 hours to complete this Sprint Challenge. Plan your time accordingly:
- 10 minutes: Read instructions and plan your approach
- 30 minutes: Task 1 - Loop Patterns
- 45 minutes: Task 2 - Array Operations
- 45 minutes: Task 3 - String Manipulations
- 45 minutes: Task 4 - Pass-by-value Demonstration
- 15 minutes: Final review and submission

## Troubleshooting

### Common Issues
1. **Gradle not found**: Ensure Gradle is installed and in your PATH
2. **JDK version mismatch**: Verify you're using JDK 17 or higher
3. **Test failures**: Check the test reports for detailed failure information

### Getting Help
If you encounter any issues:
1. Check the test reports for specific failure details
2. Review the error messages in the console output
3. Consult the Java documentation for the relevant APIs
4. Reach out to your instructor or mentor for assistance

Good luck!
