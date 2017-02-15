package com.lwd.androidtest;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

/**
 * User: LWD
 * Date: 2017/2/15
 * Email: 13102169005@163.com
 * Description:
 */
public class StuControllerTest {
    StuController stuController;
    StudentDao studentDao;
    @Before
    public void setUp() throws Exception {
        stuController = new StuController();
        studentDao = mock(StudentDao.class);
        stuController.setStudentDao(studentDao);
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void getStudentInfo() throws Exception {
        Student returnStudent = new Student();
        returnStudent.id = 123;
        returnStudent.name = "Mock-user";

        when(studentDao.getStudentFromDB(anyInt())).thenReturn(returnStudent);

        Student student = stuController.getStudentInfo(123);
        TestCase.assertEquals(123,student.id);
        TestCase.assertEquals("Mock-user",student.name);

        System.out.print(studentDao.getStudentFromDB(1));

    }

    @Test
    public void testGetStudentInfoFromSever(){
        when(studentDao.getStudentFromDB(anyInt())).thenReturn(null);
        Student student = stuController.getStudentInfo(456);
        TestCase.assertEquals(12,student.id);
        TestCase.assertEquals("网络名",student.name);

    }

}