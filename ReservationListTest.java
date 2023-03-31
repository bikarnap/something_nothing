import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

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

    @Test
    public void testAddReservation() {
        Reservation reservation4 = new Reservation(user2, book2, date);
        reservationList.addReservation(reservation4);
        assertTrue(reservationList.getReservations().contains(reservation4));
    }

    @Test
    public void testRemoveReservation() {
        reservationList.removeReservation(reservation1);
        assertFalse(reservationList.getReservations().contains(reservation1));
    }

    @Test
    public void testGetReservationsByBorrower() {
        List<Reservation> user1Reservations = reservationList.getReservationsByUser(user1);
        assertTrue(user1Reservations.contains(reservation1));
        assertTrue(user1Reservations.contains(reservation2));
        assertFalse(user1Reservations.contains(reservation3));

        List<Reservation> user2Reservations = reservationList.getReservationsByUser(user2);
        assertTrue(user2Reservations.contains(reservation3));
        assertFalse(user2Reservations.contains(reservation1));
        assertFalse(user2Reservations.contains(reservation2));
    }
}
