package com.amao.demo02_单例设计模式;

/**
 *  单例设计模式:饿汉式
 *  @Author : ItAmao
 *  @Date   : 2020/7/8 16:07
 */
public class HungryMan {
    private String name;
    private int age;


    //1.构造器私有化
    private HungryMan() {
    }

    private HungryMan(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //2.在类内部创建一个静态的本类对象
    private static HungryMan hm = new HungryMan("阿毛", 23);

    //3.提供一个静态方法用于获取该对象
    public static HungryMan getInstance() {
        return hm;
    }
}

class Test {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            //4.别的类中想要获取对象可以通过这个类的静态方法获取
            HungryMan hm = HungryMan.getInstance();
            System.out.println(hm);
        }
    }
}