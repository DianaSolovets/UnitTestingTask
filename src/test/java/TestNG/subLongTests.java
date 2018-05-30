package TestNG;

import com.epam.tat.module4.BaseCalculatorTest;
import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class subLongTests extends BaseCalculatorTest {

    @Test
    @Parameters ({"arg1", "arg2", "expect"})
    public void subPositiveNumbersTest(long arg1, long arg2, long expect) {
        long result = calc.sub(arg1, arg2);
        Assert.assertEquals(result, expect, "Method SUB doesn't work with positive numbers.");
    }

    @Test(groups = "sub")
    public void subNegativeNumbersTest() {
        Assert.assertEquals(calc.sub(-2, -3), 1, "Method SUB doesn't work with negative numbers.");
    }

    @Test(groups = "sub")
    public void subPositiveAndNegativeNumbersTest() {
        Assert.assertEquals(calc.sub(-2, 3), -5, "Method SUB doesn't work with positive and negative numbers.");
    }

}
