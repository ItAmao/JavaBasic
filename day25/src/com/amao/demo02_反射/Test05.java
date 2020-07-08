package com.amao.demo02_反射;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * 反射总结:
 *
 *  @Author : ItAmao
 *  @Date   : 2020/7/8 09:41
 */
public class Test05 {
    /*
        反射第一步,获取字节码对象文件
     */
    @Test
    public void test1() throws ClassNotFoundException {
        //1.通过类的一个静态成员获取
        Class<Person> clazz1 = Person.class;
        System.out.println(clazz1);
        //2.通过该类的实例,获取该类的class对象
        Coder c1 = new Coder();
        Class<? extends Coder> clazz2 = c1.getClass();
        System.out.println(clazz2);
        //3.通过Class的静态方法forName,强制加载某个类,获取该类的Class对象
        Class<?> clazz3 = Class.forName("com.amao.demo02_反射.Coder");
        System.out.println(clazz3);
        //4.使用类加载器
        ClassLoader classLoader = Test05.class.getClassLoader();
        Class<?> clazz4 = classLoader.loadClass("com.amao.demo02_反射.Coder");
        System.out.println(clazz4);
    }

    /**
     * Class对象中三种常用方法
     * public String getName();//获取当前Class对象所代表的类的名字
     * public String getSimpleName();//获取当前Class对象所代表的类的名字
     * public Object newInstance();//获取当前类class对象所代表的类的对象,相当于创建对象
     *
     */
    @Test
    public void test2() throws Exception {
        Class<?> clazz = Class.forName("com.amao.demo02_反射.Coder");
        String name = clazz.getName();
        System.out.println(name);

        String name1 = clazz.getSimpleName();
        System.out.println(name1);

        Coder coder = new Coder();
        Object obj = clazz.newInstance();
        System.out.println(obj);
    }

    /**
     * 通过反射获取构造方法,通过构造方法创建对象
     */
    @Test
    public void test3() throws Exception {
        //1.获取字节码对象
        Class<?> clazz = Class.forName("com.amao.demo02_反射.Coder");
        //2.获取对象中的构造方法
        //获取无参数构造器
        Constructor<?> c1 = clazz.getConstructor();
        //获取有参构造器
        Constructor<?> c2 = clazz.getConstructor(String.class, int.class);
        Object obj1 = c1.newInstance();
        System.out.println(obj1);
        Object obj2 = c2.newInstance("阿毛", 23);
        System.out.println(obj2);
    }

    /*
        通过反射获取成员方法和调用成员方法
     */
    @Test
    public void test4() throws Exception {
        //1.获取字节码对象
        Class<?> clazz = Class.forName("com.amao.demo02_反射.Coder");

        //2.获取
        Object obj1 = clazz.newInstance();
        Method m1 = clazz.getMethod("work");
        m1.invoke(obj1);
    }
}
