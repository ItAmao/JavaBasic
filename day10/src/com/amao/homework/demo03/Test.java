package com.amao.homework.demo03;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<Person> list2 = new ArrayList<>();
        ArrayList<Student> list3 = new ArrayList<>();
        ArrayList<JavaStudent> list4 = new ArrayList<>();
        ArrayList<UIStudent> list5 = new ArrayList<>();
        ArrayList<Teacher> list6 = new ArrayList<>();
        ArrayList<JavaTeacher> list7 = new ArrayList<>();
        ArrayList<UITeacher> list8 = new ArrayList<>();
        //请测试哪些集合可以调用print1()方法
        print1(list1);
        print1(list2);
        print1(list3);
        print1(list4);
        print1(list5);
        print1(list6);
        print1(list7);
        print1(list8);
        //请测试哪些集合可以调用print2()方法
        //泛型上限:能接受Person类和它的子类
        //print2(list1); 编译报错 list1为String类型
        print2(list2);
        print2(list3);
        print2(list4);
        print2(list5);
        print2(list6);
        print2(list7);
        print2(list8);
        //请测试哪些集合可以调用print3()方法
        //泛型上限:能接受Student和它的子类
        //print3(list1); //编译报错 String类型不行
        //print3(list2); //Person是Student的父类
        print3(list3);
        print3(list4);
        print3(list5);
        // print3(list6);  678 兄弟辈 不行
        //print3(list7);
        //print3(list8);
        //请测试哪些集合可以调用print4()方法
        //泛型上限:Java学员 就是JavaStudent这个类和它的父类
        //print4(list1);
        print4(list2);
        print4(list3);
        print4(list4);
        //print4(list5);
        //print4(list6);
        //print4(list7);
        //print4(list8);
    }

    /**
     * 要求：参数可以接收任何泛型的ArrayList参数
     */
    public static void print1(ArrayList<?> list) {
    }

    /**
     * 要求：参数可以接收任何Person及其子类泛型的ArrayList参数
     * 泛型上限
     */
    public static void print2(ArrayList<? extends Person> list) {
    }

    /**
     * 要求：参数可以接收任何Student及其子类泛型的ArrayList参数
     * 泛型上限
     */
    public static void print3(ArrayList<? extends Student> list) {

    }

    /**
     * 要求：参数可以接收任何Java学员，及其父类泛型的ArrayList参数
     * 泛型下限
     */
    public static void print4(ArrayList<? super JavaStudent> list) {

    }

}
