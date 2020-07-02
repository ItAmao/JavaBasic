package com.amao.demo01_synchronized同步方法;

public class Test01 {
    public static void main(String[] args) {
        MyThread01 my1 = new MyThread01();

        Thread t1 = new Thread(my1, "万达影院");
        Thread t2 = new Thread(my1, "潇湘影院");
        Thread t3 = new Thread(my1, "中影国际");

        t1.start();
        t2.start();
        t3.start();


    }
}
