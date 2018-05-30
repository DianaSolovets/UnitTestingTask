package com.epam.tat.module4;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public  class divDoubleTests {

    @Test
    public void divPositiveNumbersTest() {
        Calculator calc;
        calc = new Calculator();
        assertEquals(1.7222222222222223, calc.div(6.2d, 3.6d), 0);
    }

    @Test
    public void divNegativeNumbersTest() {
        Calculator calc;
        calc = new Calculator();
        assertEquals(1.7222222222222223, calc.div(-6.2d, -3.6d), 0);
    }

    @Test
    public void divPositiveAndNegativeNumbersTest() {
        Calculator calc;
        calc = new Calculator();
        assertEquals(-1.7222222222222223, calc.div(6.2d, -3.6d), 0);
    }


    @Test(expected = NumberFormatException.class)
    public void divNullTest2() {
        Calculator calc;
        calc = new Calculator();
        calc.div(6.3, 0);
    }
}
