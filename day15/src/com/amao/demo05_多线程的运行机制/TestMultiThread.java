package com.amao.demo05_多线程的运行机制;

public class TestMultiThread {
    public static void main(String[] args) {
        //1.创建多个线程
        Thread t1 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i <= 100; i++) {
                    System.out.println("线程t1------>" + i);
                }
            }
        };

        Thread t2 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i <= 100; i++) {
                    System.out.println("线程t2------>" + i);
                }
            }
        };

        //2.开启线程
        t1.start();
        t2.start();
    }
}
