package com.amao.demo03_实现创建线程方式;

//1.创建一个实现类实现Runnable接口
public class ThreadRealize implements Runnable {
    //2.重写run方法(写需要执行的任务代码)
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName() + "出现了" + i + "次");
        }
    }
}
