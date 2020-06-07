package com.amao.demo4_static修饰代码块;

/**
 * @Author：pengzhilin
 * @Date: 2020/6/4 10:26
 */
public class Person {

    static {
        System.out.println("Person 静态代码块");
    }

    public Person() {
        System.out.println("Person 构造方法");
    }


}
