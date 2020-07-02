package com.amao.demo01_volatile解决可见性;

public class Test {
    public static void main(String[] args) {
        //1.启动线程对象
        MyThread t1 = new MyThread();
        //2.启动线程
        t1.start();
        while (true) {
            if (MyThread.a == 1) {
                System.out.println("主线程读到了a=1");
            }
        }
    }

}
