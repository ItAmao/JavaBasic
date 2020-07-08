package com.amao.demo02_反射;

/**
 *  @Author : ItAmao
 *  @Date   : 2020/7/5 10:48
 */
public class Coder extends Person {
    @Override
    public void work() {
        System.out.println("阿毛在写代码");
    }

    @Override
    public void eat() {
        System.out.println("阿毛在吃饭");
    }

    public Coder() {
    }

    public Coder(String name, int age) {
        super(name, age);
    }
}
