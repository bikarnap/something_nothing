import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

/**
 * @author  Bikarna Pokharel &lt;bikarnap@gmail.com&gt;
 * @version 2023.0331
 * @since 17.0
 */
/**
 * Test class for Calculator.
 */
@RunWith(JUnit4.class)
public class CalculatorTest {

  /**
   * Tests add method.
   */
  @Test
  public void testAdd1() {
    Calculator calculator = new Calculator();
    int result = calculator.add(3, 5);
    assertEquals(8, result);
  }

  /**
   * Tests add method.
   */
  @Test
  public void testAdd2() {
    Calculator calculator = new Calculator();
    int result = calculator.add(-1, 5);
    assertEquals(4, result);
  }

  /**
   * Tests add method.
   */
  @Test
  public void testAdd3() {
    Calculator calculator = new Calculator();
    int result = calculator.add(-7, -5);
    assertEquals(-12, result);
  }

  /**
   * Tests the subtract method.
   */
  @Test
  public void testSubtract1() {
    Calculator calculator = new Calculator();
    int result = calculator.subtract(7, 2);
    assertEquals(5, result);
  }

  /**
   * Tests the subtract method.
   */
  @Test
  public void testSubtract2() {
    Calculator calculator = new Calculator();
    int result = calculator.subtract(0, 2);
    assertEquals(-2, result);
  }

  /**
   * Tests the subtract method.
   */
  @Test
  public void testSubtract3() {
    Calculator calculator = new Calculator();
    int result = calculator.subtract(0, 2);
    assertEquals(-2, result);
  }

  /**
   * Tests multiply method.
   */
  @Test
  public void testMultiply1() {
    Calculator calculator = new Calculator();
    int result = calculator.multiply(4, 6);
    assertEquals(24, result);
  }

  /**
   * Tests multiply method.
   */
  @Test
  public void testMultiply2() {
    Calculator calculator = new Calculator();
    int result = calculator.multiply(-4, 9);
    assertEquals(-36, result);
  }

  /**
   * Tests multiply method.
   */
  @Test
  public void testMultiply3() {
    Calculator calculator = new Calculator();
    int result = calculator.multiply(0, 0);
    assertEquals(0, result);
  }

  /**
   * Tests the divide method.
   */
  @Test
  public void testDivide1() {
    Calculator calculator = new Calculator();
    int result = calculator.divide(10, 2);
    assertEquals(5, result);
  }

  /**
   * Tests the divide method.
   */
  @Test
  public void testDivide2() {
    Calculator calculator = new Calculator();
    int result = calculator.divide(1, 2);
    assertEquals(0, result);
  }

  /**
   * Tests the divide method.
   */
  @Test
  public void testDivide3() {
    Calculator calculator = new Calculator();
    int result = calculator.divide(-5, 2);
    assertEquals(-2, result);
  }

  /**
   * Tests the divide method.
   * <p> IllegalArgumentException is tested.
   */
  @Test(expected = IllegalArgumentException.class)
  public void testDivideByZero() {
    Calculator calculator = new Calculator();
    calculator.divide(10, 0);
  }

  /**
   * Tests the power method.
   */
  @Test
  public void testPower1() {
    Calculator calculator = new Calculator();
    int result = calculator.power(2, 3);
    assertEquals(8, result);
  }
  /**
   * Tests the power method.
   */
  @Test
  public void testPower2() {
    Calculator calculator = new Calculator();
    int result = calculator.power(-2, 3);
    assertEquals(-8, result);
  }

  /**
   * Tests the power method.
   */
  @Test
  public void testPower3() {
    Calculator calculator = new Calculator();
    int result = calculator.power(10, -2);
    assertEquals(0, result);
  }
}
