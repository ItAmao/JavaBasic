package com.amao.demo01_Thread类的介绍;

public class MyThread extends Thread {
    public void run() {
        //1.循环2
        for (int i = 0; i < 100; i++) {
            System.out.println("吃饭" + i);
        }
    }
}
