package com.amao.demo9_匿名内部类;

/**
 * @Author：pengzhilin
 * @Date: 2020/6/5 11:24
 */
abstract class Animal{
    public abstract void eat();
}

class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("狗吃骨头....");
    }
}

public class Test {
    public static void main(String[] args) {
        /*
            - 匿名内部类的概述
                概述:
                    1.本质其实是一个继承了类的匿名子类的对象
                    2.本质其实是一个实现了接口的匿名实现类的对象

                 匿名内部类的作用: 没有特殊的功能,只是用来简化代码的

            - 匿名内部类的格式
                    父类类型 对象名=new 父类类型(){
                        实现抽象方法
                    };

            举例:
                需求: 调用Animal抽象类中的eat方法
                分析:
                    1.创建一个Animal类的子类
                    2.在子类中重写eat方法
                    3.创建子类对象
                    4.使用子类对象调用eat方法
               实现这个需求,以上4步一步都不能少
               思考: 是否可以简写以上4步,也就是不创建Animal类的子类,直接创建Animal类的子类对象????
               解决: 可以的,使用匿名内部类
               匿名内部类的作用: 没有特殊的功能,就是用来简化代码的
         */
        // 左边是Animal类型的变量,右边是Animal类型的子类对象
        Animal anl = new Dog();// 右边: Dog类的对象  Animal类的Dog子类对象
        anl.eat();

        // 匿名内部类: 其实就是一个类的匿名子类对象
        Animal anl2 = new Animal() {
            @Override
            public void eat() {
                System.out.println("eat....");
            }
        };// 右边: 匿名内部类   Animal类的匿名子类对象

        anl2.eat();
    }
}
