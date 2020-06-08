package com.amao.demo_homework.Test02;
/*
    教师类
 */
public class Teacher {
    private String name;//姓名
    private String specialty;//专业

    public Teacher() {
    }

    public Teacher(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getName() {
        return name;
    }

    public String getSpecialty() {
        return specialty;
    }
}
