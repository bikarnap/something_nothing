import java.util.Date;

/**
 * @author  Bikarna Pokharel &lt;bikarnap@gmail.com&gt;
 * @version 2023.0325
 * @since 17.0
 */
/**
 * This class is responsible for a Reservation object.
 */
public class Reservation {
  /**
   * Declares a User object user.
   * <p> It is to hold the user of reservation.
   */
  private User user;
  /**
   * Declares a Book object book.
   * <p> It is to hold the book that is reserved.
   */
  private Book book;
  /**
   * Declaes a Date object date.
   * <p> It is to hold the date of reservation.
   */
  private Date date;

  /**
   * Constructs a Reservation object with the provided arguments.
   * @param user the user who has made reservation
   * @param book the book that is reserved
   * @param date the data of reservation
   */
  public Reservation(User user, Book book, Date date) {
    this.user = user;
    this.book = book;
    this.date = date;
  }

  /**
   * Gets the user who has rserved a book.
   * @return the user
   */
  public User getUser() {
    return user;
  }

  /**
   * Sets the user who has reserved the book.
   * @param user the user 
   */
  public void setUser(User user) {
    this.user = user;
  }

  /**
   * Gets the book that is reserved.
   * @return the reserved book
   */
  public Book getBook() {
    return book;
  }

  /**
   * Gets the date of reservatoin.
   * @return data of reservation
   */
  public Date getDate() {
    return date;
  }

  /**
   * Override method to display information about the reservation.
   * Overrides toString method.
   * @return the string of information
   */
  @Override
  public String toString() {
    return "Reservation for [user=" + user + ", book=" + book + ", date=" + date + "]";
  }
}
