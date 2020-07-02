package com.amao.demo04_匿名内部类创建简化方式;

public class ThreadAnonymousInnerClass {
    public static void main(String[] args) {
        //1.继承方式
        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i <= 100; i++) {
                    System.out.println("匿名内部类继承方式执行了:" + i + "次");
                }
            }
        }.start();

        //2.实现方式
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 100; i++) {
                    System.out.println("匿名内部类实现方式执行了:" + i + "次");
                }
            }
        }).start();

        //3.普通方式
        for (int i = 0; i <= 100; i++) {
            System.out.println("普通方式执行了:" + i + "次");
        }
    }
}
