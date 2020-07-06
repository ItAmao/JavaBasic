package com.amao.Ademo_KP.java1;

import org.junit.Test;

import java.util.Random;

/**
 *  通过反射创建对应的运行时类的对象
 *
 *  @Author : ItAmao
 *  @Date   : 2020/7/4 22:11
 */
public class NewInstanceTest {
    @Test
    public void test1() throws IllegalAccessException, InstantiationException {

        Class clazz = Person.class;
        /*
        newInstance(): 调用此方法,创建对应的运行时类的对象,内部调用Person类空参类构造器

        要想此方法正常的创建运行时类的对象,要求:
        1.运行时类必须提供空参的构造器
        2.空参构造器的访问权限得够 通常,设置为public


        通常在javabean中要求去提供一个public的空参构造器:原因:
        1.便于通过反射,创建运行时对象
        2.便于子类继承次运行时类时,默认调用super()时,保证父类有`此构造器

         */
        Person obj = (Person) clazz.newInstance();//调用Person的空参构造器
        System.out.println(obj);//Person{name='null', age=0}

    }

    /**
     * 体会反射的动态性
     */
    @Test
    public void test2() throws Exception {
        int num = new Random().nextInt(3);
        String classPath = "";
        switch (num) {
            case 0:
                classPath = "java.util.Date";
                break;
            case 1:
                classPath = "java.lang.Object";
                break;
            case 2:
                classPath = "com.amao.Ademo_KP.java1.Person";
                break;
        }
        Object obj = getInstance(classPath);
        System.out.println(obj);
    }

    /*
    创建一个指定类的对象
        classPath:指定类的全类名
     */
    public Object getInstance(String classPath) throws Exception {
        Class clazz = Class.forName(classPath);
        return clazz.newInstance();
    }

}
