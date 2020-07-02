package com.amao.demo01_Thread类的介绍;

/**
 * 多线程的创建, 方式一: 继承于Thread类
 * 1.创建一个继承于Thread类的子类
 * 2.重写Thread类的run()方法
 * 3.创建Thread类的子类对象
 * 4.通过此对象去调用Thread中start()
 *
 * @Author : ItAmao
 * @Date : 2020/6/24 21:35
 */
//1.
class MyThread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + i);
            }
        }
    }
}

public class ThreadTest01 {
    public static void main(String[] args) {
        MyThread1 myThread = new MyThread1();

        //通过对象调用start() 作用:1.启动当前线程 2.调用当前线程的run()
        //不调用run()的原因是,只有单线程 没有多线程
        //在启动一个线程,遍历
        //不可以让已经start的线程去执行,会报错,这个时候需要新建一个线程才行
        myThread.start();
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + i +
                        "***************main*********************");
            }
        }
    }
}
