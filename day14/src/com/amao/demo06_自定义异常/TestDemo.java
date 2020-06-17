package com.amao.demo06_自定义异常;

import java.util.Scanner;

public class TestDemo {
    public static void main(String[] args) {
        //1.提示
        System.out.println("请输入您注册的用户名:");
        String name = new Scanner(System.in).nextLine();
        //2.调用方法
        try {
            register(name);
        } catch (RegisterException e) {
            e.printStackTrace();
        }
    }

    //定义方法,用户注册
    public static void register(String username)throws RegisterException{
        //假设"rose"已经被注册
        if ("rose".equals(username)) {
            throw new RegisterException("您要注册的"+username+"已经存在...");
        }else{
            System.out.println("恭喜您"+username+"注册成功~~");
        }
    }

}
