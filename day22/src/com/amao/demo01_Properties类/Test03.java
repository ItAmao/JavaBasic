package com.amao.demo01_Properties类;

import java.io.*;
import java.util.Properties;

/**
 *  读取数据
 *
 *  @Author : ItAmao
 *  @Date   : 2020/6/30 09:21
 */
public class Test03 {
    public static void main(String[] args) throws IOException {
        //1.创建Properties对象
        Properties properties = new Properties();
        //2.设置属性值
        properties.setProperty("username", "ItAmao");
        properties.setProperty("password", "123");
        //3.保存数据
        String path = "/Users/mao/Documents/code/basic/day22/src/com/amao/demo01_Properties类/3.txt";
        properties.store(new FileOutputStream(path), "This is a txt");
        //注意:注释内容必须为英文,中文的话不会正常显示

        //4.读取文件操作
        Properties properties1 = new Properties();
        //加载文件
        properties1.load(new FileInputStream(path));
        //把读取到的文件内容打印到控制台
        System.out.println(properties1);

    }
}
