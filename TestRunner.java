import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class TestRunner {

  public static void main(String[] args) {
    JUnitCore junit = new JUnitCore();
    junit.addListener(new MyTestListener());
    junit.run(TestSuiteAll.class);
  }
}
