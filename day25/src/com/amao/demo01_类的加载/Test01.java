package com.amao.demo01_类的加载;

import org.junit.Test;

/**
 * 类加载器:
 *      类加载器就是把类加载到内存的工具
 *          1.启动类加载器
 *          2.扩展类加载器
 *          3.应用类加载器
 *          4.idea获取类加载器
 *
 *
 *
 *  @Author : ItAmao
 *  @Date   : 2020/7/5 08:50
 */
public class Test01 {
    static String name;

    //静态代码块
    {
        System.out.println("静态代码块");
    }

    public static void eat() {
        System.out.println("吃饭");
    }

    /**
     * 类的加载时机
     */
    @Test
    public void test1() {
//        //创建类的实例
//        Test01 test01 = new Test01();静态代码块

//        //调用类的静态变量,或者为静态变量赋值
//        System.out.println(Test01.name);静态代码块 null

//        //调用类的静态方法,
//        Test01.eat();吃饭

        //使用反射方式


        //初始化某个类的子类

        //直接运行java.exe命令来运行某个主类
    }

    @Test
    public void test2() {
        //获取类加载器
        ClassLoader c1 = String.class.getClassLoader();
        System.out.println(c1);

        //
    }
}
