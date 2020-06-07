package com.amao.demo7_扩展多态的完整使用;

abstract class Animal {
    public abstract void eat();
}

class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void catchMouse() {
        System.out.println("猫抓老鼠");
    }
}

class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    public void lookHome() {
        System.out.println("狗看家");
    }
}

public class Test {
    public static void main(String[] args) {
        Animal animal = new Dog();
        method1(animal);
        Animal animal1 = new Cat();
        method1(animal1);
    }

    //定义一个方法,接收Animal类的所有子类对象,并且在该方法中调用eat方法方法
    public static void method1(Animal animal) {
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.eat();
        }
        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.eat();
        }
    }
}
