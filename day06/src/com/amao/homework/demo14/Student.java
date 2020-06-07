package com.amao.homework.demo14;

/*
学生类
 */
public class Student {
    private String name;
    private int age;
    private String gender;

    //无参构造器
    public Student() {
    }

    //有参构造器
    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    //set/get方法

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
