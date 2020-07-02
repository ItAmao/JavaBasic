package com.amao.demo08_Semaphore;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class MyThread extends Thread {
    private  Semaphore sm;
    public MyThread(Semaphore sm) {
        this.sm = sm;
    }

    @Override
    public void run() {

        try {
            //获取许可证...
            sm.acquire();

            System.out.println("线程:" + Thread.currentThread().getName() + "开始了....");
            //模拟耗时
            //模拟不同的人以不同的时间到达
            Thread.sleep(new Random().nextInt(5000));
            System.out.println("线程:" + Thread.currentThread().getName() + "结束了....");
            //释放许可证
            sm.release();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
