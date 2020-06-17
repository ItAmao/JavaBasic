package com.amao.homework.demo06;

public class Student {
    private String name;
    private String sex;
    private int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        if (!sex.equals("男") && !sex.equals("女")) {
            throw new SexException("性别异常");
        }
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 15 || age > 50) {
            throw new AgeException("年龄异常");
        }
        this.age = age;
    }
}
