package intern.com;

/**
 * Modular Calculator Application
 * Demonstrates method design, overloading, exception handling,
 * utility methods, and pass-by-value behavior in Java.
 */
public class ModularCalculator {

    /* ---------------- BASIC OPERATIONS ---------------- */

    /**
     * Adds two integers.
     */
    public static int add(int a, int b) {
        return a + b;
    }

    /**
     * Adds two double values (Method Overloading).
     */
    public static double add(double a, double b) {
        return a + b;
    }

    /**
     * Subtracts two numbers.
     */
    public static int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Multiplies two numbers.
     */
    public static int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Divides two numbers with exception handling.
     */
    public static double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return (double) a / b;
    }

    /* ---------------- UTILITY METHODS ---------------- */

    /**
     * Checks whether a number is even.
     */
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    /**
     * Returns square of a number.
     */
    public static int square(int num) {
        return num * num;
    }

    /* ---------------- PASS BY VALUE DEMO ---------------- */

    /**
     * Attempts to modify a variable (demonstrates pass-by-value).
     */
    public static void changeValue(int x) {
        x = 100;
        System.out.println("Inside method, value = " + x);
    }

    /* ---------------- MAIN METHOD (TESTING) ---------------- */

    public static void main(String[] args) {

        System.out.println("Addition (int): " + add(10, 20));
        System.out.println("Addition (double): " + add(10.5, 20.3));

        System.out.println("Subtraction: " + subtract(20, 5));
        System.out.println("Multiplication: " + multiply(4, 5));

        try {
            System.out.println("Division: " + divide(10, 2));
            System.out.println("Division: " + divide(10, 0)); // Exception case
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Is 8 even? " + isEven(8));
        System.out.println("Square of 6: " + square(6));

        int value = 50;
        System.out.println("Before method call, value = " + value);
        changeValue(value);
        System.out.println("After method call, value = " + value);
    }
}
