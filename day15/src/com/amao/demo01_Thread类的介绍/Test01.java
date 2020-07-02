package com.amao.demo01_Thread类的介绍;

public class Test01 {
    public static void main(String[] args) {

        MyThread myThread = new MyThread();
        myThread.start();
        //1.循环1
        for (int i = 0; i < 100; i++) {
            System.out.println("听歌" + i);
        }

    }
}
