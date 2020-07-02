package com.amao.demo05_ConcurrentHashMap;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MyThread01 extends Thread {
    //    public static Map<Integer, Integer> map = new Hashtable<>();
    public static Map<Integer, Integer> map = new ConcurrentHashMap<>();

    @Override
    public void run() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            map.put(i, i);
        }
        long end = System.currentTimeMillis();
        System.out.println((end - start) + " 毫秒");
    }
}



