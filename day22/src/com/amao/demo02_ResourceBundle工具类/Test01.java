package com.amao.demo02_ResourceBundle工具类;


import java.util.ResourceBundle;

/**
 *  @Author : ItAmao
 *  @Date   : 2020/6/30 09:41
 */
public class Test01 {
    public static void main(String[] args) {
        //1.创建ResourceBundle对象,
        ResourceBundle resourceBundle = ResourceBundle.getBundle("1");
        System.out.println(resourceBundle);
        //2.获取值
        String username = resourceBundle.getString("username");
        String password = resourceBundle.getString("password");
        System.out.println(username + ":" + password);

    }
}
