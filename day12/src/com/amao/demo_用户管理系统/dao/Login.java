package com.amao.demo_用户管理系统.dao;

import com.amao.demo_用户管理系统.model.User;

import java.util.ArrayList;
import java.util.Scanner;

public class Login {
    public static void successLogin(ArrayList<User> list, User user) {
        if (user.getCompetence() == 1) {
            superLogin(list, user);
        } else {
            commonLogin(user);
        }
    }

    private static void commonLogin(User user) {
        Scanner sc = new Scanner(System.in);
        System.out.println("欢迎你:" + user.getName() + "用户");
        while (true) {
            System.out.println("请输入你要进行的操作:1.查看个人信息     2.修改个人信息    3.是否设为超级管理员     4.退出");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    Utils.printUser(user);
                    break;
                case 2:
                    UpdateUser.update(user, sc);
                    break;
                case 3:
                    GetPrivilege.setPrivilege(user, sc);
                    break;
                case 4:
                    System.out.println("再见");
                    return;
                default:
                    System.out.println("输入有误,请重新输入");
                    break;
            }
        }
    }

    private static void superLogin(ArrayList<User> list, User user) {
        Scanner sc = new Scanner(System.in);
        System.out.println("欢迎你尊贵的:" + user.getName() + "管理员");
        while (true) {
            System.out.println("请输入你要进行的操作:1.查看个人信息     2.修改个人信息    3.查看信息      4.删除学生      5.添加学生      6.退出");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    Utils.printUser(user);
                    break;
                case 2:
                    UpdateUser.update(user, sc);
                    break;
                case 3:
                    SelectAll.select(list, user);
                    break;
                case 4:
                    DeleteUser.delete(list, sc);
                    break;
                case 5:
                    AddUser.addUser(list, sc);
                    break;
                case 6:
                    System.out.println("尊贵的管理员您走好");
                    return;
                default:
                    System.out.println("输入有误,请重新输入");
                    break;
            }
        }
    }
}
