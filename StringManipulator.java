/**
 * @author  Bikarna Pokharel &lt;bikarnap@gmail.com&gt;
 * @version 2023.0325
 * @since 17.0
 */
/**
 * This class provides methods for manipulating strings.
 */
public class StringManipulator {

  /**
   * Determines if a string contains a given substring.
   * @param str The string to search.
   * @param subStr The substring to look for.
   * @return true if the string contains the substring, false otherwise.
   */
  public boolean containsSubstring(String str, String subStr) {
    return str.contains(subStr);
  }

  /**
   * Capitalizes the first  * letter of a string.
   * @param str The string to capitalize.
   * @return The string with the first letter capitalized.
   */
  public String capitalizeFirstLetter(String str) {
      if (str == null || str.length() == 0) {
          return str;
      }
      return str.substring(0, 1).toUpperCase() + str.substring(1);
  }

  /**
   * Reverses a string.
   * @param str The string to reverse.
   * @return The reversed string.
   */
  public String reverseString(String str) {
    if (str == null || str.length() == 0) {
      return str;
    }
    return new StringBuilder(str).reverse().toString();
  }

  /**
   * Trims the whitespace from the beginning and end of a string.
   * @param str The string to trim.
   * @return The trimmed string.
   */
  public String trimString(String str) {
    if (str == null || str.length() == 0) {
      return str;
    }
    return str.trim();
  }

  /**
   * Counts the number of occurrences of a character in a string.
   * @param str The string to search.
   * @param c The character to count.
   * @return The number of occurrences of the character in the string.
   */
  public int countOccurrences(String str, char c) {
    if (str == null || str.length() == 0) {
      return 0;
    }
    int count = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == c) {
          count++;
      }
    }
    return count;
  }
}
