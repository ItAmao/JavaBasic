package com.amao.demo02_Lock锁;

public class Test01 {
    public static void main(String[] args) {
        MyThread01 mt = new MyThread01();

        Thread t1 = new Thread(mt, "万达影院");
        Thread t2 = new Thread(mt, "潇湘影院");
        Thread t3 = new Thread(mt, "中影国际");

        t1.start();
        t2.start();
        t3.start();
    }
}
