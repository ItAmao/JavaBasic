package com.amao.demo13_抽象类作为成员变量;

public class Student {
    private String name;
    private int age;
    private String gender;
    /**
     * 学生要去上课
     */
    private Course course;

    public Student(String name, int age, String gender, Course course) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.course = course;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public Course getCourse() {
        return course;
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

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "学生信息{" +
                "姓名='" + name + '\'' +
                ", 年龄=" + age +
                ", 性别='" + gender + '\'' +
                ", 课程=" + course.toString() +
                '}';
    }
}
