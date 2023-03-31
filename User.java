import java.util.ArrayList;
import java.util.List;

/**
 * @author  Bikarna Pokharel &lt;bikarnap@gmail.com&gt;
 * @version 2023.0322
 * @since 17.0
 */
public class User {
  /**
   * Declares the name of user as String object.
   */
  private String name;
  /**
   * Declares the phone number of user as String object.
   */
  private String phone;
  /**
   * Declares the id of user as int type.
   */
  private int id;
  /**
   * Declares a List of Book object.
   */
  private List<Book> borrowedBooks;

  /**
   * Constructs a User object with the provided arguments.
   * <p> It also initializes an ArrayList for the list of books borrowed by user.
   * @param name the name of user
   * @param phone the phone number of user
   * @param id the id of user
   */
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

  /**
   * Gets the phone number of user.
   * @return the phone number of user
   */
  public String getPhone() {
    return phone;
  }

  /**
   * Sets the phone number of user with the given arugment.
   * @param phone the phone number to be set
   */
  public void setPhone(String phone) {
    this.phone = phone;
  }

  /**
   * Gets the id of the user.
   * @return the id of user
   */
  public int getId() {
    return id;
  }

  /**
   * Sets the id of user with the given id argument.
   * @param id the id of user to be set
   */
  public void setId(int id) {
    this.id = id;
  }

  /**
   * Gets a list of books borrowed by the user.
   * @return the list of books borrowed by the user
   */
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
