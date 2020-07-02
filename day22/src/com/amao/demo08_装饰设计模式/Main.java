package com.amao.demo08_装饰设计模式;

/**
 *  @Author : ItAmao
 *  @Date   : 2020/6/30 19:08
 */
public class Main {
    public static void main(String[] args) {
        //1.创建一个被装饰者对象
        Student student = new Student();
        //2.创建一个装饰者对象
        ItAmao itAmao = new ItAmao(student);
        //3.调用方法
        itAmao.sleep();
        itAmao.eat();
    }
}
