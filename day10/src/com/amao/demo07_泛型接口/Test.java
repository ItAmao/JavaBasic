package com.amao.demo07_泛型接口;

public class Test {
    public static void main(String[] args) {
        Student<String> stu = new Student<>();
        stu.<String>eat("阿毛");
        stu.<String>sleep("阿毛");
        System.out.println("------------");
        Person<String> person = new Person<String>() {
            @Override
            public void eat(String s) {
                System.out.println(s + "吃东西");
            }
            @Override
            public void sleep(String s) {
                System.out.println(s + "睡觉");
            }
        };
        person.<String>eat("阿毛");
        person.<String>sleep("阿毛");
    }
}
