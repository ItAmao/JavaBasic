package com.amao.demo11_抽象类的特点;

/**
 * @Author：pengzhilin
 * @Date: 2020/6/2 14:20
 */
public abstract class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    // 抽象方法
    public abstract void eat();
    public abstract void drink();
}
