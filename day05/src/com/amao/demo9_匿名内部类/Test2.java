package com.amao.demo9_匿名内部类;

/**
 * @Author：pengzhilin
 * @Date: 2020/6/5 11:43
 */
interface A{
    void method();
}
class Imp implements A{

    @Override
    public void method() {
        System.out.println("实现类 method方法");
    }
}
public class Test2 {
    public static void main(String[] args) {
        /*
            - 匿名内部类的概述
                概述:
                    2.本质其实是一个实现了接口的匿名实现类的对象

                 匿名内部类的作用: 没有特殊的功能,只是用来简化代码的

            - 匿名内部类的格式
                    new 接口类型(){
                        实现抽象方法
                    };
         */
        // 需求: 调用A接口的method方法
        A i = new Imp();
        i.method();

        A a = new A() {
            @Override
            public void method() {
                System.out.println("method...");
            }
        };
        a.method();

        System.out.println("=========================");
        method1(new A() {
            @Override
            public void method() {
                System.out.println("method...");
            }
        });

        method1(new Imp());
    }

    public static void method1(A a){
        a.method();
    }
}
