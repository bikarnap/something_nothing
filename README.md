# something_something

# The program contains a Main class which can be run as:
## Compile Main.java
```
javac Main.java
```
## Run Main.class
```
java Main
```
# Run tests
There are 10 classes excluding the Main class. Each of the 10 classes has corresponding
test classes that contain test cases.

The test classes are:
1. AdminTest.java
2. BookTest.java
3. CalculatorTest.java
4. FineTest.java
5. LibraryTest.java
6. ReservationTest.java
7. ReservationListTest.java
8. SearchTest.java
9. StringManipulatorTest.java
10. UserTest.java

Each test case suite can be run individually or all the test suites can be run as a whole. 
To run tests as described below, first of all navigate to the folder - unit
For example cd unit

## Run test case suite individually
To run a test case suite AdminTest.java, first compile it
```
javac -cp ".:junit-4.12.jar:hamcrest-core-1.3.jar:cpsuite-1.2.6.jar" AdminTest.java 
```
Then run the test 
```
java -cp ".:junit-4.12.jar:hamcrest-core-1.3.jar:cpsuite-1.2.6.jar" org.junit.runner.JUnitCore AdminTest
```

In the same way other test case classes can be run.

## Run all test case suites
There is a Java file named TestSuiteAll.java. This file can be compiled and run in the same way as above.
Compile TestSuiteAll.java
```
javac -cp ".:junit-4.12.jar:hamcrest-core-1.3.jar:cpsuite-1.2.6.jar" TestSuiteAll.java 
```
Then run TestSuiteAll
```
java -cp ".:junit-4.12.jar:hamcrest-core-1.3.jar:cpsuite-1.2.6.jar" org.junit.runner.JUnitCore TestSuiteAll
```

# Output

The output of running the all test suites (TestSuiteAll) can be redirected to OUTPUT.txt file as
Compile TestRunner.java
```
javac -cp ".:junit-4.12.jar:hamcrest-core-1.3.jar:cpsuite-1.2.6.jar" TestRunner.java 
```
Then run TestRunner
```
java -cp ".:junit-4.12.jar:hamcrest-core-1.3.jar:cpsuite-1.2.6.jar" TestRunner > OUTPUT.txt
```
*** Note that in Windows ':' should be replaced by ';' ***

*** All the unit tests for each of the test classes can be run on Linux/Mac by creating a .sh file with the following contents ***
```
#!/bin/bash
test_classes="AdminTest BookTest CalculatorTest FineTest LibraryTest ReservationTest ReservationListTest SearchTest StringManipulatorTest UserTest"
# echo $test_classes
for test in $test_classes; do
  echo "Running test for $test"
  javac -cp ".:junit-4.12.jar:hamcrest-core-1.3.jar:cpsuite-1.2.6.jar" $test.java
  java -cp ".:junit-4.12.jar:hamcrest-core-1.3.jar:cpsuite-1.2.6.jar" org.junit.runner.JUnitCore $test
done
```