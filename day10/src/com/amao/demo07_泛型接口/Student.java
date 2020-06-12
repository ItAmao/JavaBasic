package com.amao.demo07_泛型接口;

public class Student<E> implements Person<String> {
    @Override
    public void eat(String name) {
        System.out.println(name + "吃东西");
    }

    @Override
    public void sleep(String name) {
        System.out.println(name + "睡觉");
    }
}
