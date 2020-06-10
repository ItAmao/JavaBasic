package com.amao.demo09_普通类作为方法参数和返回值;

/**
 * @description: 学生类
 * @params:
 * @return:
 * @author: ItAmao
 * @time: 2020/6/10 15:45
 */
public class Student {
    /**
     * 学生姓名
     */
    private String name;
    /**
     * 学生年龄
     */
    private int age;

    /**
     * 无参构造
     */
    public Student() {
    }

    /**
     * 有参构造器
     */
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * set/get方法
     */
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
