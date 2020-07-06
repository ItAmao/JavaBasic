package com.amao.Ademo_KP.java4;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 *  @Author : ItAmao
 *  @Date   : 2020/7/5 19:05
 */

interface Human {
    String getBelief();

    void eat(String food);
}

//被代理类
class SuperMan implements Human {
    @Override
    public String getBelief() {
        return "I believe i can fly";
    }

    @Override
    public void eat(String food) {
        System.out.println("我喜欢吃" + food);
    }
}

/**
 * 要想实现动态代理,需要解决的问题?
 * 1.如何根据加载到内存中的被代理类,动态的创建一个代理类及其对象
 * 2.当通过代理类的对象,调用方法时,如何动态的去调用代理类的同名方法
 *
 */
class ProxyFactory {
    //调用此方法,返回一个代理类的对象,解决问题一
    public static Object getProxyInstance(Object obj) {//obj:被代理类的对象
        MyInvocationHandler handler = new MyInvocationHandler();
        handler.bind(obj);
        //第一个参数:类的加载器,哪个类加载器加载的,我就跟你一样
        //第二个参数:Class数组类型,作用:要创建一个代理类的对象,代理类和被代理类要实现同样的接口
        //第三个参数:动态的去调用代理类的同名方法
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), handler);
    }
}

class MyInvocationHandler implements InvocationHandler {

    private Object obj;//赋值时,也需要被代理类的对象进行赋值

    public void bind(Object obj) {
        this.obj = obj;
    }

    //当我们通过代理类的对象调用方法a时,就会自动的调用如下的方法 invoke()
    //将被代理类要执行的方法a的功能就声明在invoke方法中
    //第一个参数:代理类的对象
    //第二个参数:代理类的对象调用什么方法
    //第三个参数:args 参数
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //method:即为代理类对象调用的方法,此方法也就作为被代理类对象要调用的方法
        //obj:被代理类的对象
        Object returnValue = method.invoke(obj, args);
        //上述方法的返回值,就作为当前类中invoke()的返回值
        return returnValue;
    }
}

public class ProxyTest {
    public static void main(String[] args) {
        SuperMan superMan = new SuperMan();
        //Object proxyInstance = ProxyFactory.getProxyInstance(superMan);
        //不能在前边写SuperMan,实现了superMan的接口,而不是造了superMan对象 相当于代理自己了
        //SuperMan proxyInstance = ProxyFactory.getProxyInstance(superMan);

        //此时proxyInstance 就是代理类对象
        Human proxyInstance = (Human) ProxyFactory.getProxyInstance(superMan);
        //当通过代理类对象调用方法时,会自动的调用被代理类中同名的方法
        System.out.println(proxyInstance.getBelief());
        proxyInstance.eat("四川麻辣烫");


    }
}
