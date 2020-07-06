package com.amao.demo03_注解;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 *  @Author : ItAmao
 *  @Date   : 2020/7/5 20:34
 */
//一开始没有加,获取不到注解
@Retention(RetentionPolicy.RUNTIME)
public @interface Book {

    int price();

    String name();

    String[] author();
}
