import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * @author  Bikarna Pokharel &lt;bikarnap@gmail.com&gt;
 * @version 2023.0325
 * 
 */
@RunWith(JUnit4.class)
public class BookTest {
  /**
   * Book object
   */
  private Book book1, book2, book3;
  
  /**
   * Sets up an initial state before running every test.
   * <p> Initializes book1, book2, and book3</p>
   */
  @Before
  public void setup() {
    book1 = new Book("Advanced Software Testing Vol. 1", 
      "Black R.", "1912");
    book2 = new Book("The Software Engineer's Handbook, 1st editonAdvanced Software Testing Vol. 1", 
      "Graham B & McKay J", "1911");
    book3 = new Book("Software Testing, 2nd edition", 
      "Patton R", "1946");
  }

  /**
   * Tests the title of object book1.
   * 
   * <p> Uses assertEquals to check the title of the book with the expected title.</p>
   */
  @Test
  public void testBook1Title () {
    assertEquals("Advanced Software Testing Vol. 1", book1.getTitle());
  }

  /**
   * Tests the title of object book2.
   * 
   * <p> Uses assertEquals to check the title of the book with the expected title.</p>
   */
  @Test
  public void testBook2Title () {
    assertEquals("The Software Engineer's Handbook, 1st editonAdvanced Software Testing Vol. 1", 
      book2.getTitle());
  }

  /**
   * Tests the title of object book3.
   * 
   * <p> Uses assertEquals to check the title of the book with the expected title.</p>
   */
  @Test
  public void testBook3Title () {
    assertEquals("Software Testing, 2nd edition", book3.getTitle());
  }

  /**
   * Tests the author of object book1.
   * 
   * <p> Uses assertEquals to check the title of the book with the expected title.</p>
   */
  @Test
  public void testBook1Author () {
    assertEquals("Black R.", book1.getAuthor());
  }

  /**
   * Tests the author of object book2.
   * 
   * <p> Uses assertEquals to checm the title of the book with the expected title.</p>
   */
  @Test
  public void testBook2Author () {
    assertEquals("Graham B & McKay J", book2.getAuthor());
  }

  /**
   * Tests the author of object book3.
   * 
   * <p> Uses assertEquals to check the title of the book with the expected title.</p>
   */
  @Test
  public void testBook3Author () {
    assertEquals("Patton R", book3.getAuthor());
  }

  /**
   * Tests the isbn of object book1.
   * 
   * <p> Uses assertEquals to check the title of the book with the expected title.</p>
   */
  @Test
  public void testBook1Isbn () {
    assertEquals("1912", book1.getIsbn());
  }

  /**
   * Tests the isbn of object book2.
   * 
   * <p> Uses assertEquals to check the title of the book with the expected title.</p>
   */
  @Test
  public void testBook2Isbn () {
    assertEquals("1911", book2.getIsbn());
  }

  /**
   * Tests the author of isbn book3.
   * 
   * <p> Uses assertEquals to check the title of the book with the expected title.</p>
   */
  @Test
  public void testBook3Isbn () {
    assertEquals("1946", book3.getIsbn());
  }

  /**
   * Tests the title of object book1 after setting its title.
   * 
   * <p> Uses assertEquals to check the title of the book with the expected title.</p>
   */
  @Test
  public void testSetTitleBook1 () {
    book1.setTitle("Test Driven development by Example");
    assertEquals("Test Driven development by Example", book1.getTitle());
  }

  /**
   * Tests the title of object book2 after setting its title.
   * 
   * <p> Uses assertEquals to check the title of the book with the expected title.</p>
   */
  @Test
  public void testSetTitleBook2 () {
    book2.setTitle("Test Driven development by Example");
    assertEquals("Test Driven development by Example", book2.getTitle());
  }

  /**
   * Tests the title of object book3 after setting its title.
   * 
   * <p> Uses assertEquals to check the title of the book with the expected title.</p>
   */
  @Test
  public void testSetTitleBook3 () {
    book3.setTitle("Test Driven development by Example");
    assertEquals("Test Driven development by Example", book3.getTitle());
  }

  /**
   * Tests the author of object book1 after setting its author.
   * 
   * <p> Uses assertEquals to check the author of the book with the expected title.</p>
   */
  @Test
  public void testSetAuthorBook1 () {
    book1.setAuthor("Beck Kent:");
    assertEquals("Beck Kent:", book1.getAuthor());
  }

  /**
   * Tests the author of object book2 after setting its author.
   * 
   * <p> Uses assertEquals to check the author of the book with the expected title.</p>
   */
  @Test
  public void testSetAuthorBook2 () {
    book2.setAuthor("Beck Kent:");
    assertEquals("Beck Kent:", book2.getAuthor());
  }

  /**
   * Tests the author of object book3 after setting its author.
   * 
   * <p> Uses assertEquals to check the author of the book with the expected title.</p>
   */
  @Test
  public void testSetAuthorBook3 () {
    book3.setAuthor("Beck Kent:");
    assertEquals("Beck Kent:", book3.getAuthor());
  }

  /**
   * Tests the isbn of object book1 after setting its isbn.
   * 
   * <p> Uses assertEquals to check the isbn of the book with the expected title.</p>
   */
  @Test
  public void testSetIsbnBook1 () {
    book1.setIsbn("1946");
    assertEquals("1946", book1.getIsbn());
  }

  /**
   * Tests the isbn of object book2 after setting its isbn.
   * 
   * <p> Uses assertEquals to check the isbn of the book with the expected title.</p>
   */
  @Test
  public void testSetIsbnBook2 () {
    book2.setIsbn("1946");
    assertEquals("1946", book2.getIsbn());
  }

  /**
   * Tests the isbn of object book3 after setting its isbn.
   * 
   * <p> Uses assertEquals to check the isbn of the book with the expected title.</p>
   */
  @Test
  public void testSetIsbnBook3 () {
    book3.setIsbn("1946");
    assertEquals("1946", book3.getIsbn());
  }
}
