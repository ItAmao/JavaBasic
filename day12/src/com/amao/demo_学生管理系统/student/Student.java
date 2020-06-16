package com.amao.demo_学生管理系统.student;

import com.amao.demo_学生管理系统.superclass.Person;

public class Student extends Person {
    public Student() {
    }

    public Student(int id, String name, String gender, String birthday) {
        super(id, name, gender, birthday);
    }

    @Override
    public String getType() {
        return "学习";
    }

    @Override
    public String getWork() {
        return "学生";
    }

}
