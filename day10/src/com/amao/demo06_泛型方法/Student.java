package com.amao.demo06_泛型方法;

public class Student {
    public <E> void doHomework(E name) {
        System.out.println(name + "做作业");
    }
}
