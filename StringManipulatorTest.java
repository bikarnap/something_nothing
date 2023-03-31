import org.junit.Test;
import static org.junit.Assert.*;

/**

Test class for StringManipulator.
*/
public class StringManipulatorTest {

@Test
public void testContainsSubstring() {
StringManipulator manipulator = new StringManipulator();
boolean result = manipulator.containsSubstring("hello world", "world");
assertTrue(result);
}

@Test
public void testCapitalizeFirstLetter() {
StringManipulator manipulator = new StringManipulator();
String result = manipulator.capitalizeFirstLetter("hello");
assertEquals("Hello", result);
}

@Test
public void testReverseString() {
StringManipulator manipulator = new StringManipulator();
String result = manipulator.reverseString("hello world");
assertEquals("dlrow olleh", result);
}

@Test
public void testTrimString() {
StringManipulator manipulator = new StringManipulator();
String result = manipulator.trimString(" hello world ");
assertEquals("hello world", result);
}

@Test
public void testCountOccurrences() {
StringManipulator manipulator = new StringManipulator();
int result = manipulator.countOccurrences("hello world", 'l');
assertEquals(3, result);
}

@Test
public void testCountOccurrencesWithEmptyString() {
StringManipulator manipulator = new StringManipulator();
int result = manipulator.countOccurrences("", 'l');
assertEquals(0, result);
}
}