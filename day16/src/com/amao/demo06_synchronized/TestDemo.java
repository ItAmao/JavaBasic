package com.amao.demo06_synchronized;

public class TestDemo {
    public static void main(String[] args) {
        //0.创建任务
        MyRunnable mr = new MyRunnable();
        //1.创建窗口123
        Thread t1 = new Thread(mr, "影院1");
        Thread t2 = new Thread(mr,"影院2");
        Thread t3 = new Thread(mr,"影院3");
        t1.start();
        t2.start();
        t3.start();
        //出现多线程安全问题:
        //a.出现了重复数据
        //b.出现了0,-1非法数据
    }
}
