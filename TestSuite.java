import org.junit.extensions.cpsuite.ClasspathSuite;
import org.junit.extensions.cpsuite.ClasspathSuite.*;
import static org.junit.extensions.cpsuite.SuiteType.*;

import org.junit.runner.RunWith;
import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;

@RunWith(ClasspathSuite.class)

// Run only tests matching regexp; Ignore classes with "!"
@ClassnameFilters({
    ".*Test",
    "!.*Regression.*"
})
public class TestSuite {
    public static void main(String args[]) {
        JUnitCore junit = new JUnitCore();
        junit.addListener(new TextListener(System.out));
        junit.run(TestSuiteAll.class);
    }
}
