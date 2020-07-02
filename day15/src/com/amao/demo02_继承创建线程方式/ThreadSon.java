package com.amao.demo02_继承创建线程方式;

//1.创建一个子类继承Thread
public class ThreadSon extends Thread {
    //2.子类重写run方法
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println("ThreadSon运行了" + i + "次");
        }
    }
}
