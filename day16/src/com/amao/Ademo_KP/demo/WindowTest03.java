package com.amao.Ademo_KP.demo;

/**
 *  @Author : ItAmao
 *  @Date   : 2020/6/25 11:21
 */
class window3 implements Runnable {
    private int ticket = 100;

    @Override
    public void run() {
        while (true) {
            show();
        }
    }

    private synchronized void show() { //同步监视器:this
        if (ticket > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "还剩" + ticket + "张票");
            ticket--;
        }
    }
}

public class WindowTest03 {
    public static void main(String[] args) {
        window3 w = new window3();
        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);
        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");
        t1.start();
        t2.start();
        t3.start();

    }
}
