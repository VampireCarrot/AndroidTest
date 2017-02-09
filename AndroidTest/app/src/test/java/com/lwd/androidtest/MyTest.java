package com.lwd.androidtest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * User: LWD
 * Date: 2017/2/9
 * Email: 13102169005@163.com
 * Description:
 */
public class MyTest {
    @Before
    public void setUp() throws Exception {

    }
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }
    @After
    public void tearDown() throws Exception {

    }

}