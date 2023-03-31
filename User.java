import java.util.ArrayList;
import java.util.List;

/**
 * @author  Bikarna Pokharel &lt;bikarnap@gmail.com&gt;
 * @version 2023.0322
 * @since 17.0
 */
public class User {
  private String name;
  private String phone;
  private int id;
  private List<Book> borrowedBooks;

  public User(String name, String phone, int id) {
    this.name = name;
    this.phone = phone;
    this.id = id;
    this.borrowedBooks = new ArrayList<>();
  }

  /**
   * Gets the first name of the user.
   * 
   * @return first name of the user
   */
  public String getName() {
    return name;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public List<Book> getBorrowedBooks() {
    return borrowedBooks;
  }

  /**
   * Borrows a book from the library.
   * 
   * <p> Method implements the logic for borrowing book.
   * 
   * @param book
   * @throws BookAlreadyExistsException
   */
  public void borrowBook(Book book) throws BookAlreadyExistsException {
    if (borrowedBooks.contains(book)) {
      throw new BookAlreadyExistsException("Book is already borrowed by this user.");
    }

    borrowedBooks.add(book);
  }

  /**
   * Returns book to library.
   * 
   * <p> The method implements the logic for returning borrowed book
   * to the library.
   * 
   * @param book
   * @throws BookNotFoundException
   */
  public void returnBook(Book book) throws BookNotFoundException {
    if (!borrowedBooks.contains(book)) {
      throw new BookNotFoundException("Book " + book.getTitle() + " is not borrowed by this user." );
    }
    borrowedBooks.remove(book);
  }

  /**
   * Returns a string representation of the user.
   * 
   * @return a string representation of the book
   */
  @Override
  public String toString() {
    return "User [name=" + name + ", phone=" + phone + ", id=" + id + "]";
  }
}
