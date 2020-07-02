package com.amao.demo04_生产者和消费者问题;

import java.util.ArrayList;

/**
 * @description: 添加两个线程, 生产者线程负责做包子, 消费者线程负责吃包子, 要求两个线程交替执行
 * @params:
 * @return:
 * @author: ItAmao
 * @time: 2020/6/23 18:41
 */
public class Test01 {
    //1.创建100个包子
    public static int bun = 10;

    public static void main(String[] args) {

        //2.创建线程对象
        Object obj = new Object();
        //3.创建线程 生产者线程和消费者线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    synchronized (obj) {
                        //判断是否有包子,包子大于等于5才开始卖
                        if (bun == 0) {
                            try {
                                obj.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        bun++;
                        System.out.println("包子做好啦,包子数量为:" + bun + "个");
                        //唤醒消费者线程,来买包子
                        obj.notify();

                    }
                }
            }
        }).start();

        //创建消费者线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    synchronized (obj) {
                        //判断 是否还有包子
                        if (bun == 0) {
                            System.out.println("稍等,包子卖光了,正在做");
                            try {
                                obj.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        //如果包子不为0,吃包子
                        System.out.println("包子卖出,还剩" + bun + "个包子");
                        bun--;
                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        //唤醒生产者线程
                        obj.notify();
                    }
                }
            }
        }).start();
    }
}
