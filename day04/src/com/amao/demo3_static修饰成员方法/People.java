package com.amao.demo3_static修饰成员方法;

/**
 * @Author：pengzhilin
 * @Date: 2020/6/4 10:09
 */
public class People {
    String name;
    static String country;

    // 非静态成员方法
    public void method1(){
        System.out.println(this.name);
        System.out.println("非静态方法 method1");
    }

    // 静态成员方法
    public static void method2(){
        // 静态方法中不能出现this关键字
        // System.out.println(this.name);// 编译报错
        // 静态方法中不能直接访问非静态成员变量或者非静态成员方法
        //System.out.println(name);// 编译报错
        //method1();// 编译报错

        // 静态方法中只能直接访问静态成员变量或者静态成员方法
        System.out.println(country);
        method3();

        System.out.println("People 静态方法 method2");
    }

    public static void method3(){}

    public void method4(){
        // 直接访问非静态成员变量
        System.out.println(name);
        // 直接访问静态成员变量
        System.out.println(country);
        // 直接访问非静态成员方法
        method1();
        // 直接访问静态成员方法
        method3();
    }
}
