package com.amao.Ademo_KP.java1;

import org.junit.Test;

import java.lang.annotation.ElementType;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 *
 *
 *
 *  @Author : ItAmao
 *  @Date   : 2020/7/4 16:37
 */
public class ReflectionTest {

    //反射之前,对于Person类的操作
    @Test
    public void test1() {
        //1.创建Person对象
        Person p1 = new Person("Tom", 12);
        //2.通过对象调用其内部的属性和方法
        p1.age = 10;
        System.out.println(p1.toString());

        p1.show();

        //在Person类外部,不可以通过Person类的对象去调用其内部私有的结构的.
    }

    //反射之后.对于Person类的操作
    @Test
    public void test2() throws Exception {

        Class clazz = Person.class;
        //1.通过反射,创建Person对象
        Constructor cons = clazz.getConstructor(String.class, int.class);
        Object obj = cons.newInstance("Tom", 12);
        System.out.println(obj);//调用toString方法
        Person p = (Person) obj;
        System.out.println(p);

        //2.通过反射,调用对象指定的属性和指定的方法
        //属性
        Field age = clazz.getDeclaredField("age");
        age.set(p, 10);
        System.out.println(p);
        //方法
        Method show = clazz.getDeclaredMethod("show");
        show.invoke(p);

        //3.通过反射,可以调用Person类的私有结构,
        //私有的构造器
        Constructor con1 = clazz.getDeclaredConstructor(String.class);
        con1.setAccessible(true);
        Person p1 = (Person) con1.newInstance("Jerry");
        System.out.println(p1);

        //私有的属性
        Field name = clazz.getDeclaredField("name");
        name.setAccessible(true);
        name.set(p1, "阿毛");
        System.out.println(p1);

        //调用私有的方法
        Method showNation = clazz.getDeclaredMethod("showNation", String.class);
        showNation.setAccessible(true);
        String nation = (String) showNation.invoke(p1, "中国");
        System.out.println(nation);
    }
    //疑问:通过直接new的方式,或反射的方式,都可以调用公共的结构,开发中到底用哪个
    //建议:直接new的方式
    //什么时候使用反射: 反射的特征:动态性  1.编译的时候不知道要new谁, 2.编译的时候确定不下来造哪个类的对象
    //疑问: 反射机制与面向对象的封装性是不是矛盾的,如何看待?
    //不矛盾,

//    封装是静态的，反射是动态的
//    JAVA反射机制是在运行状态中，对于任意一个类，都能够知道这个类的所有属性和方法；
//    对于任意一个对象，都能够调用它的任意一个方法和属性；这种动态获取的信息以及动态调用对象的方法的功能称为java语言的反射机制。

    /**
     * 获取Class实例的方式
     */
    @Test
    public void test3() throws ClassNotFoundException {
        //1.方式一:调用运行时类的属性 .class
        Class clazz1 = Person.class;
        System.out.println(clazz1);//class com.amao.Ademo_KP.java1.Person

        //2.方式二:通过运行时类的对象
        Person p1 = new Person();
        Class clazz2 = p1.getClass();
        System.out.println(clazz2);//class com.amao.Ademo_KP.java1.Person

        //3.方式三:调用Class的静态方法 forName(String classPath);
        Class clazz3 = Class.forName("com.amao.Ademo_KP.java1.Person");//类的全类名
        Class<?> clazz4 = Class.forName("java.lang.String");
        System.out.println(clazz3);//class com.amao.Ademo_KP.java1.Person
        System.out.println(clazz4);

        System.out.println(clazz1 == clazz2);   //true
        System.out.println(clazz1 == clazz3);   //true

        //4.方式四:使用类的加载器 classLoader
        ClassLoader classLoader = ReflectionTest.class.getClassLoader();
        Class clazz5 = classLoader.loadClass("com.amao.Ademo_KP.java1.Person");
        System.out.println(clazz5);//class com.amao.Ademo_KP.java1.Person
        System.out.println(clazz1 == clazz5);//true

    }


    /**
     * Class实际可以是哪些结构的说明
     */
    @Test
    public void test4() {
        Class c1 = Object.class;
        Class c2 = Comparable.class;
        Class c3 = String[].class;
        Class c4 = int[][].class;
        Class c5 = ElementType.class;
        Class c6 = Override.class;
        Class c7 = int.class;
        Class c8 = void.class;
        Class c9 = Class.class;
        int[] a = new int[10];
        int[] b = new int[100];
        Class c10 = a.getClass();
        Class c11 = b.getClass();
        // 只要元素类型与维度一样，就是同一个Class
        System.out.println(c10 == c11); //true
    }
}
