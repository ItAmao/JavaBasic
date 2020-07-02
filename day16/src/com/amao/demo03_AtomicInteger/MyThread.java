package com.amao.demo03_AtomicInteger;

import java.util.concurrent.atomic.AtomicInteger;

public class MyThread extends Thread {
    public static AtomicInteger a = new AtomicInteger(0);

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            a.getAndIncrement();//相当于a++
        }
        System.out.println("修改完毕");
    }
}
