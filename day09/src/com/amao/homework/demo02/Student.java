package com.amao.homework.demo02;

/**
 * @description: *  有以下学员信息：
 * * * ​    请定义学员类，属性：姓名、性别、年龄、分数
 * * ​
 * @params:
 * @return:
 * @author: ItAmao
 * @time: 2020/6/10 17:20
 */
public class Student {
    private String name;
    private String gender;
    private int age;
    private double fraction;

    public Student() {
    }

    public Student(String name, String gender, int age, double fraction) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.fraction = fraction;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public double getFraction() {
        return fraction;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFraction(double fraction) {
        this.fraction = fraction;
    }
}
