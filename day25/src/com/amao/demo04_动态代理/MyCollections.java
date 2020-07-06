package com.amao.demo04_动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;

/**
 *  @Author : ItAmao
 *  @Date   : 2020/7/5 21:06
 */
@SuppressWarnings("all")
public class MyCollections {
    //传入list代理者
    public static List<String> method(List<String> list) {
        //动态代理
        /**
         * 新的代理实例
         * newProxyInstance()
         *  第一个参数:list类加载器
         *  第二个参数:list接口
         *  第三个参数:处理方式
         *
         */
        //这里需要把被代理者传入
        MyInvocationHandler handler = new MyInvocationHandler();
        handler.bind(list);
        return (List<String>) Proxy.newProxyInstance(list.getClass().getClassLoader(), list.getClass().getInterfaces(), handler);
    }
}

class MyInvocationHandler implements InvocationHandler {
    private Object obj;

    public void bind(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //不能调用增删改
        String name = method.getName();
        if (name.equals("add") || name.equals("remove") || name.equals("set")) {
            throw new RuntimeException("不允许调用" + name + "()方法");
        }
        //允许调用其他方法
        Object o = method.invoke(this.obj, args);
        return o;
    }
}
