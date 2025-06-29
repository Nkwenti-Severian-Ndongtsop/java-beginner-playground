# Guide: Implementing and Testing Arithmetic Operations

## Project Structure
```
├── check.sh                // Use this script to compile and test
├── easy
│   └── ArithmeticOperations.java   // Implement your functions here
├── GUIDE.md
└── test
    └── OperationTest.java         // Test cases are here
```

## 1. Implement Arithmetic Functions
Open `easy/ArithmeticOperations.java` and implement the following static methods:
- `add(int a, int b)`
- `subtract(int a, int b)`
- `multiply(int a, int b)`
- `divide(int a, int b)` (throw `IllegalArgumentException` if dividing by zero)

**Example skeleton:**
```java
package easyforstartup.day1.easy;

public class ArithmeticOperations {
    public static int add(int a, int b) {
        // TODO: implement
    }
    public static int subtract(int a, int b) {
        // TODO: implement
    }
    public static int multiply(int a, int b) {
        // TODO: implement
    }
    public static int divide(int a, int b) {
        // TODO: implement, throw IllegalArgumentException if b == 0
    }
}
```

## 2. Run the Tests

### Use the Provided Script
RUn this inside the directory java-beginner-playground/easyforstartup/day1
```bash
chmod +x check.sh
./check.sh
```
This script will compile your code and run all the tests automatically.

## 3. Tips
- Make sure your method signatures and package declarations match the test file.
- If a test fails, read the error message to fix your implementation.
- The test file already covers all required operations.

---
Happy coding!
