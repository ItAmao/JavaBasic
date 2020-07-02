package com.amao.Ademo_KP.demo;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 例题:
 *      银行有一个账户,有两个储户分别向同一个账户存3000元,每次存1000,存3次,每次存完打印账户余额
 *
 * 分析:
 *      1.是否是分线程的问题: 是,两个储户
 *      2.是否有共享数据?  有,账户
 *      3.是否有线程安全问题? 有
 *      4.需要考虑如何解决线程安全问题?   同步机制:三种方式
 *
 *  @Author : ItAmao
 *  @Date   : 2020/6/25 16:29
 */
class Account implements Runnable {
    private double overage = 0;
    private ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            lock.lock();
            overage += 1000;
            System.out.println(Thread.currentThread().getName() + "存入钱,银行卡的余额为:" + overage);
            lock.unlock();
        }
    }
}

public class AccountTest {
    public static void main(String[] args) {
        Account a = new Account();

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(a);

        t1.setName("储户1");
        t2.setName("储户2");

        t1.start();
        t2.start();

    }
}
