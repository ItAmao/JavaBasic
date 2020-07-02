package com.amao.Ademo_KP.demo;

/**
 * 使用同步方法处理继承Thread类的方式中的线程安全问题
 *
 * 关于同步方法的总结
 *  1.同步方法任然设计到同步监视器,只是不需要我们显示的声明
 *  2.非静态的同步方法,同步监视器是:this
 *      静态的同步方法,同步监视器是;当前类本身
 *
 *
 *  @Author : ItAmao
 *  @Date   : 2020/6/25 15:17
 */
class window4 extends Thread {
    private static int ticket = 100;

    @Override
    public void run() {
        while (true) {
            show();
        }
    }

    // private synchronized void show() { //同步监视器 w1,w2,w2这个时候会出现原子性问题
    private synchronized static void show() { //加了static之后,此时同步监视器变成了本类的window4
        if (ticket > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ": 卖出了一张,还剩:" + ticket + "张票");
            ticket--;
        }
    }
}


public class WindowTest04 {
    public static void main(String[] args) {
        window4 w1 = new window4();
        window4 w2 = new window4();
        window4 w3 = new window4();

        w1.setName("窗口1");
        w2.setName("窗口2");
        w3.setName("窗口3");

        w1.start();
        w2.start();
        w3.start();
    }

}
