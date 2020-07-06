package com.amao.demo02_反射;

import com.amao.Ademo_KP.java1.Person;
import com.amao.Ademo_KP.java1.ReflectionTest;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 *  @Author : ItAmao
 *  @Date   : 2020/7/5 19:49
 */
public class Test04 {
    /**
     *  反射第一步:获取Class对象
     *      1.通过类的一个静态成员获取
     *      2.通过该类一个实例,获取该类的Class对象
     *      3.通过Class类的静态方法,强制加载某个类,获取该类的Class对象
     *      4.使用类的加载器 classLoader
     */
    @Test
    public void test1() throws ClassNotFoundException {
        //1.方式一:调用运行时类的属性 .class
        Class clazz1 = com.amao.Ademo_KP.java1.Person.class;
        System.out.println(clazz1);//class com.amao.Ademo_KP.java1.Person

        //2.方式二:通过运行时类的对象
        com.amao.Ademo_KP.java1.Person p1 = new Person();
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
     * Class对象的三个常用方法:
     *      1.public String getName(): 获取当前类Class对象所代表的类的名字(包含包名)
     *      2.public getSimpleName():  获取当前类Class对象所代表的类的名字(不包含包名)
     *      3.public Object newInstance(): 创建当前类Class对象所代表的类的对象
     */
    @Test
    public void test2() throws Exception {
        Class clazz = Class.forName("com.amao.Ademo_KP.java1.Person");
        //获取当前类Class对象所代表的类的名字(包含包名)
        System.out.println(clazz.getName()); //com.amao.demo02_反射.Person

        System.out.println(clazz.getSimpleName());//Person

        Constructor con = clazz.getConstructor();
        Object obj = con.newInstance();
        System.out.println(obj);
    }

    /*
        通过反射获取构造方法&&使用构造方法创建对象
     */
    @Test
    public void test3() throws Exception {
        Class clazz = Class.forName("com.amao.Ademo_KP.java1.Person");
        Constructor con1 = clazz.getConstructor();
        Object obj1 = con1.newInstance();

        Constructor con2 = clazz.getConstructor(String.class, int.class);
        Object obj2 = con2.newInstance("阿毛", 23);
        System.out.println(obj1);
        System.out.println(obj2);

        Constructor con3 = clazz.getDeclaredConstructor(String.class);
        con3.setAccessible(true);
        Object obj3 = con3.newInstance("阿毛");
        System.out.println(obj3);
    }

    /**
     * 通过反射获取成员方法&&调用成员方法【重点】
     */
    @Test
    public void test4() throws Exception {
        Class clazz = Class.forName("com.amao.Ademo_KP.java1.Person");

        Object obj1 = clazz.newInstance();
        Method m1 = clazz.getMethod("show");
        m1.invoke(obj1);

        Method m2 = clazz.getDeclaredMethod("showNation", String.class);
        m2.setAccessible(true);
        m2.invoke(obj1, "中国");
    }

    /**
     * 通过反射获取成员属性【了解,自学】
     */
    @Test
    public void test5() throws Exception {
        Class clazz = Class.forName("com.amao.Ademo_KP.java1.Person");

        Field age = clazz.getField("age");
        Object obj1 = clazz.newInstance();
        age.set(obj1, 23);
        System.out.println(age.get(obj1));

        Field name = clazz.getDeclaredField("name");
        name.setAccessible(true);
        name.set(obj1, "阿毛");
        System.out.println(name.get(obj1));
        System.out.println(obj1);
    }
}
