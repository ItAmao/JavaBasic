package com.amao.demo02_Lock锁;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread01 implements Runnable {
    //票数
    public int ticket = 100;
    //创建一个lock锁对象
    public Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            //加锁
            lock.lock();
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + "卖出第" + ticket + "张票");
                ticket--;
            }
            //解锁
            lock.unlock();
        }
    }


}
