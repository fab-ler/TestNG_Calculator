package testng;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class SubstractClass {

    private Calculator calculator;

    @BeforeTest
    public void createCalculator() {
        calculator = new Calculator();
    }

    @Test
    public void SubtractTest() {
        int[] expectedResults = {1, 2, -33, 11};
        int[] actualResults = {
                calculator.substract(3, 1),
                calculator.substract(9, 7),
                calculator.substract(2, 35),
                calculator.substract(33, 22),
        };

        Assert.assertEquals(actualResults, expectedResults);
    }

}
