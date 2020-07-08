package com.amao.demo04_动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

/**
 *  @Author : ItAmao
 *  @Date   : 2020/7/8 17:23
 */
@SuppressWarnings("all")
public class ProxyDemo {
    public static void main(String[] args) {
        //1.创建一个集合对象
        ArrayList<String> arr = new ArrayList<>();
        arr.add("阿毛");
        arr.add("你好");
        arr.add("你真瘦");

        List<String> arrProxy = (List<String>) Proxy.newProxyInstance(arr.getClass().getClassLoader(),
                arr.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        String name = method.getName();
                        if (name.startsWith("get")) {//方法用于检测字符串是否以指定的前缀开始。
                            return method.invoke(arr, args);
                        } else {
                            throw new UnsupportedOperationException("方法" + name + "不支持...");
                        }
                    }
                });
        method(arrProxy);
    }

    public static void method(List<String> arr) {
        //arr.add("1");
        System.out.println(arr.get(0));
        System.out.println(arr.get(1));
        System.out.println(arr.get(2));
    }
}
