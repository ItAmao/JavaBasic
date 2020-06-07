package com.amao.demo3_多态的几种表现形式;

class Fu{

}

class Zi extends Fu{

}

abstract class Animal{}
class Dog extends Animal{}


interface A{};
class Imp implements A{}

public class Test {
    public static void main(String[] args) {
        /*
            - 普通父类多态
            - 抽象父类多态
            - 父接口多态
         */
        Fu fu = new Zi();
        Animal anl = new Dog();
        A a = new Imp();
    }
}

