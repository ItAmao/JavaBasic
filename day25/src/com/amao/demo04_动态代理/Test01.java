package com.amao.demo04_动态代理;


/**
 * 使用动态代理:不允许集合增删改
 */
interface A {
    void add();

    void remove();

    void set();

    void select();
}

//被代理类
class B implements A {

    @Override
    public void add() {
        System.out.println("添加了一个元素");
    }

    @Override
    public void remove() {
        System.out.println("删除了一个元素");
    }

    @Override
    public void set() {
        System.out.println("修改了一个元素");
    }

    @Override
    public void select() {
        System.out.println("查找一个元素");
    }
}

//动态代理
class ProxyFactory {

}

public class Test01 {

}
