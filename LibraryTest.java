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

  /**
   * Tests addUser method.
   */
  @Test
  public void testAddUser1() {
    User user1 = new User("Bikarna Pokharel", "0466151364", 1);
    library.addUser(user1);
    assertTrue(library.getUsers().contains(user1));
  }

   /**
   * Tests addUser method.
   */
  @Test
  public void testAddUser2() {
    User user2 = new User("Timo Pitkanen", "0466123164", 2);
    library.addUser(user2);
    assertTrue(library.getUsers().contains(user2));
  }

   /**
   * Tests addUser method.
   */
  @Test
  public void testAddUser() {
    User user3 = new User("Reshma Mahat", "0445413649", 3);
    library.addUser(user3);
    assertTrue(library.getUsers().contains(user3));
  }

  /**
   * Tests getAllBooks method.
   */
  @Test
  public void testGetAllBooks1() {
    assertEquals(0, library.getAllBooks().size());
  }

  /**
   * Tests getAllBooks method.
   */
  @Test
  public void testGetAllBooks2() {
    Book book1 = new Book("Advanced Software Testing Vol. 1", 
      "Black R.", "1912");
    try {
      library.addBook(book1);
    } catch (BookAlreadyExistsException e) {
      return;
    } catch (InvalidBookException e) {
      return;
    }
    assertEquals(1, library.getAllBooks().size());
  }

  /**
   * Tests getAllBooks method.
   */
  @Test
  public void testGetAllBooks3() {
    Book book2 = new Book("The Software Engineer's Handbook, 1st editonAdvanced Software Testing Vol. 1", 
      "Graham B & McKay J", "1911");
    Book book3 = new Book("Software Testing, 2nd edition", 
    "Patton R", "1946");
    try {
      library.addBook(book2);
      library.addBook(book3);
    } catch (BookAlreadyExistsException e) {
      return;
    } catch (InvalidBookException e) {
      return;
    }
    assertEquals(2, library.getAllBooks().size());
  }

  /**
   * Tests getNumberOfBooks method.
   */
  @Test
  public void testGetNumberOfBooks1() {
    assertEquals(0, library.getNumberOfBooks());
  }

  /**
   * Tests getNumberOfBooks method.
   */
  @Test
  public void testGetNumberOfBooks2() {
    Book book1 = new Book("Advanced Software Testing Vol. 1", 
    "Black R.", "1912");
    try {
      library.addBook(book1);
    } catch (BookAlreadyExistsException e) {
      return;
    } catch (InvalidBookException e) {
      return;
    }
    assertEquals(1, library.getNumberOfBooks());
  }

  /**
   * Tests getNumberOfBooks method.
   */
  @Test
  public void testGetNumberOfBooks3() {
    Book book2 = new Book("The Software Engineer's Handbook, 1st editonAdvanced Software Testing Vol. 1", 
      "Graham B & McKay J", "1911");
    Book book3 = new Book("Software Testing, 2nd edition", 
      "Patton R", "1946");
    try {
      library.addBook(book2);
      library.addBook(book3);
    } catch (BookAlreadyExistsException e) {
      return;
    } catch (InvalidBookException e) {
      return;
    }
    assertEquals(2, library.getNumberOfBooks());
  }

  /**
   * Tests removeBook method.
   */
  @Test
  public void testRemoveBook1() {
    Book book2 = new Book("The Software Engineer's Handbook, 1st editonAdvanced Software Testing Vol. 1", 
      "Graham B & McKay J", "1911");
    Book book3 = new Book("Software Testing, 2nd edition", 
      "Patton R", "1946");
    try {
      library.addBook(book2);
      library.addBook(book3);
    } catch (BookAlreadyExistsException e) {
      return;
    } catch (InvalidBookException e) {
      return;
    }
    library.removeBook(book3);
    assertFalse(library.getAllBooks().contains(book3));
  }

  /**
   * Tests removeBook method.
   */
  @Test
  public void testRemoveBook2() {
    Book book2 = new Book("The Software Engineer's Handbook, 1st editonAdvanced Software Testing Vol. 1", 
      "Graham B & McKay J", "1911");
    Book book3 = new Book("Software Testing, 2nd edition", 
      "Patton R", "1946");
    try {
      library.addBook(book2);
      library.addBook(book3);
    } catch (BookAlreadyExistsException e) {
      return;
    } catch (InvalidBookException e) {
      return;
    }
    library.removeBook(book2);
    assertFalse(library.getAllBooks().contains(book2));
  }

  /**
   * Tests removeBook method.
   */
  @Test
  public void testRemoveBook3() {
    Book book2 = new Book("The Software Engineer's Handbook, 1st editonAdvanced Software Testing Vol. 1", 
      "Graham B & McKay J", "1911");
    Book book3 = new Book("Software Testing, 2nd edition", 
      "Patton R", "1946");
    try {
      library.addBook(book2);
      library.addBook(book3);
    } catch (BookAlreadyExistsException e) {
      return;
    } catch (InvalidBookException e) {
      return;
    }
    library.removeBook(book2);
    library.removeBook(book3);
    assertFalse(library.getAllBooks().contains(book2));
    assertFalse(library.getAllBooks().contains(book3));
  }
}
