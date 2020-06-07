package com.amao.demo11_抽象类的特点;

/**
 * @Author：pengzhilin
 * @Date: 2020/6/2 14:29
 */
public abstract class Doctor extends Person{
    @Override
    public void eat() {
        System.out.println("医生吃麻辣烫");
    }
}
