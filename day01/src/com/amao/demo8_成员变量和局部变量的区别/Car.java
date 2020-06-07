package com.amao.demo8_成员变量和局部变量的区别;

/**
 * @Author：pengzhilin
 * @Date: 2020/5/31 14:47
 */
public class Car {

    String color;// 颜色  成员变量   默认值null

    public void drive(){
        int speed = 150;// 速度 局部变量
        System.out.println(speed);
    }

}
