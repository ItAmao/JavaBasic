package com.amao.demo11_抽象类的特点;

/**
 * @Author：pengzhilin
 * @Date: 2020/6/2 14:25
 */
public class Teacher extends Person {
    @Override
    public void eat() {
        System.out.println("老师吃小炒...");
    }

    @Override
    public void drink() {
        System.out.println("学生喝矿泉水");
    }
}
