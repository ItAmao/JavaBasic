package com.amao.demo_用户管理系统.dao;

import com.amao.demo_用户管理系统.model.User;

import java.util.ArrayList;
import java.util.Scanner;

public class SelectAll {
    public static void select(ArrayList<User> list, User user) {
        System.out.println("1.查询全部学生    2.根据id查学生   3.返回上一级操作");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                Utils.printAllUser(list);
                break;
            case 2:
                Utils.printUser(list, sc);
                break;
            case 3:
                return;
            default:
                System.out.println("请输入正确的数字:");
                break;
        }
    }
}
