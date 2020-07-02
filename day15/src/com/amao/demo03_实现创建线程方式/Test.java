package com.amao.demo03_实现创建线程方式;

public class Test {
    public static void main(String[] args) {
        //3.创建这个实现类对象(这个对象我们称为任务对象)
        ThreadRealize tr = new ThreadRealize();
        //4.创建Thread对象时把任务对象作为参数传入
        Thread t = new Thread(tr, "实现类");
        t.start();


        for (int i = 0; i <= 100; i++) {
            System.out.println(t.currentThread().getName() + "出现了" + i + "次");
        }
    }
}
