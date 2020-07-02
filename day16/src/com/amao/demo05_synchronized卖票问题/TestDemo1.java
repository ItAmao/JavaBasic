package com.amao.demo05_synchronized卖票问题;

public class TestDemo1 {
    public static void main(String[] args) {
        MyRunnable my = new MyRunnable();
        Thread t1 = new Thread(my, "影院1");
        Thread t2 = new Thread(my, "影院2");
        Thread t3 = new Thread(my, "影院3");

        t1.start();
        t2.start();
        t3.start();


    }
}
