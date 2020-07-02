package com.amao.demo01_synchronized同步方法;

public class Test03 {
    public static void main(String[] args) {
        MyThread03 my1 = new MyThread03();

        Thread t1 = new Thread(my1, "万达影院");
        Thread t2 = new Thread(my1, "潇湘影院");
        Thread t3 = new Thread(my1, "中影国际");

        t1.start();
        t2.start();
        t3.start();


    }
}
