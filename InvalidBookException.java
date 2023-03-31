/**
 * An exception that is thrown when a book is invalid (e.g., missing a required field).
 */
public class InvalidBookException extends Exception {
  public InvalidBookException(String message) {
      super(message);
  }
}
