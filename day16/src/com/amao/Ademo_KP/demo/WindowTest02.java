package com.amao.Ademo_KP.demo;

/**
 *  使用同步代码块解决继承Thread类的方式的线程安全问题
 *
 *
 *
 *  @Author : ItAmao
 *  @Date   : 2020/6/25 11:04
 *
 */
class window2 extends Thread {
    private static int ticket = 100;

    //Object obj = new Object();
    private static Object obj = new Object(); //继承的话:需要保证锁唯一

    @Override
    public void run() {
        while (true) {
            //synchronized (obj) {
            synchronized (window2.class) {
                //synchronized (this) { 此时的this代表着3个对象
                if (ticket > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(getName() + ": 还剩:" + ticket + "张票");
                    ticket--;
                } else {
                    break;
                }
            }
        }
    }
}


public class WindowTest02 {
    public static void main(String[] args) {
        window2 w1 = new window2();
        window2 w2 = new window2();
        window2 w3 = new window2();


        w1.setName("窗口1");
        w2.setName("窗口2");
        w3.setName("窗口3");

        w1.start();
        w2.start();
        w3.start();
    }
}
