package com.amao.demo02_反射;

/**
 *  @Author : ItAmao
 *  @Date   : 2020/7/4 16:37
 */
public abstract class Person {
    private String name;
    public int age;

    public Person() {
    }

    public Person(String name, int age) {

        this.name = name;
        this.age = age;
    }

    private Person(String name) {
        this.name = name;
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
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void show(String s) {
        System.out.println("你好,我是一个人" + s);
    }

    public void show1() {
        System.out.println("你好,我是一个人");
    }

    public String show2() {
        System.out.println("你好,我是一个人");
        return "人";
    }

    private String showNation(String nation) {
        System.out.println("我的国籍是:" + nation);
        return nation;
    }

    public abstract void work();


    public abstract void eat();


}
