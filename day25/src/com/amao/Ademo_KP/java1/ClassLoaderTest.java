package com.amao.Ademo_KP.java1;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 了解类的加载器
 *
 *  @Author : ItAmao
 *  @Date   : 2020/7/4 21:51
 */
public class ClassLoaderTest {
    @Test
    public void test1() {
        //获取到当前自定义类的类的加载器是谁
        //对于自定义类,使用系统类加载器进行加载
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        //sun.misc.Launcher$AppClassLoader@18b4aac2  系统类加载器
        System.out.println(classLoader);

        //调用系统类加载器的getParent方法,可以获得扩展类加载器
        ClassLoader parent = classLoader.getParent();
        //sun.misc.Launcher$ExtClassLoader@6b884d57 扩展类加载器
        System.out.println(parent);

        //调用扩展类加载器的getParent():无法获取引导类加载器
        //引导类加载器主要负责java的核心类库,无法加载自定义类
        ClassLoader parent1 = parent.getParent();
        //扩展类加载器上一层是引导类加载器,但是jvm不让你获取
        System.out.println(parent1);//null

        //String 是引导类加载器帮我们加载的,无法获取
        ClassLoader classLoader1 = String.class.getClassLoader();
        System.out.println(classLoader1);

    }

    /**
     * Properties:用来读取配置文件
     */
    @Test
    public void test2() throws IOException {
        Properties pros = new Properties();
        //此时的文件默认在当前的module下
        //读取配置文件的方式一:
//1.      FileInputStream fis = new FileInputStream("jdbc.properties");
//        pros.load(fis);

        //读取配置文件的方式二:使用ClassLoader
        //配置文件默认识别为当前module的src下
        //使用系统类加载器
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        //InputStream is = classLoader.getResourceAsStream("jdbc.properties");
        InputStream is = classLoader.getResourceAsStream("jdbc1.properties");
        //报空指针异常,因为此时的文件不能在module下 应该在src下
        pros.load(is);


        String user = pros.getProperty("user");
        String password = pros.getProperty("password");
        System.out.println(user + ":" + password);
    }
}
