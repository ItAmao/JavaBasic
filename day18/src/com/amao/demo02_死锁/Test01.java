package com.amao.demo02_死锁;

public class Test01 {
    public static void main(String[] args) {
        //1.两个锁
        Object obj1 = new Object();
        Object obj2 = new Object();

        //2.两个线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                //3.需要嵌套锁对象
                synchronized (obj1) {
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("线程A获取锁对象1");
                    synchronized (obj2) {
                        System.out.println("线程A执行了");
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                //3.需要反向嵌套锁对象
                synchronized (obj2) {
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("线程A获取锁对象2");
                    synchronized (obj1) {
                        System.out.println("线程B执行了");
                    }
                }
            }
        }).start();
    }

}
