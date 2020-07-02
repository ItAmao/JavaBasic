package com.amao.homework.demo02;

/**
 * @description: 请使用实现Runnable接口的方式定义一个类，在run()方法中使用循环变量i遍历1--1000所有的数字。
 * 定义main()方法，启动这个线程，然后再使用循环变量k遍历1--1000所有的数字。
 * 请观察控制台打印，i和k交叉打印的情况。
 * @params:
 * @return:
 * @author: ItAmao
 * @time: 2020/6/18 19:37
 */
public class Test {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    System.out.println(Thread.currentThread().getName() + "-->" + i);
                }
            }
        }).start();
        for (int i = 1; i <= 1000; i++) {
            System.out.println("main-->" + i);
        }

    }
}
