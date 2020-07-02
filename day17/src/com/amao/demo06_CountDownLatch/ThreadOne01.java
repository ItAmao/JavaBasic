package com.amao.demo06_CountDownLatch;

import java.util.Random;
import java.util.concurrent.CountDownLatch;

public class ThreadOne01 extends Thread {
    public CountDownLatch latch;

    public ThreadOne01(CountDownLatch latch){
        this.latch = latch;
    }

    @Override
    public void run() {
        try{
            //模拟计算过程,随机休眠0-5秒
            Thread.sleep(new Random().nextInt(5000));
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("空气阻力计算完了...");
        latch.countDown();
    }
}
