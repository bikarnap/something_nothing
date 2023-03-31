import java.util.Date;

/**
 * @author  Bikarna Pokharel &lt;bikarnap@gmail.com&gt;
 * @version 2023.0322
 * 
 */
public class Borrowing {
  private Book book;
  private int id;
  private User user;
  private Date date;
  private Date dueDate;

  public Borrowing() {
    this.book = new Book("", "", "");
  }

  public Book getBook() {
    return book;
  }

  public int getId() {
    return id;
  }

  public User getUser() {
    return user;
  }

  public Date getDate() {
    return date;
  }

  public Date getDueDate() {
    return dueDate;
  }
  
}
