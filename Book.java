/**
 * @author  Bikarna Pokharel &lt;bikarnap@gmail.com&gt;
 * @version 2023.0322
 * 
 */
/**
 * The Book class represents a book with a title, author, and ISBN
 */
public class Book {
  /**
   * Represents the title of book.
   */
  private String title;
  /**
   * Represents the author of book.
   */
  private String author;
  /**
   * Represents the isbn of book.
   */
  private String isbn;

  /**
   * Constructs a Book object from this Book class.
   * @param title the title of the book
   * @param author the author of the book
   * @param isbn the isbn of the book
   */
  public Book (String title, String author, String isbn) {
    this.title = title;
    this.author = author;
    this.isbn = isbn;
  }

  /**
   * Gets the title of book.
   * @return title of book
   */
  public String getTitle() {
    return title;
  }

  /**
   * Sets the title of book.
   * 
   * <p> The title of the book is provided as argument.
   * 
   * @param title the title of book
   */
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * Gets the author of book.
   * @return author of book
   */
  public String getAuthor() {
    return author;
  }

  /**
   * Sets the author of book.
   * 
   * <p> The name of the author is provided as argument.
   * 
   * @param author the author of book.
   */
  public void setAuthor(String author) {
    this.author = author;
  }

  /**
   * Gets the isbn of book.
   * @return isbn of book
   */
  public String getIsbn() {
    return isbn;
  }

  /**
   * Sets the isbn of book.
   * 
   * <p> The isbn of book is provided as argument.
   * 
   * @param isbn
   */
  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }
}