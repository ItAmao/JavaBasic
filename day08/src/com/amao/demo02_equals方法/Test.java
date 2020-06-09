package com.amao.demo02_equals方法;

public class Test {
    public static void main(String[] args) {
//        Dog dog1 = new Dog("旺财", 18);
//        Dog dog2 = new Dog("旺财", 18);
//        boolean a = dog1.equals(dog2);
//        System.out.println(a);//false
        System.out.println("-----------------------------------");
        Dog dog3 = new Dog("旺财", 18);
        Dog dog4 = new Dog("旺财", 18);
        dog3 = dog4;
        boolean b = dog3.equals(dog4);
        System.out.println(b);//true
        System.out.println("----------重写equals方法后比较的是内容-------------------");
        Dog dog5 = new Dog("旺财", 18);
        Dog dog6 = new Dog("旺财", 18);
        boolean c = dog5.equals(dog6);
        System.out.println(c);//true


    }
}
