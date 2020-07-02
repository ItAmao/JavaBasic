package com.amao.demo07_CyclicBarrier;

import java.util.concurrent.CyclicBarrier;

public class TestDemo {
    public static void main(String[] args) throws InterruptedException {
        //0.创建一个
        CyclicBarrier cb = new CyclicBarrier(5, new Runnable() {
            @Override
            public void run() {
                System.out.println("打开宝藏大门....寻宝....");
            }
        });

        //1.创建五个线程
        PersonThread p1 = new PersonThread("韩立",cb);
        PersonThread p2 = new PersonThread("红发老祖",cb);
        PersonThread p3 = new PersonThread("血发老魔",cb);
        PersonThread p4 = new PersonThread("白发老怪",cb);
        PersonThread p5 = new PersonThread("黑发老铁",cb);

        //2.启动
        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
    }
}
