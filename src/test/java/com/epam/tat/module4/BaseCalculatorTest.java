package com.epam.tat.module4;

import org.testng.annotations.BeforeClass;
import java.util.Date;

public class BaseCalculatorTest {

    protected Calculator calc;

    @BeforeClass
    public void setUp() {
       calc = new Calculator();
    }
}
