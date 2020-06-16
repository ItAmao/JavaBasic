package com.amao.demo_用户管理系统.dao;

import com.amao.demo_用户管理系统.model.User;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 删除用户
 */
public class DeleteUser {
    public static void delete(ArrayList<User> list, Scanner sc) {
        System.out.println("请输入你要删除的id");
        int a = 0;
        int remId = sc.nextInt();
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            //System.out.println(user.getId());
            if (user.getId() == remId) {
                a++;
                System.out.println("你要删除的学生信息如下:");
                Utils.printUser(user);
                list.remove(i);
                System.out.println("删除成功");
            }
        }
        if (a == 0) {
            System.out.println("查无此人");
        }

    }
}
