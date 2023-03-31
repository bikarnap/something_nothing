/**
 * @author  Bikarna Pokharel &lt;bikarnap@gmail.com&gt;
 * @version 2023.0331
 * @since 17.0
 */
/**
 * This class represents a simple calculator with basic arithmetic operations.
 */
public class Calculator {

	/**
	 * Adds two integers.
	 * @param a the first integer
	 * @param b the second integer
	 * @return the sum of the two integers
	 */
	public int add(int a, int b) {
		return a + b;
	}

	/**
	 * Subtracts two integers.
	 * @param a the first integer
	 * @param b the second integer
	 * @return the difference of the two integers.
	 */
	public int subtract(int a, int b) {
		return a - b;
	}

	/**
	 * Multiplies two integers.
	 * @param a the first integer
	 * @param b the second integer
	 * @return the product of the two integers
	 */
	public int multiply(int a, int b) {
		return a * b;
	}

	/**
	 * Divides two integers.
	 * @param a the numerator
	 * @param b the denominator
	 * @return the quotient of the two integers
	 */
	public int divide(int a, int b) throws IllegalArgumentException {
		if (b == 0) {
			throw new IllegalArgumentException("Cannot divide by zero!");
		}
		return a / b;
	}

	/**
	 * Computes the power of an integer.
	 * @param a the base integer
	 * @param b the exponent integer
	 * @return the result of raising the base integer to the exponent integer
	 */
	public int power(int a, int b) {
		return (int) Math.pow(a, b);
	}
}
