package com.amao.demo06_CountDownLatch;

import java.util.concurrent.CountDownLatch;

public class TestDemo01 {
    public static void main(String[] args) {
        //0.创建
        CountDownLatch latch = new CountDownLatch(2);

        //1.创建三个线程
        ThreadOne01 t1 = new ThreadOne01(latch);
        ThreadTwo01 t2 = new ThreadTwo01(latch);
        ThreadThree01 t3 = new ThreadThree01(latch);

        //2.启动线程
        t1.start();
        t2.start();
        t3.start();
    }
}
