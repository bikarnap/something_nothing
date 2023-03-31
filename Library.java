import java.util.ArrayList;
import java.util.List;

/**
 * @author  Bikarna Pokharel &lt;bikarnap@gmail.com&gt;
 * @version 2023.0322
 * @since 17.0
 */
/**
 * This class represents a Library object.
 */
 public class Library {
  /**
   * Represents the list of books available in the library.
   */
  private List<Book> books;
  /**
   * Declares a list of users of library.
   */
  private List<User> users;

  /**
   * Constructs a Library object from this class.
   * 
   * <p> Initializes an empty list of books as ArrayList.
   * 
   * @param none no argument
   */
  public Library() {
    this.books = new ArrayList<>();
    this.users = new ArrayList<>();
  }
  
  /**
   * Adds a book to the library.
   * 
   * <p> A book object is passed as argument, which 
   * is added to the books list.
   * 
   * @param book the book to be added
   */
  public void addBook(Book book) throws InvalidBookException, BookAlreadyExistsException {
    if (book == null || 
        book.getTitle() == null || 
        book.getAuthor() == null || 
        book.getIsbn() == null) {
      throw new InvalidBookException("Invalid book boject");
    }

    for (Book b : books) {
      if (b.getIsbn().equals(book.getIsbn())) {
        throw new BookAlreadyExistsException("Book already exists.");
      }
    }
    books.add(book);
  }

  /**
   * Removes a book from the library.
   * 
   * <p> The book to be removed is passed as argument.
   * 
   * @param book the book to be removed
   */
  public void removeBook(Book book) {
    if (book != null) {
      books.remove(book);
    }
  }

  /**
   * Gets all the books in the library.
   * 
   * <p> All the books of the library are returned as an array list.
   * 
   * @return the list of avaialable books
   */
  public List<Book> getAllBooks() {
    return new ArrayList<>(books);
  }

  /**
   * Checks if a book is available in the library.
   * 
   * <p> The books list is checked to find if the book is available.
   * 
   * @param book the book to be checked
   * @return True | False
   */
  public boolean isBookAvailable(Book book) {
    return books.contains(book);
  }

  /**
   * Gets the total number of books in the library.
   * 
   * <p> An integer value of number of books is returned by this method.
   * 
   * @return number of books <int>
   */
  public int getNumberOfBooks() {
    return books.size();
  }

  /**
   * Adds a user to library.
   * <p> A User object is passed as argument.
   * @param user the User object to be added
   */
  public void addUser(User user) {
    users.add(user);
  }

  /**
   * Removes a user from library.
   * <p> A User object is passed as argument.
   * @param user the User object to be removed
   */
  public void removeUser(User user) {
    users.remove(user);
  }

  public List<User> getUsers() {
    return users;
  }
}
