package com.amao.demo_学生管理系统.teacher;

import com.amao.demo_学生管理系统.superclass.Person;

public class Teacher extends Person {
    public Teacher() {
    }

    public Teacher(int id, String name, String gender, String birthday) {
        super(id, name, gender, birthday);
    }

    @Override
    public String getType() {
        return "教书";
    }

    @Override
    public String getWork() {
        return "老师";
    }
}
