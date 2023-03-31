import java.util.ArrayList;
import java.util.List;

/**
 * @author  Bikarna Pokharel &lt;bikarnap@gmail.com&gt;
 * @version 2023.0322
 * 
 */
public class LibraryStaff {
  private String name;
  private String libraryId;
  private List<Book> books;

  public LibraryStaff(String name, String libraryId) {
    this.name = name;
    this.libraryId = libraryId;
    this.books = new ArrayList<>();
  }

  public String getName() {
    return name;
  }

  public String getLibraryId() {
    return libraryId;
  }

  public List<Book> getBooks() {
    return books;
  }

  public void addBook(Book book) throws BookAlreadyExistsException, InvalidBookException {
    if (book == null) {
      throw new InvalidBookException("Book cannot be null");
    }

    if (books.contains(book)) {
      throw new BookAlreadyExistsException("Book " + book.getTitle() + " already exists");
    }

    books.add(book);
  }

  public void removeBook(Book book) throws BookNotFoundException, InvalidBookException {
    if (book == null) {
      throw new InvalidBookException("Book cannot be null");
    }

    if (!books.contains(book)) {
      throw new BookNotFoundException("Book " + book.getTitle() + " not found");
    }
  }

  @Override
  public String toString() {
    return "LibraryStaff [name=" + name + ", libraryId=" + libraryId + "]";
  }
}
