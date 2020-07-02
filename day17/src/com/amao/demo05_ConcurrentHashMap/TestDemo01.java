package com.amao.demo05_ConcurrentHashMap;

public class TestDemo01 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 1000; i++) {
            new MyThread().start();//开启1000个线程
        }
        Thread.sleep(1000 * 20);
        // 由于每个线程执行时间稍长，所以这里多停顿一会
        System.out.println("map的最终大小：" + MyThread.map.size());
    }
}
