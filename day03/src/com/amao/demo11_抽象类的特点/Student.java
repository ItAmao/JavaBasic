package com.amao.demo11_抽象类的特点;

/**
 * @Author：pengzhilin
 * @Date: 2020/6/2 14:23
 */
public class Student extends Person {
    // alt+insert
    public Student(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("学生吃快餐...");
    }

    @Override
    public void drink() {
        System.out.println("学生喝冰红茶");
    }
}
