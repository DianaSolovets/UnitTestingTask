package com.epam.tat.module4;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class multLongTests {

    @Test
    public void multPositiveNumbersTest() {
        Calculator calc;
        calc = new Calculator();
        assertEquals( 10, calc.mult(2,5));
    }

    @Test
    public void multNegativeNumbersTest() {
        Calculator calc;
        calc = new Calculator();
        assertEquals( 10, calc.mult(-2,-5));
    }

    @Test
    public void multPositiveAndNegativeNumbersTest() {
        Calculator calc;
        calc = new Calculator();
        assertEquals( -10, calc.mult(2,-5));
    }
}
