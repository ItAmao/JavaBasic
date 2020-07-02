package com.amao.demo03_AtomicInteger;

public class AutomicDemo {
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        t1.start();


        MyThread t2 = new MyThread();
        t2.start();

        Thread.sleep(2000);
        System.out.println(MyThread.a);//2000

    }
}
