package com.amao.demo02_反射;

import org.junit.Test;

import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 *  反射的作用案例演示
 *
 *  @Author : ItAmao
 *  @Date   : 2020/7/5 10:44
 */
public class Test03 {
    @Test
    public void test1() throws Exception {
        //1.创建工人对象
        Class worker = Class.forName("com.amao.demo02_反射.Worker");
        //2.获取构造方法
        Constructor con1 = worker.getConstructor();
        Object obj1 = con1.newInstance();
        Method m1 = worker.getMethod("work");
        m1.invoke(obj1);

        //读取配置文件
        Properties properties = new Properties();
        //读取
        properties.load(new FileInputStream("jdbc.properties"));
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        System.out.println(user+":"+password);

    }
}
