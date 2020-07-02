package com.amao.demo01_Thread类的介绍;

/**
 * 测试Thread类中常用方法
 * 1.start() 启动当前线程  调用当前线程的run()
 * 2.run() 重写Thread类中的此方法,将创建的线程执行的操作声明在此方法中
 * 3.currentThread():静态方法,返回当前代码的线程
 * 4.getName(); 获取当前线程的名字
 * 5.setName():设置当前线程的名字
 * 6.yield():线程让步 释放当前CPU的执行权
 * 7.join():在线程A中调用线程B的join(),此时线程A进入阻塞状态,直到线程B执行完毕,线程A才能结束阻塞状态,
 * 8.stop();已过时,当执行此方法时强制结束当前线程
 * 9.sleep(毫秒):睡眠,让当前线程睡眠指定的millitime毫秒,在指定的millitime毫秒时间内,当前线程是阻塞状态
 * 10.isAlive();判断当前线程是否还存活
 * <p>
 * 线程的优先级:
 * 1.
 * MAX_PRIORITY:10;    最大的优先级是10
 * MIN_PRIORITY:1;     最小的优先级是1
 * NORM_PRIORITY:5;    默认的优先级是5
 * <p>
 * 2.如何获取和设置当前线程的优先级    高优先级线程要抢占低优先级线程CPU的执行权,但是从概率来讲,高优先级的线程高概率的情况下被执行
 * getPriority()  获取
 * setPriority(int newPriority) 设置
 *
 * @Author : ItAmao
 * @Date : 2020/6/24 22:14
 */
class MyThread02 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
//                try {
//                    sleep(10);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                System.out.println(getName() + ":" + getPriority() + ":" + i);
            }
//            if (i % 20 == 0) {
//                //前边省略了this,表示当前类的对象 也可以用Thread.currentThread()
//                yield();
//            }
        }
    }

    public MyThread02(String name) {
        super(name);
    }
}

public class ThreadMethodTest01 {
    public static void main(String[] args) {

        MyThread02 m1 = new MyThread02("Thread");
        //m1.setName("线程一");

        //设置分线程的优先级
        m1.setPriority(Thread.MAX_PRIORITY);
        m1.start();

        //给主线程命名
        Thread.currentThread().setName("主线程");
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + Thread.currentThread().getPriority() + ":" + i);
            }

            if (i == 20) {
                try {
                    m1.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
        //System.out.println(m1.isAlive());
    }
}
