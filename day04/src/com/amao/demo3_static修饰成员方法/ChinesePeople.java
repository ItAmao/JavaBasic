package com.amao.demo3_static修饰成员方法;

/**
 * @Author：pengzhilin
 * @Date: 2020/6/4 10:12
 */
public class ChinesePeople extends People {

    //@Override 编译报错,说明以下方法不是重写的方法
    public static void method2(){
        System.out.println("ChinesePeople 静态方法 method2");
    }
}
