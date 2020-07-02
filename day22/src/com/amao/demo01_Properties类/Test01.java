package com.amao.demo01_Properties类;

import java.util.Properties;
import java.util.Set;

/**
 *  @Author : ItAmao
 *  @Date   : 2020/6/30 09:00
 */
public class Test01 {
    public static void main(String[] args) {
        //1.创建Properties类 对象
        Properties properties = new Properties();//注意,虽然它是一个集合,但是它不需要写泛型,默认String类型

        //2.成员方法

        //2.1添加键值对(字符串) 致电Hashtable方法 put 。
        properties.setProperty("username", "ItAmao");
        properties.setProperty("password", "123");
        //存储无序
        System.out.println(properties);//{password=123, username=ItAmao}

        //2.2 根据键获取值 使用此属性列表中指定的键搜索属性。getProperty(String key)
        String username = properties.getProperty("username");
        System.out.println(username);

        //2.3返回此属性列表中的一组键，其中键及其对应的值为字符串，包括默认属性列表中的不同键，
        // 如果尚未从主属性列表中找到相同名称的键。
        //获取键的操作
        Set<String> strings = properties.stringPropertyNames();
        //循环获取键值
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
