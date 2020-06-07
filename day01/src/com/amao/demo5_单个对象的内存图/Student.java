package com.amao.demo5_单个对象的内存图;


public class Student {
    // 属性
    String name;// 姓名
    int age;// 年龄

    // 行为

    /**
     * 学习的功能
     */
    public void study() {
        System.out.println("学生正在学习...");
    }

    /**
     * 做作业的功能
     */
    public void doHomeWork() {
        System.out.println("学生正在做作业...");
    }
}
