import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)

@SuiteClasses({
  AdminTest.class,
  BookTest.class,
  CalculatorTest.class,
  FineTest.class,
  LibraryTest.class,
  ReservationTest.class,
  ReservationListTest.class, 
  SearchTest.class,
  StringManipulatorTest.class,
  UserTest.class
})
public class TestSuiteAll {

}
