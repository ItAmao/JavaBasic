package com.amao.demo05_ConcurrentHashMap;

public class TestDemo {
    public static void main(String[] args) throws InterruptedException {
        //1.创建线程
        MyThread mt = new MyThread();
        mt.start();

        for (int i = 10000; i < 20000; i++) {
            MyThread.map.put(i, i);//10000 10000 ... 19999 19999
        }
        System.out.println("1万次OK");
        Thread.sleep(1000);
        System.out.println(MyThread.map.size());
    }
}
