import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class UserTest {
  private User user1, user2, user3;
  private Book book1, book2, book3;

  @Before
  public void setup() {
    user1 = new User("Bikarna Pokharel", "0466151364", 1);
    user2 = new User("Timo Pitkanen", "0466123164", 2);
    user3 = new User("Reshma Mahat", "0445413649", 3);

    book1 = new Book("Advanced Software Testing Vol. 1", 
      "Black R.", "1912");
    book2 = new Book("The Software Engineer's Handbook, 1st editonAdvanced Software Testing Vol. 1", 
        "Graham B & McKay J", "1911");
    book3 = new Book("Software Testing, 2nd edition", 
      "Patton R", "1946");

    try {
      user1.borrowBook(book1);
      user2.borrowBook(book1);
      user3.borrowBook(book1);

      user1.borrowBook(book2);
      user2.borrowBook(book2);
      user3.borrowBook(book2);
  
      user1.borrowBook(book3);
      user2.borrowBook(book3);
      user3.borrowBook(book3);
    } catch (BookAlreadyExistsException e){}
  }

  @Test
  public void testGetBorrowedBooksUser1() {
    List<Book> borrowedBooks = user1.getBorrowedBooks();
    assertTrue(borrowedBooks.contains(book1));
    assertTrue(borrowedBooks.contains(book2));
    assertTrue(borrowedBooks.contains(book3));
  }

  @Test
  public void testGetBorrowedBooksUser2() {
    List<Book> borrowedBooks = user2.getBorrowedBooks();
    assertTrue(borrowedBooks.contains(book1));
    assertTrue(borrowedBooks.contains(book2));
    assertTrue(borrowedBooks.contains(book3));
  }

  @Test
  public void testGetBorrowedBooksUser3() {
    List<Book> borrowedBooks = user3.getBorrowedBooks();
    assertTrue(borrowedBooks.contains(book1));
    assertTrue(borrowedBooks.contains(book2));
    assertTrue(borrowedBooks.contains(book3));
  }

  @Test
  public void testGetNameUser1() {
    assertEquals("Bikarna Pokharel", user1.getName());
  }

  @Test
  public void testGetNameUser2() {
    assertEquals("Timo Pitkanen", user2.getName());
  }

  @Test
  public void testGetNameUser3() {
    assertEquals("Reshma Mahat", user3.getName());
  }

  @Test
  public void testGetIdUser1() {
    assertEquals(1, user1.getId());
  }

  @Test
  public void testGetIdUser2() {
    assertEquals(2, user2.getId());
  }

  @Test
  public void testGetIdUser3() {
    assertEquals(3, user3.getId());
  }

  @Test
  public void testGetPhoneUser1() {
    assertEquals("0466151364", user1.getPhone());
  }

  @Test
  public void testGetPhoneUser2() {
    assertEquals("0466123164", user2.getPhone());
  }

  @Test
  public void testGetPhoneUser3() {
    assertEquals("0445413649", user3.getPhone());
  }

  @Test
  public void testSetIdUser1() {
    user1.setId(4);
    assertEquals(4, user1.getId());
  }

  @Test
  public void testSetIdUser2() {
    user2.setId(5);
    assertEquals(5, user2.getId());
  }

  @Test
  public void testSetIdUser3() {
    user3.setId(6);
    assertEquals(6, user3.getId());
  }

  @Test
  public void testSetPhoneUser1() {
    user1.setPhone("0441123598");
    assertEquals("0441123598", user1.getPhone());
  }

  @Test
  public void testSetPhoneUser2() {
    user2.setPhone("0441123565");
    assertEquals("0441123565", user2.getPhone());
  }

  @Test
  public void testSetPhoneUser3() {
    user3.setPhone("0441123511");
    assertEquals("0441123511", user3.getPhone());
  }
}
