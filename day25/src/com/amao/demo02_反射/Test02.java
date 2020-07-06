package com.amao.demo02_反射;

import org.junit.Test;

import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 *  练习
 *
 *  @Author : ItAmao
 *  @Date   : 2020/7/5 10:22
 */
public class Test02 {
    @Test
    public void test1() throws Exception {
        //获取字节码对象
        Class clazz1 = Class.forName("com.amao.demo02_反射.Person");

        //获取空参构造
        Constructor con1 = clazz1.getConstructor();

        //获取有参构造
        Constructor con2 = clazz1.getConstructor(String.class, int.class);

        Constructor con3 = clazz1.getDeclaredConstructor(String.class);
        con3.setAccessible(true);

        //执行构造方法创建对象
        Object obj1 = con1.newInstance();
        Object obj2 = con2.newInstance("阿毛", 23);
        Object obj3 = con3.newInstance("阿毛");

        //调用方法
        Method m1 = clazz1.getMethod("show", String.class);
        m1.invoke(obj1, "阿毛");

        //调用方法
        Method m2 = clazz1.getMethod("show2");
        m2.invoke(obj1);

        //调用方法
        Method m3 = clazz1.getDeclaredMethod("showNation", String.class);
        m3.setAccessible(true);
        m3.invoke(obj3, "中国");

    }

    @Test
    public void test2() throws Exception {
        //1.读取配置文件
        Properties properties = new Properties();
        properties.load(new FileInputStream("config.properties"));
        //2.获取键值
        String clazz = properties.getProperty("class");
        String method = properties.getProperty("method");
        String setName = properties.getProperty("setName");
        String setAge = properties.getProperty("setAge");
        String getName = properties.getProperty("getName");
        String getAge = properties.getProperty("getAge");
        //3.获取字节码对象
        Class c = Class.forName(clazz);
        //4.获取构造方法
        Constructor con1 = c.getConstructor();
        //5.创建对象
        Object obj1 = con1.newInstance();
        //6.调用方法
        Method m1 = c.getMethod(method);
        m1.invoke(obj1);

        Method m2 = c.getMethod(setName, String.class);
        m2.invoke(obj1, "阿毛");
        Method m3 = c.getMethod(setAge, int.class);
        m3.invoke(obj1, 23);
        Method m4 = c.getMethod(getName);
        String name = (String) m4.invoke(obj1);
        System.out.println(obj1);
        Method m5 = c.getMethod(getAge);
        int age =(int) m5.invoke(obj1);
        System.out.println(name);
        System.out.println(age);
    }
}
