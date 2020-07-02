package com.amao.demo02_继承创建线程方式;

public class MyThreadSon {
    public static void main(String[] args) {
        //3.创建子类对象
        ThreadSon ts = new ThreadSon();
        //4.开启线程(调用start方法)
        ts.start();
        //ts.setName("Main线程:");
        String name = Thread.currentThread().getName();
        for (int i = 0; i <= 100; i++) {
            //System.out.println(ts.getName() + "运行了" + i + "次");
            System.out.println(name + "运行了" + i + "次");
        }
    }
}
