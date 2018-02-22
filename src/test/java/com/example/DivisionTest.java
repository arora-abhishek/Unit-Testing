package com.example;

import org.junit.Test;

public class DivisionTest {
    Division di = new Division();

    @Test(expected = ArithmeticException.class)
    public void TestdivZero(){

        di.div(2,0);
    }
}
