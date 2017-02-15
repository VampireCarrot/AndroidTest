package com.lwd.androidtest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;

import static org.mockito.Mockito.*;


/**
 * User: LWD
 * Date: 2017/2/14
 * Email: 13102169005@163.com
 * Description:
 */

public class MockTest {
    LinkedList mockedlist ;
    @Before
    public void setUp() throws Exception {
        mockedlist = mock(LinkedList.class);
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void mockTest(){
        //打桩
        when(mockedlist.get(anyInt())).thenReturn("element");

        System.out.print(mockedlist.get(9));

        verify(mockedlist).get(anyInt());

        mockedlist.add("1");
        mockedlist.add("2");
        mockedlist.add("2");
        mockedlist.add("3");
        mockedlist.add("3");
        mockedlist.add("3");

        verify(mockedlist).add("1");

        verify(mockedlist,times(2)).add("2");

        verify(mockedlist,times(3)).add("3");

        verify(mockedlist,never()).add("4");




    }
}
