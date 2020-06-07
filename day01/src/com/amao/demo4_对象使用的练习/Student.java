package com.amao.demo4_对象使用的练习;

/**
 * @Author：pengzhilin
 * @Date: 2020/5/31 11:05
 */
public class Student {
    // 成员变量: 姓名, 年龄,...
    String name;// 姓名
    int age;// 年龄

    // 成员方法: 学习, 做作业,...
    /**
     * 学习的功能
     */
    public void study(){
        System.out.println("学生正在学习...");
    }

    /**
     * 做作业的功能
     */
    public void doHomeWork(){
        System.out.println("学生正在做作业...");
    }
}
