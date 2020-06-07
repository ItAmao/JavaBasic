package com.amao.demo12_代码块;

/**
 * @Author：pengzhilin
 * @Date: 2020/6/5 14:05
 */
public class Person {

    static {
        // 代码: 只会执行一次
        System.out.println("静态代码块...");
    }

    {
        System.out.println("构造代码块1...");
    }

    public Person() {
        System.out.println("Person 构造方法...");
    }

}
