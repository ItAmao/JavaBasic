package com.amao.demo06_序列流;

import java.io.Serializable;

/**
 *  学生类
 *
 *  Serializable这个接口我们称为标记型接口,这个接口没有任何抽象方法
 *
 *  @Author : ItAmao
 *  @Date   : 2020/6/30 14:37
 */
public class Student implements Serializable {
    //序列号自己写了就不会在分配了

    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
