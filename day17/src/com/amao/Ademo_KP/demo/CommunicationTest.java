package com.amao.Ademo_KP.demo;

/**
 * 例题:线程通信的例子,使用两个线程打印1-100,线程1 线程2 交替打印
 *
 *  设计到的三个方法:
 *      wait():一旦执行此方法,当前线程进入阻塞状态,并释放同步监视器
 *      notify():一旦执行此方法,就会唤醒被wait的一个线程,如果有多个线程被wait那么就执行优先级高的那个
 *      notifyAll():一旦执行此方法,就会唤醒所有别wait的线程
 *
 *
 *  说明:
 *     1.以上三个方法,必须使用在同步代码块或同步方法中,
 *     2.以上三个方法的调用者.必须是同步代码块或同步方法中的同步监视器,否则会出现异常
 *     3.以上三个方法定义在Object类当中
 *
 *  面试题:sleep和wait方法的异同:
 *      同:一旦执行方法啊,都可以使得当前的线程进入阻塞状态
 *      异:  1,两个方法声明的位置不同,Thread类中声明sleep(),Object类中声明wait()
 *          2.使用的要求不同,sleep可以在任何需要的场景下调用,wait必须使用在同步代码块或同步方法中
 *          3.关于是否释放同步监视器:如果两个方法都使用在同步代码块或同步方法中,sleep方法不会释放同步监视器,wait会释放同步监视器
 *
 *
 *  @Author : ItAmao
 *  @Date   : 2020/6/25 16:45
 */
class Number implements Runnable {
    private int num = 1;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                notify();
                if (num <= 100) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ":" + num);
                    num++;
                    try {
                        //使得调用如下wait方法的线程进入阻塞状态
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    break;
                }
            }
        }
    }
}

public class CommunicationTest {
    public static void main(String[] args) {
        Number number = new Number();

        Thread t1 = new Thread(number, "线程1");
        Thread t2 = new Thread(number, "线程2");

        t1.start();
        t2.start();
    }
}
