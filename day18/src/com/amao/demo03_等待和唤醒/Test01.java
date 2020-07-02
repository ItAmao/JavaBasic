package com.amao.demo03_等待和唤醒;

/**
 * @description: 进入无限等待的过程, 因为没有唤醒所以只能一直等待
 * @params:
 * @return:
 * @author: ItAmao
 * @time: 2020/6/23 11:45
 */
public class Test01 {
    public static void main(String[] args) {
        //1.让线程进入无限等待
        Object obj = new Object();
        //线程1
        new Thread(new Runnable() {
            @Override
            public void run() {
                //1.抢到锁
                synchronized (obj) {
                    System.out.println("线程1抢到了,准备进入无线等待----");
                    //调用锁对象的wait方法
                    try {
                        System.out.println("线程1正在等待");
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("线程1继续执行");
                }
            }
        }).start();
    }
}
