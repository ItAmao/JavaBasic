package com.amao.demo03_等待和唤醒;

/**
 * @description: 唤醒
 * @params:
 * @return:
 * @author: ItAmao
 * @time: 2020/6/23 11:45
 */
public class Test02 {
    public static void main(String[] args) {
        //1.让线程进入无限等待
        Object obj = new Object();
        new Thread(new Runnable() {
            @Override
            public void run() {
                //1.抢到锁
                synchronized (obj) {
                    System.out.println("线程1抢到了");
                    //调用锁对象的wait方法
                    try {
                        System.out.println("线程1等待了");
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("线程1继续执行");
                }
            }
        }).start();


        new Thread(new Runnable() {
            @Override
            public void run() {
                //1.持有锁对象,并且必须也是obj对象
                synchronized (obj) {
                    System.out.println("线程2抢到了,唤醒线程1");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //2.调用notify方法
                    obj.notify();
                }

            }
        }).start();


    }
}
