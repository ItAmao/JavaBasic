package com.amao.demo4_多态的应用场景;

class Animal {

}

class Dog extends Animal {
}

class Cat extends Animal {
}

public class Test {
    public static void main(String[] args) {
        /*
            多态的应用场景:
                变量多态------------->场景不多
                参数多态------------->常见
                返回值多态----------->常见
         */
        // 变量多态
        Animal anl = new Dog();
        anl = new Cat();

        // 参数多态
        Animal anl1 = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        method1(anl1);
        method1(dog);
        method1(cat);

        // 返回值多态
        Animal anl2 = method2();
    }


    // 如果方法的返回值类型为父类类型,那么就可以返还该父类类型的对象或者其子类对象
    public static Animal method2() {
        //Animal anl = new Animal();
        //return anl;
        //Dog dog = new Dog();
        //return dog;
        Cat cat = new Cat();
        return cat;
    }

    // 如果方法的参数类型为父类类型,那么就可以接收该父类类型的对象或者其子类类型的对象,提高程序的扩展性
    public static void method1(Animal anl) {

    }

   /* public static void method1(Dog dog){

    }

    public static void method1(Cat cat){

    }*/
}