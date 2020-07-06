package com.amao.Ademo_KP.java3;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 *  获取当前运行时类的属性结构
 *
 *  @Author : ItAmao
 *  @Date   : 2020/7/5 17:45
 */
public class FieldTest {
    @Test
    public void test1() throws ClassNotFoundException {
        Class clazz = Class.forName("com.amao.Ademo_KP.java2.Person");

        //获取属性结构
        //getFields:获取当前运行时类,及其父类中声明为public访问权限的属性
        Field[] fields = clazz.getFields();
        for (Field f : fields) {
            System.out.println(f);
        }
        System.out.println("");

        //getDeclaredFields() : 获取当前运行时类当中,声明的所有属性,(不包含父类中声明的属性)
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field f : declaredFields) {
            System.out.println(f);
        }
    }

    //权限修饰符,数据类型,变量名 = ...
    @Test
    public void test2() throws ClassNotFoundException {
        Class clazz = Class.forName("com.amao.Ademo_KP.java2.Person");
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field f : declaredFields) {
            //1.权限修饰符
            int modifier = f.getModifiers();
            //System.out.println(modifier); //2   0   1
            System.out.println(Modifier.toString(modifier));

            //2.数据类型
            Class type = f.getType();
            System.out.println(type.getName());

            //3.变量名
            String fName = f.getName();
            System.out.println(fName);

            System.out.println("");
        }

    }



}
