package com.amao.demo03_注解;

import java.lang.reflect.Method;

/**
 *  @Author : ItAmao
 *  @Date   : 2020/7/5 20:47
 */
public class MyTestDemoTest {
    public static void main(String[] args) throws Exception {
        Class clazz = Class.forName("com.amao.demo03_注解.MyTestDemo");

        Method[] m1 = clazz.getMethods();
        for (Method method : m1) {
            if (method.isAnnotationPresent(MyTest.class)) {
                method.invoke(new MyTestDemo());
            }
        }

    }
}
