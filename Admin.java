import java.util.ArrayList;
import java.util.List;

/**
 * @author  Bikarna Pokharel &lt;bikarnap@gmail.com&gt;
 * @version 2023.0325
 * @since 17.0
 */
public class Admin {
  /**
   * Member variable to store the user as administator.
   */
  private User admin;
  /**
   * Stores the list of users in a List datatype.
   */
  private List<User> users;
  /**
   * Stores the list of books in a List datatype.
   */
  private List<Book> books;

  /**
   * Constructs an Admin object.
   * 
   * <p> Initializes the Admin user, books, and users.
   * @param admin the admin user
   */
  public Admin (User admin) {
    this.admin = admin;
    books = new ArrayList<>();
    users = new ArrayList<>();
  }

  /**
   * Adds a user to the list of users.
   * <p> Admin can add a user to the list of users.
   * @param user the user to be added
   */
  public void addUser(User user) {
    users.add(user);
  }

  /**
   * Removes a user from the list of users.
   * <p> Admin can remove a user from the list of users.
   * <p> It takes a User object as an argument.
   * @param user the user to be removed
   */
  public void removeUser(User user) {
    users.remove(user);
  }

  /**
   * Adds a book to the list of books.
   * <p> Admin can add a book to the list of books.
   * <p> It takes a Book object as an argument.
   * @param book the book to be added
   */
  public void addBook(Book book) {
    books.add(book);
  }

  /**
   * Removes the book from the list of books.
   * <p> Admin can remove a book from the list of books.
   * @param book the book to be removed
   */
  public void removeBook(Book book) {
    books.remove(book);
  }

  /**
   * Gets the admin user as an Admin object.
   * 
   * @return the admin user
   */
  public User getAdmin() {
    return admin;
  }

  /**
   * Sets the admin user.
   * <p> A User object is passed as an argument.
   * @param admin the user as Admin
   */
  public void setAdmin(User admin) {
    this.admin = admin;
  }

  /**
   * Lists all the books added by the Admin.
   * <p> Returns List<Book>.
   * @return list of books
   */
  public List<Book> getBooks() {
    return books;
  }

  /**
   * Lists all the users added by the Admin.
   * <p> Returns List<User>.
   * @return list of users
   */
  public List<User> getUsers() {
    return users;
  }

  /**
   * Generates and prints a report about the users and books added by the Admin.
   * <p> Report consists of the current size status on users and books.
   */
  
  public void generateReport() {
    int usersCount = users.size();
    int booksCount = books.size();
    System.out.println("Current status");
    System.out.println("Number of users: " + usersCount);
    System.out.println("Number of books: " + booksCount);
  }

  @Override
  public String toString() {
    return "Admin [admin=" + admin + ", users=" + users + ", books=" + books + "]";
  }
}
