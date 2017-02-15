package com.lwd.androidtest;

/**
 * User: LWD
 * Date: 2017/2/15
 * Email: 13102169005@163.com
 * Description:
 */

public class StuController {

    private StudentDao studentDao;

    public Student getStudentInfo(int sid){
        Student student = null;
        if(studentDao != null){
            student = studentDao.getStudentFromDB(sid);
        }
        if(student == null){
            student = fetchStudent(sid);
        }
        return student;
    }

    private Student fetchStudent(int sid) {
        System.out.print("模拟网络获取学生信息");
        Student student = new Student();
        student.id = 12;
        student.name = "网络名";
        return student;
    }

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }
}
