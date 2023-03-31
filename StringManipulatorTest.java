import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

/**

Test class for StringManipulator.
*/
@RunWith(JUnit4.class)
public class StringManipulatorTest {

  /**
   * Tests containsSubstring method.
   */
  @Test
    public void testContainsSubstring1() {
    StringManipulator manipulator = new StringManipulator();
    boolean result = manipulator.containsSubstring("say hello", "say");
    assertTrue(result);
  }

  /**
   * Tests containsSubstring method.
   */
  @Test
  public void testContainsSubstring2() {
    StringManipulator manipulator = new StringManipulator();
    boolean result = manipulator.containsSubstring("Red rat killed the rat bat", "the rat");
    assertTrue(result);
  }

  /**
   * Tests containsSubstring method.
   */
  @Test
  public void testContainsSubstring3() {
    StringManipulator manipulator = new StringManipulator();
    boolean result = manipulator.containsSubstring("Red rat killed the rat bat", "hello");
    assertFalse(result);
  }

  /**
   * Tests capitalizeFirstLetter method.
   */
  @Test
  public void testCapitalizeFirstLetter1() {
    StringManipulator manipulator = new StringManipulator();
    String result = manipulator.capitalizeFirstLetter("hello");
    assertEquals("Hello", result);
  }

  /**
   * Tests capitalizeFirstLetter method.
   */
  @Test
  public void testCapitalizeFirstLetter2() {
    StringManipulator manipulator = new StringManipulator();
    String result = manipulator.capitalizeFirstLetter("tampERE city");
    assertEquals("TampERE city", result);
  }

  /**
   * Tests capitalizeFirstLetter method.
   */
  @Test
  public void testCapitalizeFirstLetter3() {
    StringManipulator manipulator = new StringManipulator();
    String result = manipulator.capitalizeFirstLetter("BLACK");
    assertEquals("BLACK", result);
  }

  /**
   * Tests reverseString method.
   */
  @Test
  public void testReverseString1() {
    StringManipulator manipulator = new StringManipulator();
    String result = manipulator.reverseString("my name is eagle.");
    assertEquals(".elgae si eman ym", result);
  }

  /**
   * Tests reverseString method.
   */
  @Test
  public void testReverseString2() {
    StringManipulator manipulator = new StringManipulator();
    String result = manipulator.reverseString("tampere");
    assertEquals("erepmat", result);
  }

  /**
   * Tests reverseString method.
   */
  @Test
  public void testReverseString3() {
    StringManipulator manipulator = new StringManipulator();
    String result = manipulator.reverseString("12345abc123");
    assertEquals("321cba54321", result);
  }

  /**
   * Tests trimString method.
   */
  @Test
  public void testTrimString1() {
    StringManipulator manipulator = new StringManipulator();
    String result = manipulator.trimString(" jakarta");
    assertEquals("jakarta", result);
  }

  /**
   * Tests trimString method.
   */
  @Test
  public void testTrimString2() {
    StringManipulator manipulator = new StringManipulator();
    String result = manipulator.trimString(" Where there is a will, there is a way!  ");
    assertEquals("Where there is a will, there is a way!", result);
  }

  /**
   * Tests trimString method.
   */
  @Test
  public void testTrimString3() {
    StringManipulator manipulator = new StringManipulator();
    String result = manipulator.trimString("           I live in Tampere.  ");
    assertEquals("I live in Tampere.", result);
  }

  /**
   * Tests the countOccurrences method.
   */
  @Test
  public void testCountOccurrences1() {
    StringManipulator manipulator = new StringManipulator();
    int result = manipulator.countOccurrences("This is alright.", 'i');
    assertEquals(3, result);
  }

  /**
   * Tests the countOccurrences method.
   */
  @Test
  public void testCountOccurrences2() {
    StringManipulator manipulator = new StringManipulator();
    int result = manipulator.countOccurrences("makkara", 'k');
    assertEquals(2, result);
  }

  /**
   * Tests the countOccurrences method.
   */
  @Test
  public void testCountOccurrences3() {
    StringManipulator manipulator = new StringManipulator();
    int result = manipulator.countOccurrences("All is well!", 'l');
    assertEquals(4, result);
  }

  /**
   * Tests the countOccurrences method.
   */
  @Test
  public void testCountOccurrences4() {
    StringManipulator manipulator = new StringManipulator();
    int result = manipulator.countOccurrences("", 'i');
    assertEquals(0, result);
  }
}
