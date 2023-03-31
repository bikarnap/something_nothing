# Run tests

Each test case suite can be run individually or all the test suites can be run as a whole. 
To run tests as described below, first of all navigate to the folder - unit
For example cd unit

## Run test case suite individually
To run a test case suite AdminTest.java, first compile it
````
javac -cp ".:junit-4.12.jar:hamcrest-core-1.3.jar:cpsuite-1.2.6.jar" AdminTest.java 
````
Then run the test 
````
java -cp ".:junit-4.12.jar:hamcrest-core-1.3.jar:cpsuite-1.2.6.jar" org.junit.runner.JUnitCore AdminTest
````

## Run all test case suites
There is a Java file named TestSuiteAll.java. This file can be compiled and run in the same way as above.
Compile TestSuiteAll.java
````
javac -cp ".:junit-4.12.jar:hamcrest-core-1.3.jar:cpsuite-1.2.6.jar" TestSuiteAll.java 
````
Then run TestSuiteAll
````
java -cp ".:junit-4.12.jar:hamcrest-core-1.3.jar:cpsuite-1.2.6.jar" org.junit.runner.JUnitCore TestSuiteAll
````

# Output

The output of running the all test suites (TestSuiteAll) can be redirected to OUTPUT.txt file as
Compile TestRunner.java
````
javac -cp ".:junit-4.12.jar:hamcrest-core-1.3.jar:cpsuite-1.2.6.jar" TestRunner.java 
````
Then run TestRunner
````
java -cp ".:junit-4.12.jar:hamcrest-core-1.3.jar:cpsuite-1.2.6.jar" > OUTPUT.txt
````
