package com.amao.demo04_CopyOnWriteArraySet;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        //1.创建线程
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.start();
        t2.start();

        Thread.sleep(2000);
        System.out.println(MyThread.hs.size());
    }
}
