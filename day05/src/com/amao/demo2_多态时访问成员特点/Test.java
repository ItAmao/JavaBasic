package com.amao.demo2_多态时访问成员特点;

abstract class Animal {
    int num = 20;

    public void eat() {
        System.out.println("吃东西");
    }

    public static void sleep() {
        System.out.println("睡觉...");
    }
}

class Dog extends Animal {
    int num = 10;

    @Override
    public void eat() {
        System.out.println("狗吃骨头...");
    }

    public static void sleep() {
        System.out.println("狗睡觉...");
    }
}

public class Test {
    public static void main(String[] args) {
        /*
            多态时访问成员的特点:
                成员变量: 编译看父类,运行看父类(编译看左边,运行看左边)
                成员方法:
                    非静态方法:编译看父类,运行看子类(编译看左边,运行看右边)
                    静态方法: 编译看父类,运行看父类(编译看左边,运行看左边)
               记忆:
                    只有非静态方法是编译看父类,运行看子类,其余都是看父类
               注意:
                    多态情况下,无法访问子类独有的成员方法\成员变量
         */
        // 父类的引用指向子类的对象
        Animal anl = new Dog();
        System.out.println(anl.num);// 20

        anl.eat();

        anl.sleep();
    }
}
