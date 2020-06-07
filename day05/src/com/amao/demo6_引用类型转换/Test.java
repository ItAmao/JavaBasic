package com.amao.demo6_引用类型转换;

abstract class Animal {
    public abstract void eat();
}

class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("狗吃骨头...");
    }

    public void lookHome() {
        System.out.println("看家....");
    }
}

class Cat extends Animal {

    @Override
    public void eat() {
        System.out.println("猫吃鱼...");
    }

    public void catchMouse() {
        System.out.println("抓老鼠...");
    }
}

class Person {
}

public class Test {
    public static void main(String[] args) {
        /*
            向上转型: 子类类型向父类类型转换的过程,这个过程是自动的
                格式: 父类类型 变量名 = 子类对象;

            向下转型: 父类类型向子类类型转换的过程,这个过程是强制的
                格式: 子类类型 变量名 = (子类类型)父类类型的变量;

            问题: 如果需要转型的父类类型变量指向的不是要转换的子类类型对象,那么就会报类型转换异常
            解决: 使用instanceof关键字进行类型判断
            格式:
                if(变量名  instanceof 数据类型){

                }
                如果左边变量名指向的对象是属于后面的数据类型,那么返回true
                如果左边变量名指向的对象不属于后面的数据类型,那么返回false
         */
        // 向上转型
        Animal anl = new Dog();

        // 如果在向下转型之前,改变anl指向Cat类对象
        anl = new Cat();

        // 向下转型
        if (anl instanceof Dog) {
            Dog dog = (Dog) anl;
            dog.lookHome();
        }

        if (anl instanceof Cat) {
            Cat cat = (Cat) anl;
            cat.catchMouse();
        }
    }

    private static void method01() {
        // 向上转型
        Animal anl = new Dog();
        //Animal anl2 = new Person();// 编译报错,引用类型之间的转换要是父子类关系

        // 向下转型
        //Dog dog = (Dog) new Animal();
        Dog dog = (Dog) anl;
    }
}
