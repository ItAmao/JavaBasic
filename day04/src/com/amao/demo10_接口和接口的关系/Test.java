package com.amao.demo10_接口和接口的关系;

/**
 * @Author：pengzhilin
 * @Date: 2020/6/4 11:47
 */

interface A{}
interface B{}

interface C extends A{}
interface D extends A,B{}
interface E extends D{}

public class Test {
    public static void main(String[] args) {
        /*
            接口和接口的关系: 继承关系
                单继承: 一个接口继承另一个接口
                    public interface 子接口名 extends 父接口名{}

                多继承:一个接口同时继承多个接口
                     public interface 子接口名 extends 父接口名1,父接口名2,...{}

                多层继承:A接口继承B接口,B接口继承C接口
                    public interface A extends B{}
                    public interface B extends C{}
         */
    }
}
