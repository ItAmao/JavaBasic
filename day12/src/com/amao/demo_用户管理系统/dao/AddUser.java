package com.amao.demo_用户管理系统.dao;

import com.amao.demo_用户管理系统.model.User;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 注册用户
 */
public class AddUser {
    public static void addUser(ArrayList<User> list, Scanner sc) {
        System.out.println("请输入你的用户名:");
        String username = sc.next();
        System.out.println("请输入你的密码:");
        String password = sc.next();
        System.out.println("请输入你的名字:");
        String name = sc.next();
        System.out.println("请输入你的性别:");
        String gender = sc.next();
        System.out.println("请输入你的生日(yyyy-MM-dd):");
        String birthday = sc.next();
        list.add(new User(Utils.userId++, username, password, name, gender, birthday, 0));
        System.out.println("添加成功");
    }
}
