package com.lwd.androidtest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * User: LWD
 * Date: 2017/2/14
 * Email: 1310169005@163.com
 * Description:
 */
public class NoteDaoTest {
    Login login;
    NoteDao noteDao;
    @Before
    public void setUp() throws Exception {
        login = new MockLoginImpl();
        noteDao = new NoteDao();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void saveNote() throws Exception {
        noteDao.saveNote(login.Login("Mr.JeMoS","My_pwd"),"这是我的日记");
    }

}