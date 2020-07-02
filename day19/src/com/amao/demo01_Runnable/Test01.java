package com.amao.demo01_Runnable;

public class Test01 {
    public static void main(String[] args) {
        //使用实现方式创建一个线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable执行了");
            }
        }).start();
        //使用匿名内部类的冗余代码
        //a.为了不写实现类,我们采用匿名内部类
        //b.由于面向对象语法的束缚,我们只能创建Runnable的匿名内部类
        //c.由于面向对象语法的束缚,我们必须重写一个和run一模一样的方法
        //d.只有方法体才是我们想要写的

        //Lambda表达式实现
        new Thread(() -> System.out.println("Lambda执行了")).start();

    }
}
