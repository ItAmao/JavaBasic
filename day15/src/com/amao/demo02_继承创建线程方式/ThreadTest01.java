package com.amao.demo02_继承创建线程方式;

/**
 * 创建多线程的方式二: 实现Runnable接口
 * 1.创建一个实现Runnable接口的类
 * 2.实现类去实现Runnable中的抽象方法run()
 * 3.创建实现类的对象
 * 4.将此对象作为参数传递到Thread类中,创建Thread类的对象
 * 5.通过Thread类的对象调用start()
 *
 * @Author : ItAmao
 * @Date : 2020/6/25 09:09
 */
//1.创建一个实现Runnable接口的类
class MThread implements Runnable {

    //2.实现类去实现Runnable中的抽象方法run()
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ": 100以内的偶数为:" + i);
            }
        }
    }

}


public class ThreadTest01 {
    public static void main(String[] args) {
        //3.创建实现类的对象
        MThread mThread = new MThread();
        //4.将此对象作为参数传递到Thread类中,创建Thread类的对象
        Thread t1 = new Thread(mThread);
        //5.通过Thread类的对象调用start():
        t1.start();//启动线程 调用当前线程的run()
        // 主要原因当前线程的run里边调用了Runnable类型的target的run(),target就是mThread

        //在启动一个线程,遍历100以内的偶数
        Thread t2 = new Thread(mThread);
        t2.start();


    }

}
