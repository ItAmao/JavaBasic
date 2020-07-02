package com.amao.demo09_Exchanger;

import java.util.concurrent.Exchanger;

public class TestDemo {
    public static void main(String[] args) {
        //1.创建Exchanger
        Exchanger<String> exchanger = new Exchanger<String>();

        //2.创建线程AB
        ThreadA a = new ThreadA(exchanger);
        ThreadB b = new ThreadB(exchanger);

        //3.开启线程A
        a.start();
        b.start();

    }
}
