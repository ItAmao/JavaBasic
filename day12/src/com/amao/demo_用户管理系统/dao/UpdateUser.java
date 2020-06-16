package com.amao.demo_用户管理系统.dao;

import com.amao.demo_用户管理系统.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UpdateUser {
    public static void update(User user, Scanner sc) {
        System.out.println("请输入你要修改的信息:1.修改密码   2.修改个人信息 ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                updatePass(user, sc);
                break;
            case 2:
                updateUser(user, sc);
                break;
            default:
                System.out.println("输入错误,请重新输入");
                break;
        }
    }

    private static void updatePass(User user, Scanner sc) {
        System.out.println("请输入原始密码:");
        String oldPassword = sc.next();
        if (oldPassword.equals(user.getPassword())) {
            System.out.println("请输入新密码:");
            String newPassword = sc.next();
            user.setPassword(newPassword);
            System.out.println("修改密码成功");
        } else {
            System.out.println("密码输入错误,请重新操作");
        }
    }

    private static void updateUser(User user, Scanner sc) {
        System.out.println("请输入你要修改的姓名:");
        String newName = sc.next();
        user.setName(newName);
        System.out.println("请输入你要修改的性别:");
        String gender = sc.next();
        user.setGender(gender);
        System.out.println("请输入你要修改的出生日期:");
        String birthday = sc.next();
        user.setBirthday(birthday);
        System.out.println("修改成功");
    }
}
