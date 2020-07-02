package com.amao.demo07_CyclicBarrier;

import java.util.Random;
import java.util.concurrent.CyclicBarrier;

public class PersonThread extends Thread {
    private CyclicBarrier cb;
    public PersonThread(String name, CyclicBarrier cb) {
        super(name);
        this.cb = cb;
    }

    @Override
    public void run() {
        try {
            //模拟不同的人以不同的时间到达
            Thread.sleep(new Random().nextInt(10000));
            System.out.println(getName()+"到了...");
            //调用CyclicBarrier的await方法
            cb.await();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
