package com.amao.demo5_多态的好处和弊端;

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

public class Test {
    public static void main(String[] args) {
        /*
            多态的好处和弊端:
                好处:
                    父类类型作为方法形式参数，传递子类对象给方法，进行方法的调用，更能体现出多态的扩展性与便利。
                    父类类型作为方法返回值类型，返回子类对象，进行方法的调用，更能体现出多态的扩展性与便利。
                弊端:
                    多态的情况下，只能调用父类的共性内容，不能调用子类的特有内容。
         */
        Dog dog = new Dog();
        method1(dog);

        Cat cat = new Cat();
        method1(cat);

        System.out.println("==================");
        Animal anl2 = method2(dog);
        Animal anl3 = method2(cat);

        System.out.println(anl2);
        System.out.println(dog);

        System.out.println(anl3);
        System.out.println(cat);
    }

    // 定义一个方法,接收Animal类的所有子类对象,然后在方法中进行一系列操作后,返回该传入的对象
    public static Animal method2(Animal anl) {
        anl.eat();
        return anl;
    }

    // 需求: 定义一个方法,可以接收Animal类的所有子类对象,并且在该方法中调用eat方法
    public static void method1(Animal anl) {
        anl.eat();
        //anl.lookHome();
        //anl.catchMouse();
    }


  /*  public static void method1(Dog dog){
        dog.eat();
    }

    public static void method1(Cat cat){
        cat.eat();
    }*/
}