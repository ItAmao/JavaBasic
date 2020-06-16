package com.amao.demo_学生管理系统.superclass;

import com.amao.demo_学生管理系统.utils.Utils;

/**
 * 父类
 */
public abstract class Person {
    private int id;
    private String name;
    private String gender;
    private String birthday;
    private int age;

    public Person() {
    }

    public Person(int id, String name, String gender, String birthday) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public int getAge() {
        return Utils.birthdayToAge(birthday);
    }


    //重写toString，同时作为模板 @Override
    @Override
    public String toString() {
        return id + "\t\t" +
                name + "\t\t" +
                gender + "\t\t" +
                birthday + "\t" +
                this.getAge() + "\t\t" +
                " 我是一名:" + getType() + " 我的工作是:" + getWork();
    }

    public abstract String getType();

    public abstract String getWork();
}
