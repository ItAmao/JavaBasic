package com.amao.demo07_JDK8的其他新特性;

import org.junit.Test;

/**
 *  @Author : ItAmao
 *  @Date   : 2020/7/8 20:24
 */
public class Test01 {
    @Test
    public void test1() {
        //1.匿名内部类
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("匿名内部类执行了");
            }
        }).start();

        //2.Lambda
        new Thread(() -> System.out.println("Lambda执行了")).start();

        //3.方法引用
        //new Thread()
    }
}
