import java.util.ArrayList;
import java.util.List;

/**
 * This class serves as a Search service where user can search for a book.
 * <p> Result of search is based on avaialbility of book in the library.
 */
public class Search {
  /**
   * Placeholder for the search string
   */
  private String search;
  /**
   * Placeholder for saving the books based on the search string
   */
  private List<Book> results;
  /**
   * Library object to search the books from
   */
  private Library library;

  /**
   * Constructs a Search object.
   * <p> Initializes an empty search string,
   * an empty ArrayList for search results of books.
   */
  public Search(Library library) {
    this.search = "";
    this.results = new ArrayList<>();
    this.library = library;
  }

  /**
   * Sets the search string.
   * <p> The search of books is based on the provided search string.
   * @param search the string passed as search string
   */
  public void setSearch(String search) {
    this.search = search;
  }

  /**
   * Gets the provided search string.
   * @return the search string
   */
  public String getSearch() {
    return search;
  }

  /**
   * Gets the list of books that matches the search string condition.
   * @return the list of books
   */
  public List<Book> getResults() {
    return results;
  }

  /**
   * Searches for the book that matches the search string.
   * <p> Initial implementation looks for exact match of book.
   * @param book the book that needs to be searched
   */
  public void searchBook(Book book) {
    if (library.getAllBooks().contains(book)) {
      results.add(book);
    } else {
      System.out.println("Book not found");
    }
  }

  /**
   * Returns the information about search and results as a string.
   */
  @Override
  public String toString() {
    return "Search [search=" + search + "]";
  }
}
