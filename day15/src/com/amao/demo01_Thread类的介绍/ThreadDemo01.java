package com.amao.demo01_Thread类的介绍;

/**
 * 练习: 创建两个分线程,其中一个线程遍历100以内的偶数,另一个线程遍历100以内的奇数
 *
 * @Author : ItAmao
 * @Date : 2020/6/24 21:57
 */

class Thread02 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println("100以内的奇数为:" + i);
            }
        }
    }
}

class Thread01 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println("100以内的偶数为:" + i);
            }
        }
    }
}

public class ThreadDemo01 {
    public static void main(String[] args) {
        //1.创建线程对象
        Thread01 thread01 = new Thread01();
        Thread02 thread02 = new Thread02();

        //2.调用start方法启动线程
        thread02.run();
        thread01.start();

//        //创建Thread类的匿名子类
//        new Thread() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 100; i++) {
//                    System.out.println("匿名子类" + i);
//                }
//            }
//        }.start();
    }
}
