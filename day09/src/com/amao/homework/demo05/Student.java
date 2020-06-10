package com.amao.homework.demo05;

public class Student {
    private String name;
    private int age;
    private double height;
    private boolean isMarry;
    private char gender;

    public Student() {
    }

    public Student(String name, int age, double height, boolean isMarry, char gender) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.isMarry = isMarry;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public boolean isMarry() {
        return isMarry;
    }

    public char getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setMarry(boolean marry) {
        isMarry = marry;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "学生信息:{" +
                "姓名='" + name + '\'' +
                ", 年龄=" + age +
                ", 身高=" + height +
                ", 是否结婚=" + isMarry +
                ", 性别=" + gender +
                '}';
    }
}
