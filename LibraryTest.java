import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * @author  Bikarna Pokharel &lt;bikarnap@gmail.com&gt;
 * @version 2023.0325
 * @since 17.0
 */
@RunWith(JUnit4.class)
public class LibraryTest {
  /**
   * Declares a library object.
   */
  Library library = new Library();

  /**
   * Tests addBook method by adding a Book book1.
   *
   */
  @Test
  public void testAddBook() {
    Book book1 = new Book("Advanced Software Testing Vol. 1", 
    "Black R.", "1912");
    try {
      library.addBook(book1);
    } catch (BookAlreadyExistsException e) {
      System.out.println(e.getMessage());
    } catch (InvalidBookException e) {
      System.out.println(e.getMessage());
    }
    
  }

  /**
   * Tests addBook method by adding a Book book1.
   * <p> Book with all arguments set to null is set.
   * <p> Checking for InvalidVookException.
   */
  @Test
  public void testAddBook2() {
    Book book2 = new Book(null, null, null);
    try {
      library.addBook(book2);
    } catch (BookAlreadyExistsException e) {
      System.out.println(e.getMessage());
    } catch (InvalidBookException e) {
      System.out.println(e.getMessage());
    }
  }

  /**
   * Tests addBook method by adding a Book book3.
   * <p> Adds the same book twice.
   * <p> Checks for BookAlreadyExistsException.
   */
  @Test
  public void testAddBook3() {
    Book book3 = new Book("Software Testing, 2nd edition", 
      "Patton R", "1946");
    
    try {
      library.addBook(book3);
      library.addBook(book3);
    } catch (BookAlreadyExistsException e) {
      System.out.println(e.getMessage());
    } catch (InvalidBookException e) {
      System.out.println(e.getMessage());
    }
    
  }

  // @Test
  // public void testAddUser() {

  // }

  // @Test
  // public void testGetAllBooks() {

  // }

  // @Test
  // public void testGetNumberOfBooks() {

  // }

  // @Test
  // public void testIsBookAvailable() {

  // }

  // @Test
  // public void testRemoveBook() {

  // }

  // @Test
  // public void testRemoveUser() {

  // }
}
