import static org.junit.Assert.assertEquals;

import java.util.Calendar;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

public class ReservationTest {
  private Book book1, book2, book3;
  private User user1, user2, user3;
  private Date date1, date2, date3;
  private Reservation reservation1, reservation2, reservation3;
  
  @Before
  public void setup() {
    // Set up the books, borrowers, date, reservations, and reservation list objects for testing
    book1 = new Book("Advanced Software Testing Vol. 1", 
    "Black R.", "1912");
    book2 = new Book("The Software Engineer's Handbook, 1st editonAdvanced Software Testing Vol. 1", 
      "Graham B & McKay J", "1911");
    book3 = new Book("Software Testing, 2nd edition", 
    "Patton R", "1946");

    user1 = new User("Timo Pitkanen", "0466123164", 2);
    user2 = new User("Reshma Mahat", "0445413649", 3);
 
    date1 = new Date();
    date2 = new Date();
    date3 = new Date();

    reservation1 = new Reservation(user1, book1, date1);
    reservation2 = new Reservation(user2, book2, date2);
    reservation3 = new Reservation(user3, book3, date3);
  }

  /**
   * Tests the getBook method.
   * <p> Uses the title of the book for checking.
   */
  @Test
  public void testGetBook1() {
    book1 = new Book("Advanced Software Testing Vol. 1", 
    "Black R.", "1912");
    assertEquals("Advanced Software Testing Vol. 1", book1.getTitle());
  }

  /**
   * Tests the getBook method.
   * <p> Uses the title of the book for checking.
   */
  @Test
  public void testGetBook2() {
    book2 = new Book("The Software Engineer's Handbook, 1st editonAdvanced Software Testing Vol. 1", 
      "Graham B & McKay J", "1911");
    assertEquals("The Software Engineer's Handbook, 1st editonAdvanced Software Testing Vol. 1", book2.getTitle());
  }

  /**
   * Tests the getBook method.
   * <p> Uses the title of the book for checking.
   */
  @Test
  public void testGetBook3() {
    book3 = new Book("Software Testing, 2nd edition", 
      "Patton R", "1946");
    assertEquals("Software Testing, 2nd edition", book3.getTitle());
  }

  /**
   * Test the getDate method.
   * <p> Checks if the reservation date passes the test.
   */
  @Test
  public void testGetDate1() {
    date1 = new Date();
    reservation1 = new Reservation(user1, book1, date1);
    assertEquals(date1, reservation1.getDate());
  }

  /**
   * Test the getDate method.
   * <p> Checks if the reservation date passes the test.
   */
  @Test
  public void testGetDate2() {
    Date now = new Date();
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(now);
    calendar.add(Calendar.DATE, 14);
    date2 = calendar.getTime();
    reservation2 = new Reservation(user1, book1, date2);
    assertEquals(date2, reservation2.getDate());
  }

  /**
   * Test the getDate method.
   * <p> Checks if the reservation date passes the test.
   */
  @Test
  public void testGetDate3() {
    Date now = new Date();
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(now);
    calendar.add(Calendar.DATE, -4);
    date3 = calendar.getTime();
    reservation3 = new Reservation(user1, book1, date3);
    assertEquals(date3, reservation3.getDate());
  }

  /**
   * Tests the getUser method.
   * <p> Uses assertEquals to check.
   */
  @Test
  public void testGetUser1() {
    assertEquals(user1, reservation1.getUser());
  }

  /**
   * Tests the getUser method.
   * <p> Uses assertEquals to check.
   */
  @Test
  public void testGetUser2() {
    assertEquals(user2, reservation2.getUser());
  }

  /**
   * Tests the getUser method.
   * <p> Uses assertEquals to check.
   */
  @Test
  public void testGetUser3() {
    assertEquals(user3, reservation3.getUser());
  }

  /**
   * Tests the setUser method.
   * <p> Uses assertEquals to check.
   */
  @Test
  public void testSetUser1() {
    User user4 = new User("Steve Jobs", "+123456789", 24);
    reservation1.setUser(user4);
    assertEquals(user4, reservation1.getUser());
  }

  /**
   * Tests the setUser method.
   * <p> Uses assertEquals to check.
   */
  @Test
  public void testSetUser2() {
    User user5 = new User("Steve Jobs", "+123456789", 24);
    reservation2.setUser(user5);
    assertEquals(user5, reservation2.getUser());
  }

  /**
   * Tests the setUser method.
   * <p> Uses assertEquals to check.
   */
  @Test
  public void testSetUser3() {
    User user6 = new User("Steve Jobs", "+123456789", 24);
    reservation3.setUser(user6);
    assertEquals(user6, reservation3.getUser());
  }

  /**
   * Tests the toString method.
   */
  @Test
  public void testToString1() {
    assertEquals("Reservation for [user=" + user1 + ", book=" + book1 + ", date=" + date1 + "]", reservation1.toString());
  }

  /**
   * Tests the toString method.
   */
  @Test
  public void testToString2() {
    assertEquals("Reservation for [user=" + user2 + ", book=" + book2 + ", date=" + date2 + "]", reservation2.toString());
  }

  /**
   * Tests the toString method.
   */
  @Test
  public void testToString3() {
    assertEquals("Reservation for [user=" + user3 + ", book=" + book3 + ", date=" + date3 + "]", reservation3.toString());
  }
}
