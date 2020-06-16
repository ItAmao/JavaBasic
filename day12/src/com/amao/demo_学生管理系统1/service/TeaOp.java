package com.amao.demo_学生管理系统1.service;

import com.amao.demo_学生管理系统1.dao.Utils;
import com.amao.demo_学生管理系统1.model.Teacher;

import java.util.ArrayList;
import java.util.Scanner;

public class TeaOp implements Operatable<Teacher> {

    @Override
    public void selectAll(ArrayList<Teacher> list, Scanner sc) {
        System.out.println("查询结果");
        if (list.isEmpty()) {
            System.out.println("无数据");
        }
        Utils.printPersonArrayList(list);
    }

    @Override
    public void addInfor(ArrayList<Teacher> list, Scanner sc) {
        System.out.println("请输入教师的姓名:");
        String name = sc.next();
        System.out.println("请输入教师的性别:");
        String gender = sc.next();
        System.out.println("请输入出生日期(yyyy-MM-dd):");
        String birthday = sc.next();
        list.add(new Teacher(Utils.teaId++, name, gender, birthday));
        System.out.println("【成功】教师信息添加成功!");
    }

    @Override
    public void removeInfor(ArrayList<Teacher> list, Scanner sc) {
        System.out.println("请输入你要删除的教师id:");
        int remId = sc.nextInt();
        for (int i = 0; i < list.size(); i++) {
            Teacher teacher = list.get(i);
            if (teacher.getId() == remId) {
                System.out.println("你要删除的教师信息如下:");
                Utils.printPerson(teacher);
                list.remove(i);
                System.out.println("【成功】数据已被删除!");
                return;
            } else {
                System.out.println("【失败】查无此人!");
                return;
            }
        }
    }

    @Override
    public void updateInfor(ArrayList<Teacher> list, Scanner sc) {
        System.out.println("请输入你要修改的教师id:");
        int updId = sc.nextInt();
        for (int i = 0; i < list.size(); i++) {
            Teacher teacher = list.get(i);
            if (teacher.getId() == updId) {
                System.out.println("你要修改的教师信息如下:");
                Utils.printPerson(teacher);
                System.out.println("请输入你要修改的姓名:");
                String newName = sc.next();
                teacher.setName(newName);
                System.out.println("请输入你要修改的性别:");
                String newGender = sc.next();
                teacher.setGender(newGender);
                System.out.println("请输入新出生日期(yyyy-MM-dd)(保留原值输入0):");
                String newBirthday = sc.next();
                teacher.setBirthday(newBirthday);
                System.out.println("【成功】学员信息修改成功!");
                return;
            } else {
                System.out.println("查无此人");
                return;
            }
        }
    }
}
