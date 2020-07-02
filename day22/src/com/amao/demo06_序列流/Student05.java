package com.amao.demo06_序列流;

import java.io.Serializable;

/**
 *  测试序列化样例学生对象
 *  @Author : ItAmao
 *  @Date   : 2020/6/30 18:20
 */
public class Student05 implements Serializable {
    private String name; //姓名
    private int age;//年龄

    public Student05() {
    }

    public Student05(String name, int age) {
        this.name = name;
        this.age = age;
    }

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

    @Override
    public String toString() {
        return "学生信息{" +
                "姓名='" + name + '\'' +
                ", 年龄=" + age +
                '}';
    }
}
