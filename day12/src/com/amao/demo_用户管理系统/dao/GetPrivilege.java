package com.amao.demo_用户管理系统.dao;

import com.amao.demo_用户管理系统.model.User;

import java.util.Scanner;

public class GetPrivilege {
    public static void setPrivilege(User user, Scanner sc) {
        System.out.println("请输入设置超级管理员密码:");
        String superPassword = sc.next();
        if (superPassword.equals("123456")) {
            user.setCompetence(1);
            System.out.println("请重新登录你的账户,才能使用超级管理员权限");
        } else {
            System.out.println("死一边去");
        }
    }
}
