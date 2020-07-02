package com.amao.demo04_AtomicIntegerArray;

import java.util.Arrays;

public class TestDemo {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 1000; i++) {
            new MyThread().start();//创建1000个线程，每个线程为数组的每个元素+1
        }
        //结果理论上是什么:1000个1000啊!!
        Thread.sleep(1000 * 5);//让所有线程执行完毕
        System.out.println("主线程休息5秒醒来");
        //结果实际上是小于1000的(多尝试几次)
        System.out.println(MyThread.arr);
    }
}
