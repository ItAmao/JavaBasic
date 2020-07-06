package com.amao.Ademo_KP.java2;

/**
 *  @Author : ItAmao
 *  @Date   : 2020/7/5 17:30
 */
@MyAnnotation(value = "Hi")
public class Person extends Creature<String> implements Comparable<String>, MyInterface {

    private String name;
    int age;
    public int id;

    public Person() {
    }

    @MyAnnotation(value = "abc")
    private Person(String name) {
        this.name = name;
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @MyAnnotation
    public String show(String nation) {
        System.out.println("我的国籍是:" + nation);
        return nation;
    }

    public String display(String interests, int age) {
        return interests + age;
    }

    @Override
    public void info() {
        System.out.println("我是一个人");
    }

    @Override
    public int compareTo(String o) {
        return 0;
    }


}
