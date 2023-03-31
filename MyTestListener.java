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
        System.out.println("Running " + description.getClassName() + "...");
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

// import org.junit.runner.Description;
// import org.junit.runner.Result;
// import org.junit.runner.notification.Failure;
// import org.junit.runner.notification.RunListener;

// public class MyTestListener extends RunListener {

//     private long startTime;
//     private int testCount = 0;
//     private int failureCount = 0;

//     @Override
//     public void testStarted(Description description) {
//         testCount++;
//         System.out.println("Starting test #" + testCount + ": " + description.getMethodName());
//         startTime = System.currentTimeMillis();
//     }

//     @Override
//     public void testFinished(Description description) {
//         long duration = System.currentTimeMillis() - startTime;
//         String status = (failureCount == 0) ? "SUCCESS" : "FAILURE";
//         String format = "| %-30s | %-10s | %-10s |%n";
//         System.out.format("+--------------------------------+------------+------------+%n");
//         System.out.format(format, "Test Name", "Status", "Duration");
//         System.out.format("+--------------------------------+------------+------------+%n");
//         System.out.format(format, description.getMethodName(), status, duration + "ms");
//         System.out.format("+--------------------------------+------------+------------+%n");
//         System.out.println();
//     }

//     @Override
//     public void testFailure(Failure failure) {
//         failureCount++;
//         System.out.println("Test failed: " + failure.getMessage());
//         System.out.println(failure.getTrace());
//     }

//     @Override
//     public void testAssumptionFailure(Failure failure) {
//         System.out.println("Test assumption failed: " + failure.getMessage());
//         System.out.println(failure.getTrace());
//     }

//     @Override
//     public void testIgnored(Description description) {
//         System.out.println("Test ignored: " + description.getMethodName());
//     }

//     @Override
//     public void testRunFinished(Result result) {
//         System.out.println("Test run finished. Total tests run: " + result.getRunCount() +
//                 ", failures: " + result.getFailureCount() +
//                 ", ignored: " + result.getIgnoreCount() +
//                 ", success: " + (result.getRunCount() - result.getFailureCount() - result.getIgnoreCount()) +
//                 ", duration (ms): " + result.getRunTime());
//         if (failureCount > 0) {
//             System.err.println("Test run failed with " + failureCount + " failures.");
//         } else {
//             System.out.println("Test run succeeded.");
//         }
//     }
// }
