package com.amao.demo5_构造方法的概述和定义;

public class Student {

    String name;
    int age;

    // 无参构造方法
    public Student() {
        System.out.println("空参构造方法");
    }

    // 有参构造方法 满参构造
    public Student(String name, int age) {
        // 给属性赋值
        this.name = name;
        this.age = age;
    }

    public Student(String name) {
        // 给属性赋值
        this.name = name;
    }

    public Student(int age) {
        // 给属性赋值
        this.age = age;
    }
}
