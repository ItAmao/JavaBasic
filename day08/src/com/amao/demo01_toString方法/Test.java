package com.amao.demo01_toString方法;

public class Test {
    public static void main(String[] args) {
        /*

         */
//        Dog dog1 = new Dog();
//        String str1 = dog1.toString();
//        System.out.println(str1); //com.amao.demo01_toString方法.Dog@61bbe9ba
//
//        Dog dog2 = new Dog();
//        String str2 = dog2.toString();
//        System.out.println(str2); //com.amao.demo01_toString方法.Dog@610455d6

        System.out.println("----------重写toString方法后----------");

        Dog dog3 = new Dog("旺财", 10);
        String str3 = dog3.toString();
        System.out.println(str3); //null...0

        Dog dog4 = new Dog();
        String str4 = dog4.toString();
        System.out.println(str4); //null...0

        System.out.println("----------不调用toString方法----------");
        Dog dog5 = new Dog("来福", 10);
        Dog dog6 = new Dog("来福", 17);
        System.out.println(dog5);//Dog{name='来福', age=10}
        System.out.println(dog6);//Dog{name='来福', age=17}
    }
}
