package testng;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SquareTest {
    private Calculator calculator;

    @BeforeTest
    public void createCalculator() {
        calculator = new Calculator();
    }

    @AfterClass
    public void teardown() {
        calculator = null;
    }

    @Test(priority = 1, invocationCount = 3)
    public void SquareTest() {
        int[] numbers = {2, 4, 8, 12, 1000};
        int[] expectedResults = {4, 16, 64, 144, 1000000};
        for (int i = 0; i < numbers.length; i++) {
            int actualResult = calculator.square(numbers[i]);
            Assert.assertEquals(actualResult, expectedResults[i]);
        }
    }

    @Test(priority = 2, invocationCount = 2, threadPoolSize = 2)
    public void testThreadPools() {
        System.out.printf("Thread Id : %s%n", Thread.currentThread().getId());
    }

}
