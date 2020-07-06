package com.amao.demo03_注解;

import org.junit.Test;

import java.lang.reflect.Constructor;

/**
 * a.获取注解所在类的Class对象
 * b.获取出注解所在的那个对象(构造,成员方法,成员变量)
 * c.判断b中那个对象上是否有我们想要的注解
 * d.获取到我们想要的注解,在进一步获取注解的属性值
 *
 *  @Author : ItAmao
 *  @Date   : 2020/7/5 20:37
 */
public class BookTest {
    @Test
    public void test() throws Exception {
        //1.获取注解所在类的Class对象
        Class clazz = Class.forName("com.amao.demo03_注解.BookDemo");
        //2.获取出注解所在的那个对象
        Object obj1 = clazz.newInstance();
        Constructor con1 = clazz.getConstructor();
        //3.判断从con1那个对象上是否有我们想要的注解

        boolean b = con1.isAnnotationPresent(Book.class);
        if (b) {
            //如果注解存在,获取到我们想要的注解,在进一步获取注解的属性值
            Book book = (Book) con1.getAnnotation(Book.class);
            System.out.println(book.name());
            System.out.println(book.price());
            String[] author = book.author();
            for (String s : author) {
                System.out.println(s);
            }
        } else {
            System.out.println("没有该注解");
        }
    }
}
