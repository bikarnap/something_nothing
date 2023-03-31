/**
 * This class represents a simple calculator with basic arithmetic operations.
 */
public class Calculator {

    /**
     * Adds two integers.
     * @param a The first integer.
     * @param b The second integer.
     * @return The sum of the two integers.
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Subtracts two integers.
     * @param a The first integer.
     * @param b The second integer.
     * @return The difference of the two integers.
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Multiplies two integers.
     * @param a The first integer.
     * @param b The second integer.
     * @return The product of the two integers.
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Divides two integers.
     * @param a The numerator.
     * @param b The denominator.
     * @return The quotient of the two integers.
     * @throws IllegalArgumentException if the denominator is zero.
     */
    public int divide(int a, int b) throws IllegalArgumentException {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero!");
        }
        return a / b;
    }

    /**
     * Computes the power of an integer.
     * @param a The base integer.
     * @param b The exponent integer.
     * @return The result of raising the base integer to the exponent integer.
     */
    public int power(int a, int b) {
        return (int) Math.pow(a, b);
    }
}

