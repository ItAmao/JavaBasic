package com.amao.demo_用户管理系统.service;

import com.amao.demo_用户管理系统.dao.Login;
import com.amao.demo_用户管理系统.model.User;

import java.util.ArrayList;

public class LoginCheck {
    public static void Login(ArrayList<User> list, User user, String username, String password) {
        //System.out.println(list.size());
        int a = 0;
        for (int i = 0; i < list.size(); i++) {
            user = list.get(i);
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                a++;
                System.out.println("登录成功");
                Login.successLogin(list, user);
            }
        }
        if (a == 0) {
            System.out.println("用户名或密码错误");
        }
    }

}
