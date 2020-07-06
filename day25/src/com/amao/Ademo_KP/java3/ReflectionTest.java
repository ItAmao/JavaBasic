package com.amao.Ademo_KP.java3;

import com.amao.Ademo_KP.java2.Person;
import org.junit.Test;

import java.lang.reflect.Field;

/**
 * 调用运行时类中指定的结构 属性 方法 构造器
 *
 *  @Author : ItAmao
 *  @Date   : 2020/7/5 18:40
 */
public class ReflectionTest {
    @Test
    public void testField() throws Exception {
        Class clazz = Class.forName("com.amao.Ademo_KP.java2.Person");

        //创建运行时类的对象
        Person p = (Person) clazz.newInstance();

        //获取指定的属性
        Field id = clazz.getField("id");

        //设置当前属性的值
        id.set(p, 1001);

    }

}
