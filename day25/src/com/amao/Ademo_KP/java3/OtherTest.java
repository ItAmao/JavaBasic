package com.amao.Ademo_KP.java3;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 *  @Author : ItAmao
 *  @Date   : 2020/7/5 18:19
 */
public class OtherTest {
    /*
        获取构造器结构
     */
    @Test
    public void test1() throws ClassNotFoundException {
        Class clazz = Class.forName("com.amao.Ademo_KP.java2.Person");
        Constructor[] constructors = clazz.getConstructors();
        //getConstructors 获取当前运行时类中声明为public的构造器
        for (Constructor c : constructors) {
            System.out.println(c);
        }

        System.out.println("");
        //getDeclaredConstructors 获取当前运行时类中声明的所有构造器
        Constructor[] declaredConstructors = clazz.getDeclaredConstructors();
        for (Constructor c : declaredConstructors) {
            System.out.println(c);
        }
    }

    /**
     * 获取运行时类的父类
     */
    @Test
    public void test2() throws ClassNotFoundException {
        Class clazz = Class.forName("com.amao.Ademo_KP.java2.Person");

        //获取运行时类的父类
        Class superclass = clazz.getSuperclass();
        System.out.println(superclass);
    }

    /**
     * 获取运行时类带泛型的父类
     */
    @Test
    public void test3() throws ClassNotFoundException {
        Class clazz = Class.forName("com.amao.Ademo_KP.java2.Person");

        //获取运行时类的父类
        Type genericSuperclass = clazz.getGenericSuperclass();
        System.out.println(genericSuperclass);
    }

    /**
     * 获取运行时类带泛型的父类的泛型
     */
    @Test
    public void test4() throws ClassNotFoundException {
        Class clazz = Class.forName("com.amao.Ademo_KP.java2.Person");

        //获取运行时类的父类
        Type genericSuperclass = clazz.getGenericSuperclass();
        ParameterizedType paramType = (ParameterizedType) genericSuperclass;
        //获取泛型参数
        Type[] actualTypeArguments = paramType.getActualTypeArguments();
        System.out.println(actualTypeArguments[0]);
    }

    /**
     * 获取运行时类实现的接口
     */
    @Test
    public void test5() throws ClassNotFoundException {
        Class clazz = Class.forName("com.amao.Ademo_KP.java2.Person");
        Class[] interfaces = clazz.getInterfaces();
        for (Class c : interfaces) {
            System.out.println(c);
        }
        System.out.println("");

        //获取运行时父类所实现的接口
        Class[] interfaces1 = clazz.getSuperclass().getInterfaces();
        for (Class aClass : interfaces1) {
            System.out.println(aClass);
        }
    }

    /**
     * 获取运行时类所在的包
     */
    @Test
    public void test6() throws ClassNotFoundException {
        Class clazz = Class.forName("com.amao.Ademo_KP.java2.Person");

        Package pack = clazz.getPackage();
        System.out.println(pack);
    }

    /**
     * 获取运行时类声明的注解
     */
    @Test
    public void test7() throws ClassNotFoundException {
        Class clazz = Class.forName("com.amao.Ademo_KP.java2.Person");
        Annotation[] annotations = clazz.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }
    }


}
