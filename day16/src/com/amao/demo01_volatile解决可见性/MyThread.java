package com.amao.demo01_volatile解决可见性;

public class MyThread extends Thread {
    public volatile static int a = 0;

    @Override
    public void run() {
        System.out.println("线程启动,休息2秒...");
        try {
            Thread.sleep(1000 * 2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("把a的值改为1");
        a = 1;
        System.out.println("线程结束");
    }
}
