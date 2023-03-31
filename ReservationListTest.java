import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author  Bikarna Pokharel &lt;bikarnap@gmail.com&gt;
 * @version 2023.0322
 * @since 17.0
 */

@RunWith(JUnit4.class)
public class ReservationListTest {
  private Book book1, book2, book3;
  private User user1, user2;
  private Date date;
  private Reservation reservation1, reservation2, reservation3;
  private ReservationList reservationList;

  @Before
  public void setUp() throws Exception {
    // Set up the books, users, date, reservations, and reservation list objects for testing
    book1 = new Book("Advanced Software Testing Vol. 1", 
      "Black R.", "1912");
    book2 = new Book("The Software Engineer's Handbook, 1st editonAdvanced Software Testing Vol. 1", 
      "Graham B & McKay J", "1911");
    book3 = new Book("Software Testing, 2nd edition", 
        "Patton R", "1946");

    user1 = new User("Timo Pitkanen", "0466123164", 2);
    user2 = new User("Reshma Mahat", "0445413649", 3);
    
    date = new Date();
    reservation1 = new Reservation(user1, book1, date);
    reservation2 = new Reservation(user1, book2, date);
    reservation3 = new Reservation(user2, book1, date);
    reservationList = new ReservationList();
    reservationList.addReservation(reservation1);
    reservationList.addReservation(reservation2);
    reservationList.addReservation(reservation3);
  }

  /**
   * Tests addReservation method.
   */
  @Test
  public void testAddReservation1() {
    Reservation reservation4 = new Reservation(user2, book2, date);
    reservationList.addReservation(reservation4);
    assertTrue(reservationList.getReservations().contains(reservation4));
  }

  /**
   * Tests addReservation method.
   */
  @Test
  public void testAddReservation2() {
    Reservation reservation5 = new Reservation(user2, book2, date);
    reservationList.addReservation(reservation5);
    assertTrue(reservationList.getReservations().contains(reservation5));
  }

  /**
   * Tests addReservation method.
   */
  @Test
  public void testAddReservation3() {
    Reservation reservation6 = new Reservation(user2, book2, date);
    reservationList.addReservation(reservation6);
    assertTrue(reservationList.getReservations().contains(reservation6));
  }

  /**
   * Tests removeReservation method.
   */
  @Test
  public void testRemoveReservatio1n() {
    reservationList.removeReservation(reservation1);
    assertFalse(reservationList.getReservations().contains(reservation1));
  }

  /**
   * Tests removeReservation method.
   */
  @Test
  public void testRemoveReservation2() {
    reservationList.removeReservation(reservation2);
    assertFalse(reservationList.getReservations().contains(reservation2));
  }

  /**
   * Tests removeReservation method.
   */
  @Test
  public void testRemoveReservation3() {
    reservationList.removeReservation(reservation3);
    assertFalse(reservationList.getReservations().contains(reservation3));
  }

  /**
   * Tests getReservation mathod.
   * <p> Checks based on the number of Reservation.
   */
  @Test
  public void testgetReservation1() {
    assertEquals(3, reservationList.getReservations().size());
  }

  /**
   * Tests getReservation mathod.
   * <p> Checks based on the number of Reservation.
   */
  @Test
  public void testgetReservation2() {
    Reservation reservation4 = new Reservation(user2, book2, date);
    reservationList.addReservation(reservation4);
    assertEquals(4, reservationList.getReservations().size());
  }


  /**
   * Tests getReservation mathod.
   * <p> Checks based on the number of Reservation.
   */
  @Test
  public void testgetReservation3() {
    Reservation reservation4 = new Reservation(user2, book2, date);
    reservationList.addReservation(reservation4);
    Reservation reservation5 = new Reservation(user2, book2, date);
    reservationList.addReservation(reservation5);
    assertEquals(5, reservationList.getReservations().size());
  }

  /**
   * Tests the reservations by user.
   * <p> Tests if user has made reservation.
   */
  @Test
  public void testGetReservationsByUser1() {
    List<Reservation> user1Reservations = reservationList.getReservationsByUser(user1);
    assertTrue(user1Reservations.contains(reservation1));
    assertTrue(user1Reservations.contains(reservation2));
    assertFalse(user1Reservations.contains(reservation3));
  }

  /**
   * Tests the reservations by user.
   * <p> Tests if user has made reservation.
   */
  @Test
  public void testGetReservationsByUser2() {
    List<Reservation> user2Reservations = reservationList.getReservationsByUser(user2);
    assertTrue(user2Reservations.contains(reservation3));
    assertFalse(user2Reservations.contains(reservation1));
    assertFalse(user2Reservations.contains(reservation2));
  }

  /**
   * Tests the reservations by user.
   * <p> Tests if user has made reservation.
   */
  @Test
  public void testGetReservationsByUser3() {
    User user3 = new User("xia bao", "+23451234", 9);
    List<Reservation> user3Reservations = reservationList.getReservationsByUser(user3);
    assertFalse(user3Reservations.contains(reservation1));
    assertFalse(user3Reservations.contains(reservation2));
    assertFalse(user3Reservations.contains(reservation3));
  }

  /**
   * Tests the serReservations method.
   */
  @Test
  public void testSetReservations1() {
    Reservation reservation7 = new Reservation(user1, book1, date);
    List<Reservation> reservations = new ArrayList<>();
    reservations.add(reservation7);
    
    reservationList.setReservations(reservations);

    assertEquals(1, reservationList.getReservations().size());
  }

  /**
   * Tests the serReservations method.
   */
  @Test
  public void testSetReservations2() {
    reservationList.removeReservation(reservation1);
    Reservation reservation8 = new Reservation(user1, book2, date);
    List<Reservation> reservations = new ArrayList<>();
    reservations.add(reservation8);
    
    reservationList.setReservations(reservations);

    assertEquals(1, reservationList.getReservations().size());
  }

  /**
   * Tests the serReservations method.
   */
  @Test
  public void testSetReservations3() {
    Reservation reservation9 = new Reservation(user2, book3, date);
    Reservation reservation10 = new Reservation(user2, book2, date);
    List<Reservation> reservations = new ArrayList<>();
    reservations.add(reservation9);
    reservations.add(reservation10);
    
    reservationList.setReservations(reservations);

    assertEquals(2, reservationList.getReservations().size());
  }
}
