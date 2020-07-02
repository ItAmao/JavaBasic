package com.amao.demo05_synchronized卖票问题;

public class MyRunnable1 implements Runnable {
    public int ticket = 100;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "卖出了第" + ticket + "张");
                    ticket--;
                }
            }
        }
    }
}
