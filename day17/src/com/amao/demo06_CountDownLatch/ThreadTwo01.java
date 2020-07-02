package com.amao.demo06_CountDownLatch;

import java.util.Random;
import java.util.concurrent.CountDownLatch;

public class ThreadTwo01 extends Thread {
    public CountDownLatch latch;

    public ThreadTwo01(CountDownLatch latch){
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
        System.out.println("地球引力计算完了...");
        latch.countDown();
    }
}
