package com.lwd.androidtest;

/**
 * User: LWD
 * Date: 2017/2/14
 * Email: 13102169005@163.com
 * Description:
 */

public class MockLoginImpl implements Login {
    @Override
    public User Login(String username, String password) {
        return new User("123",username);
    }
}
