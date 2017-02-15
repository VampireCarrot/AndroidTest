package com.lwd.androidtest;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * User: LWD
 * Date: 2017/2/14
 * Email: 13102169005@163.com
 * Description:
 */
public class SubwayCalculatorTest {
    SubwayCalculator subwayCalculator;
    @Before
    public void setUp() throws Exception {
        subwayCalculator = new SubwayCalculator();
    }

    @After
    public void tearDown() throws Exception {

    }
    @Test
    public void subwayPrice() throws Exception {
        //边界条件
        TestCase.assertEquals(0,subwayCalculator.subwayPrice(-1));
        TestCase.assertEquals(0,subwayCalculator.subwayPrice(0));
        //6公里（含）内3元
        TestCase.assertEquals(3,subwayCalculator.subwayPrice(1));
        TestCase.assertEquals(3,subwayCalculator.subwayPrice(5));
        TestCase.assertEquals(3,subwayCalculator.subwayPrice(6));

        //6-12 4元
        TestCase.assertEquals(4,subwayCalculator.subwayPrice(7));
        TestCase.assertEquals(4,subwayCalculator.subwayPrice(11));
        TestCase.assertEquals(4,subwayCalculator.subwayPrice(12));

        //12-22 5元
        TestCase.assertEquals(5,subwayCalculator.subwayPrice(13));
        TestCase.assertEquals(5,subwayCalculator.subwayPrice(15));
        TestCase.assertEquals(5,subwayCalculator.subwayPrice(22));

        //22-32 6元
        TestCase.assertEquals(6,subwayCalculator.subwayPrice(23));
        TestCase.assertEquals(6,subwayCalculator.subwayPrice(28));
        TestCase.assertEquals(6,subwayCalculator.subwayPrice(32));

        //更远距离
        TestCase.assertEquals(7,subwayCalculator.subwayPrice(33));
        TestCase.assertEquals(7,subwayCalculator.subwayPrice(50));


    }

}