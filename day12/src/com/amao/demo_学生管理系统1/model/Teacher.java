package com.amao.demo_学生管理系统1.model;

public class Teacher extends Person {
    public Teacher() {
    }

    public Teacher(int id, String name, String gender, String birthday) {
        super(id, name, gender, birthday);
    }

    @Override
    public String getType() {
        return "老师";
    }

    @Override
    public String getWork() {
        return "教书";
    }
}
