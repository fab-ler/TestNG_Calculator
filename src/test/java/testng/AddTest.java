package testng;

import com.sun.net.httpserver.Authenticator;
import org.testng.annotations.*;

import java.util.Random;

import static org.testng.Assert.assertEquals;

public class AddTest {
    private Calculator calculator;

    @BeforeTest
    public void createCalculator() {
        calculator = new Calculator();
    }

    @DataProvider(name = "Данные для суммирования")
    public Object[][] dataForSum() {
        return new Object[][]{
                {1, 2, 3},
                {-1, -2, -3},
        };
    }

    @Test(dataProvider = "Данные для суммирования")
    public void testSum(double a, double b, double expectedResult) {
        double sum = calculator.add(a, b);
        assertEquals(sum, expectedResult, "Addition Succeded");
    }

    @Parameters({"a", "b"})
    @Test(expectedExceptions = {ArithmeticException.class})
    public void division(@Optional("0") double a, @Optional("0") double b) {
        calculator.divide(0, 0);
    }

    @Test(retryAnalyzer = Authenticator.Retry.class)
    public void flackyTest() {
        if (new Random().nextBoolean()) {
            throw new ArithmeticException();
        }
    }
}
