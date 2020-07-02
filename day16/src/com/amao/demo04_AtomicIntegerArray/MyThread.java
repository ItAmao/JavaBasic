package com.amao.demo04_AtomicIntegerArray;

import java.util.concurrent.atomic.AtomicIntegerArray;

public class MyThread extends Thread {
//    public static int[] arr = new int[1000];//不直接使用数组
    public static AtomicIntegerArray arr = new AtomicIntegerArray(10000);//直接使用原子类数组
    @Override
    public void run() {
        for (int i = 0; i < arr.length(); i++) {
            arr.getAndIncrement(i);//相当于数组操作中的arr[i]++
//            arr.incrementAndGet(i);//相当于数组操作中的++arr[i]
//            arr.getAndAdd(i,1);
//            arr.addAndGet(i,1);
            //以上四种方式在本题中均可
        }
    }
}