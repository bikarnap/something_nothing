import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * @author  Bikarna Pokharel &lt;bikarnap@gmail.com&gt;
 * @version 2023.0325
 * @since 17.0
 */
@RunWith(JUnit4.class)
public class SearchTest {
  private Book book1, book2, book3;
  private Library library;
  private Search search;

  @Before
  public void setup() {
    book1 = new Book("Advanced Software Testing Vol. 1", 
      "Black R.", "1912");
    book2 = new Book("The Software Engineer's Handbook, 1st editonAdvanced Software Testing Vol. 1", 
      "Graham B & McKay J", "1911");
    book3 = new Book("Software Testing, 2nd edition", 
      "Patton R", "1946");
    library = new Library();
    try {
      library.addBook(book1);
      library.addBook(book2);
      library.addBook(book3);
    } catch (BookAlreadyExistsException e) {
      System.out.println(e.getMessage());
    } catch (InvalidBookException e) {
      System.out.println(e.getMessage());
    }
   
    search = new Search(library);
  }

  /**
   * Test the number of results based on the search results.
   * <p> Tests after searching for Book book1
   * <p> Uses assertEquals 
   */
  @Test
  public void testGetResultsBook1() {
    search.searchBook(book1);
    assertEquals(1, search.getResults().size());
  }

  /**
   * Test the number of results based on the search results.
   * <p> Tests after searching for Book book2.
   * <p> Uses assertEquals. 
   */
  @Test
  public void testGetResultsBook2() {
    search.searchBook(book2);
    assertEquals(1, search.getResults().size());
  }

  /**
   * Test the number of results based on the search results.
   * <p> Tests after searching for Book book3.
   * <p> Uses assertEquals. 
   */
  @Test
  public void testGetResultsBook3() {
    search.searchBook(book3);
    assertEquals(1, search.getResults().size());
  }

  /**
   * Tests the search for Book book1.
   * <p> The search is tested against the title of the book1.
   * <p> Uses assertEquals to test the equality of book1 title and the search string.
   */
  @Test
  public void testGetSearchBook1() {
    search.setSearch("Advanced Software Testing Vol. 1");
    assertEquals("Advanced Software Testing Vol. 1", search.getSearch());
  }

  /**
   * Tests the search for Book book2.
   * <p> The search is tested against the title of the book2.
   * <p> Uses assertEquals to test the equality of book2 title and the search string.
   */
  @Test
  public void testGetSearchBook2() {
    search.setSearch("The Software Engineer's Handbook, 1st editonAdvanced Software Testing Vol. 1");
    assertEquals("The Software Engineer's Handbook, 1st editonAdvanced Software Testing Vol. 1", search.getSearch());
  }

   /**
   * Tests the search for Book book3.
   * <p> The search is tested against the title of the book3.
   * <p> Uses assertEquals to test the equality of book3 title and the search string.
   */
  @Test
  public void testGetSearchBook3() {
    search.setSearch("Software Testing, 2nd edition");
    assertEquals("Software Testing, 2nd edition", search.getSearch());
  }

  /**
   * Searches for Book book1.
   * <p> Uses assertTrue to check that search results contains book1.
   */
  @Test
  public void testSearchBook1() {
    search.searchBook(book1);
    assertTrue(search.getResults().contains(book1));
  }

  /**
   * Searches for Book book2.
   * <p> Uses assertTrue to check that search results contains book2.
   */
  @Test
  public void testSearchBook2() {
    search.searchBook(book2);
    assertTrue(search.getResults().contains(book2));
  }

  /**
   * Searches for Book book3.
   * <p> Uses assertFalse to check that search results contains book1.
   */
  @Test
  public void testSearchBook3() {
    search.searchBook(book3);
    assertFalse(search.getResults().contains(book1));
  }

  /**
   * Tests if the application looks for the search string provided.
   * <p> Uses assertEquals to check if the search string matches the returned search string.
   */
  @Test
  public void testSetSearch1() {
    search.setSearch("Advanced Testing book");
    assertEquals("Advanced Testing book", search.getSearch());
  }

  /**
   * Tests if the application looks for the search string provided.
   * <p> Uses assertEquals to check if the search string matches the returned search string.
   */
  @Test
  public void testSetSearch2() {
    search.setSearch("Advanced Testing book of Fame");
    assertEquals("Advanced Testing book of Fame", search.getSearch());
  }

  /**
   * Tests if the application looks for the search string provided.
   * <p> Uses assertEquals to check if the search string matches the returned search string.
   */
  @Test
  public void testSetSearch3() {
    search.setSearch("Harry Porter");
    assertEquals("Harry Porter", search.getSearch());
  }

  /**
   * Tests if the toString method outputs the correct string.
   * <p> Adds a book to library.
   * Creates a new Search object.
   * Sets a search string.
   * <p> Uses assertEqual to test the equality of the toString returned
   * string with the provided expected string.
   */
  @Test
  public void testToString1() {
    Book book4 = new Book("Advanced Software Testing Vol. 2", 
    "Black R.", "1989-111-222");
    try {
      library.addBook(book4);
    } catch (BookAlreadyExistsException e) {
      System.out.println(e.getMessage());
      return;
    } catch (InvalidBookException e) {
      System.out.println(e.getMessage());
      return;
    }
    
    Search search = new Search(library);
    search.setSearch("Advanced Software Testing Vol. 2");
    assertEquals("Search [search=Advanced Software Testing Vol. 2]", search.toString());
  }

  /**
   * Tests if the toString method outputs the correct string.
   * <p> Adds a book to library.
   * Creates a new Search object.
   * Sets a search string.
   * <p> Uses assertEqual to test the equality of the toString returned
   * string with the provided expected string.
   */
  @Test
  public void testToString2() {
    Book book5 = new Book("When the shadow ends", 
    "Pen M.", "1989-111-222");
    try {
      library.addBook(book5);
    } catch (BookAlreadyExistsException e) {
      System.out.println(e.getMessage());
      return;
    } catch (InvalidBookException e) {
      System.out.println(e.getMessage());
      return;
    }
    Search search = new Search(library);
    search.setSearch("When the shadow ends");
    assertEquals("Search [search=When the shadow ends]", search.toString());
  }

  /**
   * Tests if the toString method outputs the correct string.
   * <p> Adds a book to library.
   * Creates a new Search object.
   * Sets a search string.
   * <p> Uses assertEqual to test the equality of the toString returned
   * string with the provided expected string.
   */
  @Test
  public void testToString3() {
    Book book6 = new Book("When the shadow ends - Part 2", 
    "Pen M.", "1989-111-221");
    try {
      library.addBook(book6);
    } catch (BookAlreadyExistsException e) {
      System.out.println(e.getMessage());
      return;
    } catch (InvalidBookException e) {
      System.out.println(e.getMessage());
      return;
    }
    Search search = new Search(library);
    search.setSearch("When the shadow ends - Part 2");
    assertEquals("Search [search=When the shadow ends - Part 2]", search.toString());
  }
}
