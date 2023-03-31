import static org.junit.Assert.assertEquals;

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

  @Test
  public void testGetBook1() {
    assertEquals("Advanced Software Testing Vol. 1", book1.getTitle());
  }

  @Test
  public void testGetBook2() {
    assertEquals("The Software Engineer's Handbook, 1st editonAdvanced Software Testing Vol. 1", book2.getTitle());
  }

  @Test
  public void testGetBook3() {
    assertEquals("Software Testing, 2nd edition", book3.getTitle());
  }

  @Test
  public void testGetDate1() {
    assertEquals(date1, new Date());
  }

  // @Test
  // public void testGetUser() {

  // }

  // @Test
  // public void testSetUser() {

  // }

  // @Test
  // public void testToString() {

  // }
}
