import java.util.Date;

public class Reservation {
  private User user;
  private Book book;
  private Date date;


  public Reservation(User user, Book book, Date date) {
    this.user = user;
    this.book = book;
    this.date = date;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public Book getBook() {
    return book;
  }

  public Date getDate() {
    return date;
  }

  @Override
  public String toString() {
    return "Reservation for [user=" + user + ", book=" + book + ", date=" + date + "]";
  }
}
