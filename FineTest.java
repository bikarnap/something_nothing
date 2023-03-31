import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * @author  Bikarna Pokharel &lt;bikarnap@gmail.com&gt;
 * @version 2023.0325
 * @since 17.0
 */
@RunWith(JUnit4.class)
public class FineTest {
  /**
   * Tests getFineId method.
   * <p> Uses assertEquals assertion for testing.
   */
  @Test
  public void testGetFineId1() {
    Fine fine = new Fine(1, null, 10.0, new Date(), "unpaid");
    assertEquals(1, fine.getFineId());
  }

  /**
   * Tests getFineId method.
   * <p> Uses assertEquals assertion for testing.
   */
  @Test
  public void testGetFineId2() {
    Fine fine = new Fine(2, null, 10.0, new Date(), "unpaid");
    assertEquals(2, fine.getFineId());
  }

  /**
   * Tests getFineId method.
   * <p> Uses assertEquals assertion for testing.
   */
  @Test
  public void testGetFineId3() {
    Fine fine = new Fine(3, null, 10.0, new Date(), "unpaid");
    assertEquals(3, fine.getFineId());
  }

  /**
   * Tests getFineAmount method.
   * <p> Uses assertEquals assertion for testing.
   */
  @Test
  public void testGetFineAmount1() {
    Fine fine = new Fine(1, null, 10.0, new Date(), "unpaid");
    assertEquals(10.0, fine.getFineAmount(), 0.01);
  }

  /**
   * Tests getFineAmount method.
   * <p> Uses assertEquals assertion for testing.
   */
  @Test
  public void testGetFineAmount2() {
    Fine fine = new Fine(1, null, 20.0, new Date(), "unpaid");
    assertEquals(20.0, fine.getFineAmount(), 0.01);
  }

  /**
   * Tests getFineAmount method.
   * <p> Uses assertEquals assertion for testing.
   */
  @Test
  public void testGetFineAmount3() {
    Fine fine = new Fine(1, null, 30.0, new Date(), "unpaid");
    assertEquals(30.0, fine.getFineAmount(), 0.01);
  }

  /**
   * Tests setAmount method.
   * <p> Uses assertEquals assertion for testing.
   */
  @Test
  public void testSetAmount1() {
    Fine fine = new Fine(1, null, 10.0, new Date(), "unpaid");
    fine.setFineAmount(20.0);
    assertEquals(20.0, fine.getFineAmount(), 0.01);
  }

  /**
   * Tests setAmount method.
   * <p> Uses assertEquals assertion for testing.
   */
  @Test
  public void testSetAmount2() {
    Fine fine = new Fine(1, null, 20.0, new Date(), "unpaid");
    fine.setFineAmount(34.10);
    assertEquals(34.10, fine.getFineAmount(), 0.01);
  }

  /**
   * Tests setAmount method.
   * <p> Uses assertEquals assertion for testing.
   */
  @Test
  public void testSetAmount3() {
    Fine fine = new Fine(1, null, 20.0, new Date(), "unpaid");
    fine.setFineAmount(0.0);
    assertEquals(0.0, fine.getFineAmount(), 0.01);
  }

  /**
   * Tests getDueDate method.
   * <p> Uses assertEquals assertion for testing.
   */
  @Test
  public void testGetDueDate1() {
    Date now = new Date();
    Fine fine = new Fine(1, null, 10.0, now, "unpaid");
    assertEquals(now, fine.getFineDate());
  }

  /**
   * Tests getDueDate method.
   * <p> Uses assertEquals assertion for testing.
   */
  @Test
  public void testGetDueDate2() {
    Date now = new Date();
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(now);
    calendar.add(Calendar.DATE, 14);
    Date dueDate = calendar.getTime();
    Fine fine = new Fine(1, null, 10.0, dueDate, "unpaid");
    assertEquals(dueDate, fine.getFineDate());
  }

  /**
   * Tests getDueDate method.
   * <p> Uses assertEquals assertion for testing.
   */
  @Test
  public void testGetDueDate3() {
    Date now = new Date();
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(now);
    calendar.add(Calendar.DATE, 2);
    Date dueDate = calendar.getTime();
    Fine fine = new Fine(1, null, 10.0, dueDate, "unpaid");
    assertEquals(dueDate, fine.getFineDate());
  }


  /**
   * Tests setDueDate method.
   * <p> Uses getFineDate to assert the set due date.
   * <p> Uses assertEquals assertion.
   */
  @Test
  public void testSetDueDate1() {
    Date now = new Date();
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(now);
    calendar.add(Calendar.DATE, 14);
    Date dueDate = calendar.getTime();
    Fine fine = new Fine(1, null, 10.0, now, "unpaid");
    fine.setFineDate(dueDate);
    assertEquals(dueDate, fine.getFineDate());
  }

  /**
   * Tests setDueDate method.
   * <p> Uses getFineDate to assert the set due date.
   * <p> Uses assertEquals assertion.
   */
  @Test
  public void testSetDueDate2() {
    Date now = new Date();
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(now);
    calendar.add(Calendar.DATE, 1);
    Date dueDate = calendar.getTime();
    Fine fine = new Fine(1, null, 10.0, now, "unpaid");
    fine.setFineDate(dueDate);
    assertEquals(dueDate, fine.getFineDate());
  }

  /**
   * Tests setDueDate method.
   * <p> Uses getFineDate to assert the set due date.
   * <p> Uses assertEquals assertion.
   */
  @Test
  public void testSetDueDate3() {
    Date now = new Date();
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(now);
    calendar.add(Calendar.DATE, -1);
    Date dueDate = calendar.getTime();
    Fine fine = new Fine(1, null, 10.0, now, "unpaid");
    fine.setFineDate(dueDate);
    assertEquals(dueDate, fine.getFineDate());
  }

  /**
   * Tests the getUser method.
   * <p> Uses assertEquals assertion check.
   */
  @Test
  public void testGetUser() {
    User user1 = new User("Bikarna Pokharel", "0466151364", 1);
    Fine fine = new Fine(1, user1, 10.0, new Date(), "unpaid");
    assertEquals(user1, fine.getUser());
  }

  /**
   * Tests the getUser method.
   * <p> Uses assertEquals assertion check.
   */
  @Test
  public void testGetUser2() {
    User user2 = new User("Timo Pitkanen", "0466123164", 2);
    Fine fine = new Fine(1, user2, 10.0, new Date(), "unpaid");
    assertEquals(user2, fine.getUser());
  }

  /**
   * Tests the getUser method.
   * <p> Uses assertEquals assertion check.
   */
  @Test
  public void testGetUser3() {
    User user3 = new User("Reshma Mahat", "0445413649", 3);
    Fine fine = new Fine(1, user3, 10.0, new Date(), "unpaid");
    assertEquals(user3, fine.getUser());
  }

  /**
   * Tests setUser method.
   * <p> Uses getUser method to check the set user.
   * <p> Uses assertEquals assertion check.
   */
  @Test
  public void testSetUser1() {
    User user1 = new User("Bikarna Pokharel", "0466151364", 1);
    User user2 = new User("Timo Pitkanen", "0466123164", 2);
    Fine fine = new Fine(1, user1, 10.0, new Date(), "unpaid");
    fine.setUser(user2);
    assertEquals(user2, fine.getUser());
  }

  /**
   * Tests setUser method.
   * <p> Uses getUser method to check the set user.
   * <p> Uses assertEquals assertion check.
   */
  @Test
  public void testSetUser2() {
    User user2 = new User("Timo Pitkanen", "0466123164", 2);
    User user3 = new User("Reshma Mahat", "0445413649", 3);
    Fine fine = new Fine(1, user2, 10.0, new Date(), "unpaid");
    fine.setUser(user3);
    assertEquals(user3, fine.getUser());
  }

  /**
   * Tests setUser method.
   * <p> Uses getUser method to check the set user.
   * <p> Uses assertEquals assertion check.
   */
  @Test
  public void testSetUser() {
    User user1 = new User("Bikarna Pokharel", "0466151364", 1);
    User user3 = new User("Reshma Mahat", "0445413649", 3);
    Fine fine = new Fine(1, user1, 10.0, new Date(), "unpaid");
    fine.setUser(user3);
    assertEquals(user3, fine.getUser());
  }
}
