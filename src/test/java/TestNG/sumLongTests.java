package TestNG;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class sumLongTests {

    @Test(groups = "sum")
    public void sumPositiveNumbersTest() {
        Calculator calc;
        calc = new Calculator();
        Assert.assertEquals(calc.sum(2, 3), 5, "Method SUM doesn't work with positive numbers.");
    }

    @Test(groups = "sum")
    public void sumNegativeNumbersTest() {
        Calculator calc;
        calc = new Calculator();
        Assert.assertEquals(calc.sum(-2, -3), -5, "Method SUM doesn't work with negative numbers..");
    }

    @Test
    public void sumPositiveAndNegativeNumbersTest() {
        Calculator calc;
        calc = new Calculator();
        Assert.assertEquals(calc.sum(-2, 3), 1, "Method SUM doesn't work with positive and negative numbers..");
    }
}
