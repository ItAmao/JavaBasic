package com.amao.demo01_synchronized同步方法;

public class MyThread02 implements Runnable {
    //票数
    public int ticket = 100;

    @Override
    public void run() {
        synchronized (this) {
            while (true) {
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "卖出了->" + ticket + "张");
                    ticket--;
                }
            }
        }
    }
}
