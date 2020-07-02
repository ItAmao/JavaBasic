package com.amao.demo05_ConcurrentHashMap;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MyThread extends Thread {
    //public static Map<Integer, Integer> map = new HashMap<>();//是线程不安全的
    //public static Hashtable<Integer, Integer> map = new Hashtable<>();//是线程安全的
    public static ConcurrentHashMap<Integer, Integer> map = new ConcurrentHashMap<>();//是线程安全的
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            map.put(i, i);// 00 11 22 33 44 .. 9999 9999
        }
        System.out.println("1万次OK");
    }
}

