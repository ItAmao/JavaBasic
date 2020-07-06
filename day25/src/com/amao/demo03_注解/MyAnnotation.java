package com.amao.demo03_注解;

/**
 * 自定义注解
 *
 *  @Author : ItAmao
 *  @Date   : 2020/7/5 20:19
 */
public @interface MyAnnotation {
    //给注解添加属性
    int age();

    String name();

    String[] hobby();

}
