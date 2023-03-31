import org.junit.runner.JUnitCore;


public class TestRunner {

    public static void main(String[] args) {
        JUnitCore junit = new JUnitCore();
        junit.addListener(new MyTestListener());
        junit.run(AdminTest.class);
    }
}
