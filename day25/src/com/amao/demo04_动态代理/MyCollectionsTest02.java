package com.amao.demo04_动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

/**
 *  @Author : ItAmao
 *  @Date   : 2020/7/5 21:19
 */
@SuppressWarnings("all")
public class MyCollectionsTest02 {

    public static void main(String[] args) {
        //创建集合
        ArrayList<String> list = new ArrayList<>();
        //添加方法
        list.add("石原里美");
        list.add("王众");

        //动态代理
        List<String> list2 = (List<String>) Proxy.newProxyInstance(list.getClass().getClassLoader(), list.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                //判断不是四个字的
                String name = method.getName();
                if (name.equals("add")) {
                    String s = (String) args[0];
                    if (s.length() != 4) {
                        System.out.println("不能添加:" + s);
                        return false;
                    }
                }
                //调用其他方法
                return method.invoke(list, args);
            }
        });
    }
}
