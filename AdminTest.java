import static org.junit.Assert.assertEquals;
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
public class AdminTest {
  /**
   * Declares a Book object with name book1.
   */
  private Book book1;
  /**
   * Declares a Book object with name book2.
   */
  private Book book2;
  /**
   * Declares a Book object with name book3.
   */
  private Book book3;
  /**
   * Declares an Admin object with name admin.
   */
  private Admin admin;
  /**
   * Declares User object.
   */
  private User user1, user2, user3, user;
  
  /**
   * Runs before every test case.
   */
  @Before
  public void setup() {
    book1 = new Book("Advanced Software Testing Vol. 1", 
      "Black R.", "1912");
    book2 = new Book("The Software Engineer's Handbook, 1st editonAdvanced Software Testing Vol. 1", 
      "Graham B & McKay J", "1911");
    book3 = new Book("Software Testing, 2nd edition", 
      "Patton R", "1946");
    user1 = new User("Bikarna Pokharel", "0466151364", 1);
    user2 = new User("Timo Pitkanen", "0466123164", 2);
    user3 = new User("Reshma Mahat", "0445413649", 3);
    user = new User("Jose Admin", "0505413649", 100);
    admin = new Admin(user);
  }

  /**
   * Tests the addBook method.
   * <p> Book book1 is used for the test.
   * <p> Uses assertTrue assertion.
   */
  @Test
  public void testAddBook1() {
    admin.addBook(book1);
    assertTrue(admin.getBooks().contains(book1));
  }

  /**
   * Tests the addBook method.
   * <p> Book book2 is used for the test.
   * <p> Uses assertTrue assertion.
   */
  @Test
  public void testAddBook2() {
    admin.addBook(book2);
    assertTrue(admin.getBooks().contains(book2));
  }

  /**
   * Tests the addBook method.
   * <p> Book book3 is used for the test.
   * <p> Uses assertTrue assertion.
   */
  @Test
  public void testAddBook3() {
    admin.addBook(book3);
    assertTrue(admin.getBooks().contains(book3));
  }

  /**
   * Tests the addUser method.
   * <p> User user1 is used for the test.
   * <p> Uses assertTrue assertion.
   */
  @Test
  public void testAddUser1() {
    admin.addUser(user1);
    assertTrue(admin.getUsers().contains(user1));
  }

  /**
   * Tests the addUser method.
   * <p> User user2 is used for the test.
   * <p> Uses assertTrue assertion.
   */
  @Test
  public void testAddUser2() {
    admin.addUser(user2);
    assertTrue(admin.getUsers().contains(user2));
  }

  /**
   * Tests the addUser method.
   * <p> User user3 is used for the test.
   * p> Uses assertTrue assertion.
   */
  @Test
  public void testAddUser3() {
    admin.addUser(user3);
    assertTrue(admin.getUsers().contains(user3));
  }

  /**
   * Tests the removeBook method.
   * <p> Book book1 is used for the test.
   * <p> Uses assertTrue assertion.
   */
  @Test
  public void testRemoveBook1() {
    admin.removeBook(book1);
    assertTrue("Book not found", !admin.getBooks().contains(book1));
  }

  /**
   * Tests the removeBook method.
   * <p> Book book2 is used for the test.
   * <p> Uses assertTrue assertion.
   */
  @Test
  public void testRemoveBook2() {
    admin.removeBook(book2);
    assertTrue("Book not found", !admin.getBooks().contains(book2));
  }

  /**
   * Tests the removeBook method.
   * <p> Book book3 is used for the test.
   * <p> Uses assertTrue assertion.
   */
  @Test
  public void testRemoveBook3() {
    admin.removeBook(book1);
    assertTrue("Book not found", !admin.getBooks().contains(book2));
  }

  /**
   * Tests the removeUser method.
   * <p> User user1 is used for the test.
   * <p> Uses assertTrue assertion.
   */
  @Test
  public void testRemoveUser1() {
    admin.removeUser(user1);
    assertTrue(!admin.getUsers().contains(user1));
  }

  /**
   * Tests the removeUser method.
   * <p> User user2 is used for the test.
   * <p> Uses assertTrue assertion.
   */
  @Test
  public void testRemoveUser2() {
    admin.removeUser(user2);
    assertTrue(!admin.getUsers().contains(user2));
  }

  /**
   * Tests the removeUser method.
   * <p> User user3 is used for the test.
   * <p> Uses assertTrue assertion.
   */
  @Test
  public void testRemoveUser3() {
    admin.removeUser(user3);
    assertTrue(!admin.getUsers().contains(user3));
  }

  /**
   * Tests the toSrting method.
   *
   * <p> Uses assertEquals assertion.
   */
  @Test 
  public void testToString1() {
    assertEquals("Admin [admin=User [name=Jose Admin, phone=0505413649, id=100], users=[], books=[]]", admin.toString());
  }

  /**
   * Tests the toSrting method.
   * <p> Creates a new User user object and creates an admin User object from that User object.
   * <p> Uses assertEquals assertion.
   */
  @Test 
  public void testToString2() {
    User user = new User("Adnub Admin", "0505413689", 200);
    admin = new Admin(user);
    assertEquals("Admin [admin=User [name=Adnub Admin, phone=0505413689, id=200], users=[], books=[]]", admin.toString());
  }

  /**
   * Tests the toSrting method.
   * <p> Creates a new User user object and creates an admin User object from that User object.
   * <p> Uses assertEquals assertion.
   */
  @Test 
  public void testToString3() {
    User user = new User("Admin Roman", "0505413439", 300);
    admin = new Admin(user);
    assertEquals("Admin [admin=User [name=Admin Roman, phone=0505413439, id=300], users=[], books=[]]", admin.toString());
  }

}
