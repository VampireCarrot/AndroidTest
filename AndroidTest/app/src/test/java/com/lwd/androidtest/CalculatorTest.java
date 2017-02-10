package com.lwd.androidtest;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * User: LWD
 * Date: 2017/2/10
 * Email: 13102169005@163.com
 * Description:
 */
public class CalculatorTest {

    double arg0;
    double arg1;
    Calculator calculator;
    @Before
    public void setUp() throws Exception {
        arg0 = 8d;
        arg1 = 2d;
        calculator = new Calculator();
    }
    @Test
    public void summation() throws Exception {
        TestCase.assertEquals(10d,calculator.summation(arg0,arg1));
    }

    @Test
    public void subtraction() throws Exception {
        TestCase.assertEquals(6d,calculator.subtraction(arg0,arg1));
    }

    @Test
    public void multiplication() throws Exception {
        TestCase.assertEquals(16d,calculator.multiplication(arg0,arg1));
    }

    @Test
    public void division() throws Exception {
        TestCase.assertEquals(4d,calculator.division(arg0,arg1));
    }

    @After
    public void tearDown() throws Exception {

    }

}