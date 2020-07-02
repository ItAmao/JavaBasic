package com.amao.demo06_CountDownLatch;

import java.util.concurrent.CountDownLatch;

public class ThreadThree01 extends Thread {
    public CountDownLatch latch;

    public ThreadThree01(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        //让当前线程等待
        try {
            latch.await();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("开始发射火箭...");
        for (int i = 0; i < 100; i++) {
            System.out.println("....");
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
