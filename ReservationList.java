import java.util.ArrayList;
import java.util.List;

/**
 * The ReservationList class represents a list of reservations made by library users.
 */
public class ReservationList {
    private List<Reservation> reservations;

    public ReservationList() {
        this.reservations = new ArrayList<>();
    }

    /**
     * Adds a reservation to the list.
     */
    public void addReservation(Reservation reservation) {
        reservations.add(reservation);
    }

    /**
     * Removes a reservation from the list.
     */
    public void removeReservation(Reservation reservation) {
        reservations.remove(reservation);
    }

    public List<Reservation> getReservations() {
      return reservations;
    }

    /**
     * Returns a list of reservations made by a specific user.
     */
    public List<Reservation> getReservationsByUser(User user) {
        List<Reservation> userReservations = new ArrayList<>();
        for (Reservation reservation : reservations) {
            if (reservation.getUser().equals(user)) {
                userReservations.add(reservation);
            }
        }
        return userReservations;
    }
}
