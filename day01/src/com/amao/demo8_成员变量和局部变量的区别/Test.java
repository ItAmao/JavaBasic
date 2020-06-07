package com.amao.demo8_成员变量和局部变量的区别;

/**
 * @Author：pengzhilin
 * @Date: 2020/5/31 14:46
 */
public class Test {

    /*
        成员变量和局部变量的区别:
            定义的位置不同: 成员变量定义在类中方法外,局部变量定义在方法中
            在内存中的位置不同: 成员变量是在堆区,局部变量是在栈区
            生命周期不同:
                成员变量是随着对象的创建而存在,随着对象的销毁而销毁
                局部变量是随着方法的调用而存在,随着方法调用完毕而销毁
            默认值不同:
                成员变量有默认值
                局部变量没有默认值,不赋值不能直接使用
     */
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.color);
        car.drive();
    }
}
