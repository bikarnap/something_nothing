import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

public class MyTestListener extends RunListener {

  private int testCount = 0;
  private int failureCount = 0;
  private long startTime;

  @Override
  public void testRunStarted(Description description) {
    System.out.println("Running test runner...");
    System.out.println();
  }

  @Override
  public void testStarted(Description description) {
    testCount++;
    System.out.println(testCount + ") " + description.getDisplayName() + ":");
    startTime = System.currentTimeMillis();
  }

  @Override
  public void testFinished(Description description) {
    long duration = System.currentTimeMillis() - startTime;
    if (failureCount == 0) {
        System.out.println("    OK (" + duration + "ms)");
    }
    System.out.println();
  }

  @Override
  public void testFailure(Failure failure) {
    failureCount++;
    System.out.println("    FAILED: " + failure.getMessage());
    System.out.println(failure.getTrace());
    System.out.println();
  }

  @Override
  public void testRunFinished(Result result) {
    System.out.println();
    System.out.println("OK: " + (result.getRunCount() - result.getFailureCount() - result.getIgnoreCount())
            + ", Failed: " + result.getFailureCount() + ", Ignored: " + result.getIgnoreCount());
    System.out.println("Test run finished in " + result.getRunTime() + "ms");
    }
}
