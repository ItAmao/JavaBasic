package com.amao.demo10_抽象类的概述和定义;

/**
 * @Author：pengzhilin
 * @Date: 2020/6/2 14:09
 */
public abstract class Animal {// 抽象类
    private int age;
    private String name;

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Animal() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println(name+","+age);
    }
    // 抽象方法
    public abstract void method1();
    public abstract void method2(int num);
    public abstract int method3(int num);
}
