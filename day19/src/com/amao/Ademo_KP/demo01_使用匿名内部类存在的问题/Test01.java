package com.amao.Ademo_KP.demo01_使用匿名内部类存在的问题;

public class Test01 {
    public static void main(String[] args) {
        //使用匿名内部类存在的问题:使用匿名内部类语言是很冗余的
        //匿名内部类做了哪些事情
        //1.定义了一个没有名字的类
        //2.这个类实现了Runnable接口
        //3.创建了这个类的对象
        //其实我们关注的是run方法和里边要执行的代码
        //Lambda表达式体现的是函数式编程思想,只需要将要执行的代码放到函数中(函数就是类中的方法)
        //lambda就是一个匿名函数,我们只需要将要执行的代码放入Lambda表达式中即可
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("新线程执行代码啦");
            }
        }).start();

        //体验Lambda表达式
        new Thread(() -> {
            System.out.println("我执行啦");
        }).start();

        /*
            好处:体验了Lambda表达式的使用,发现Lambda简化匿名内部类的简写
         */
    }
}
