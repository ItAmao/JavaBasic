package com.amao.demo_用户管理系统.view;

import com.amao.demo_用户管理系统.dao.AddUser;
import com.amao.demo_用户管理系统.model.User;
import com.amao.demo_用户管理系统.service.LoginCheck;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {
    public static Scanner sc = new Scanner(System.in);
    public static User user = new User();
    public static ArrayList<User> userArrayList = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("----------欢迎来到用户管理系统----------");
        while (true) {
            System.out.println("请输入你要进行的操作:1.注册    2.登录    3.退出");
            int firstChoice = sc.nextInt();
            switch (firstChoice) {
                case 1:
                    register(userArrayList, user);
                    break;
                case 2:
                    login(userArrayList, user);
                    break;
                case 3:
                    System.out.println("欢迎下次光临");
                    System.exit(0);
                default:
                    System.out.println("输入有误,请重新输入");
                    break;
            }
        }
    }

    private static void register(ArrayList<User> arr, User user) {
        System.out.println("----------欢迎来到注册页面----------");
        AddUser.addUser(arr, sc);
    }

    private static void login(ArrayList<User> arr, User user) {
        System.out.println("请输入你的用户名:");
        String username = sc.next();
        System.out.println("请输入你的密码:");
        String password = sc.next();
        LoginCheck.Login(arr, user, username, password);
    }
}
