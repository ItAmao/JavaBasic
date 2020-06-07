package com.amao.demo1_实现多态;

class Animal {
    public void eat() {
        System.out.println("吃东西");
    }
}

class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("狗吃骨头...");
    }
}

class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼...");
    }
}

// ==================================
interface IA {
    public void method();
}

class Imp implements IA {
    @Override
    public void method() {

    }
}

public class Test {
    public static void main(String[] args) {
        /*
            多态: 对于同一个行为,不同的对象具有不同的表现形式
            实现多态:
                1.继承或者实现
                2.父类的引用指向子类对象   父类类型 对象名 = 子类对象;
                3.要有方法的重写
         */
        Animal anl = new Dog();
        anl.eat();

        anl = new Cat();
        anl.eat();

        System.out.println("=============================");
        IA ia = new Imp();
    }
}
