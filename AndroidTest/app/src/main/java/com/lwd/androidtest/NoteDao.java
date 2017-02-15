package com.lwd.androidtest;

/**
 * User: LWD
 * Date: 2017/2/14
 * Email: 13102169005@163.com
 * Description:
 */

public class NoteDao {
    public void saveNote(User user ,String note){
        if(user.Id !=null && !user.Id.equals("")){
            System.out.print("Save，Ok！");
        }
    }
}
