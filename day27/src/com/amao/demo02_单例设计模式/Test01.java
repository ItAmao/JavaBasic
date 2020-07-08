package com.amao.demo02_单例设计模式;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/**
 *  @Author : ItAmao
 *  @Date   : 2020/7/7 09:04
 */
public class Test01 {
    @Test
    public void test() {
        //Person p = new Person();
        Person p1 = Person.getInstance();
        Person p2 = Person.getInstance();
        System.out.println(p1 == p2);
    }

    /**
     * 饿汉模式
     * 不加final
     */
    @Test
    public void test2() throws Exception {
        Class clazz = Class.forName("com.amao.demo02_单例设计模式.Person");
        Constructor con1 = clazz.getDeclaredConstructor();
        con1.setAccessible(true);
        Object obj1 = con1.newInstance();
        System.out.println(obj1);//com.amao.demo02_单例设计模式.Person@20fa23c1
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            Person person = (Person) field.get(Person.getInstance());
            Person person1 = Person.getInstance();
            System.out.println("拿到单例模式创建的对象: " + person);
            System.out.println(person1);
            field.set(Person.getInstance(), obj1); //把反射创建出来的对象赋值给单例对象
            System.out.println("第二次拿到单例模式创建的对象: " + Person.getInstance());
        }
      /*
                com.amao.demo02_单例设计模式.Person@20fa23c1
                拿到单例模式创建的对象: com.amao.demo02_单例设计模式.Person@6aa8ceb6
                第二次拿到单例模式创建的对象: com.amao.demo02_单例设计模式.Person@20fa23c1
         */

    }

    /**
     *  加了final之后
     *  报错了
     */
    @Test
    public void test3() throws Exception {
        Class clazz = Class.forName("com.amao.demo02_单例设计模式.Person");
        Constructor con1 = clazz.getDeclaredConstructor();
        con1.setAccessible(true);
        Object obj1 = con1.newInstance();
        System.out.println(obj1);//com.amao.demo02_单例设计模式.Person@20fa23c1
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            Person person = (Person) field.get(Person.getInstance());
            System.out.println("拿到单例模式创建的对象: " + person);
            field.set(Person.getInstance(), obj1); //把反射创建出来的对象赋值给单例对象
            System.out.println("第二次拿到单例模式创建的对象: " + Person.getInstance());
        }
    }
}
