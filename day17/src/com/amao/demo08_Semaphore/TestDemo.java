package com.amao.demo08_Semaphore;

import java.util.concurrent.Semaphore;

public class TestDemo {
    public static void main(String[] args) {
        //0.使用Semaphore
        Semaphore sm = new Semaphore(1);

        //1.循环创建
        for (int i = 0; i < 10; i++) {
            new MyThread(sm).start();
        }
    }
}
