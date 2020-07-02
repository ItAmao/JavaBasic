package com.amao.demo01_Properties类;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 *  写数据
 *
 *  @Author : ItAmao
 *  @Date   : 2020/6/30 09:09
 */
public class Test02 {
    public static void main(String[] args) throws IOException {
        //创建Properties属性集对象
        Properties properties = new Properties();
        //添加键值对
        properties.setProperty("username", "ItAmao");
        properties.setProperty("password", "123");
        //打印属性集对象
        System.out.println(properties);
        //store() 可以吧集合中的键值对输出到文件中
        String path = "/Users/mao/Documents/code/basic/day22/src/1.properties";
        //第一个参数是输出流,第二个参数是字符串备注信息
        //文件的后缀的些什么都行,但是.properties是专用的配置文件格式
        properties.store(new FileWriter(path), "");



    }
}
