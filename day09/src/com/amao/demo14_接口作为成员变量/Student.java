package com.amao.demo14_接口作为成员变量;

public class Student {
    private String name;
    private int age;
    /**
     * 接口作为作为成员变量
     */
    private DoHomework doHomework;

    public Student() {
    }

    public Student(String name, int age, DoHomework doHomework) {
        this.name = name;
        this.age = age;
        this.doHomework = doHomework;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public DoHomework getDoHomework() {
        return doHomework;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDoHomework(DoHomework doHomework) {
        this.doHomework = doHomework;
    }

    @Override
    public String toString() {
        return "学生信息:{" +
                "姓名='" + name + '\'' +
                ", 年龄=" + age +
                '}';
    }
}
