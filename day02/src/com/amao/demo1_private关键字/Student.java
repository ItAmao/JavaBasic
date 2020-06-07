package com.amao.demo1_private关键字;

public class Student {
    // 成员变量
    private String name;// 姓名
    int age;// 年龄

    // 成员方法
    public void study() {
        System.out.println("正在努力学习Java...");
    }

    private void doHomeWork() {
        System.out.println("正在努力敲代码...");
    }

    public void show() {
        System.out.println(name);
        doHomeWork();
    }
}
