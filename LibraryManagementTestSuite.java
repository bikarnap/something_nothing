import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)

@SuiteClasses({
  AdminTest.class,
  BookTest.class,
  FineTest.class,
  LibraryTest.class,
  // UserTest.class,
  
  // ReservationTest.class,
  // ReservationListTest.class, 
  
  // SearchTest.class
})
public class LibraryManagementTestSuite {
  public static void main(String[] args) {
    System.out.println("Test suite");
  }
}
