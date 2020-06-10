package com.amao.demo08_总结基本类型的使用;

/**
 * @author ItAmao
 */
class Student {
    /**
     * 基本数据类型作为成员变量
     */
    private String name;
    private int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Test {
    public static void main(String[] args) {
        //调用show方法,并传参
        int a = 10;
        show(a);
        System.out.println("---------");
        System.out.println(getNum());

    }

    /**
     * 基本数据类型作为方法返回值
     */
    public static int getNum() {
        int b = 20;
        return b;
    }

    /**
     * 基本数据类型作为方法参数
     */
    public static void show(int num) {
        System.out.println("这个数是:" + num);
    }
}
