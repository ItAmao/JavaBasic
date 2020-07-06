package com.amao.demo04_动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collection;

/**
 * 对Collection接口进行代理，以前的remove(Object obj)方法是删除集合中第一次出现的元素
 * (比如集合中有多个“abc”,调用remove(“abc”)后只会删除一个元素)。
 * 代理后，要求在调用remove(Object obj)方法后，能够删除集合中所有匹配的元素。
 * 【动态代理】**
 *  @Author : ItAmao
 *  @Date   : 2020/7/5 21:25
 */
@SuppressWarnings("all")
public class Demo01 {
    public static void main(String[] args) {
        ArrayList<String> arr1 = new ArrayList<>();
        arr1.add("abc");
        arr1.add("abc");
        arr1.add("abc");
        arr1.add("bcd");
        arr1.add("abc");
        arr1.add("bcd");

        //System.out.println(arr1);
        //动态代理
        Collection<String> list2 = (Collection<String>) Proxy.newProxyInstance(arr1.getClass().getClassLoader(), arr1.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                String name = method.getName();
                Object o = method.invoke(arr1, args);
                if (name.equals("remove")) {
                    String o1 = (String) args[0];
                    while (arr1.contains(o1)) {
                        method.invoke(arr1, args);
                    }
                }
                return o;
            }
        });
        System.out.println(list2);
        list2.remove("abc");
        System.out.println(list2);

    }
}
