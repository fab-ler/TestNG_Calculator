package testng;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiplyTest {
    private Calculator calculator;

    @BeforeTest
    public void createCalculator() {
        calculator = new Calculator();
    }

    @Parameters({"a", "b"})
    @Test(description = {"Multiply Simpla Operation"})
    public void multiply(@Optional("0") double a, @Optional("0") double b) throws InterruptedException {
        Thread.sleep(10000);
        calculator.multiply(0, 0);
    }

}
