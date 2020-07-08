package com.amao.demo03_多例设计模式;

import java.util.ArrayList;
import java.util.Random;

/**
 *  @Author : ItAmao
 *  @Date   : 2020/7/8 16:41
 */
public class Dog {
    //定义一个常量,用于指定多例的具体个数
    private static final int COUNT = 3;

    //a.将构造方法设置成私有方法
    private Dog() {

    }

    //b.在本类的内部创建一个静态集合,保存多个对象
    private static ArrayList<Dog> arrayList = new ArrayList<>();

    //使用静态代码块给集合添加多个对象,保证这些对象一定且只会执行一次
    static {
        for (int i = 0; i < COUNT; i++) {
            arrayList.add(new Dog());
        }
    }

    //c.在本类中提供一个静态方法,随机返回集合中某个对象
    public static Dog getInstance() {
        return arrayList.get(new Random().nextInt(arrayList.size()));
    }

}

class Test1 {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            Dog dog = Dog.getInstance();
            System.out.println(dog);//只有三种不同的对象地址,因为集合中只要3个对象
        }
    }
}
