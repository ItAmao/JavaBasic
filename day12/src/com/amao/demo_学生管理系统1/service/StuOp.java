package com.amao.demo_学生管理系统1.service;

import com.amao.demo_学生管理系统1.dao.Utils;
import com.amao.demo_学生管理系统1.model.Student;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 学生管理操作
 */
public class StuOp implements Operatable<Student> {
    /**
     * 查询操作
     *
     * @param list
     * @param sc
     */
    @Override
    public void selectAll(ArrayList<Student> list, Scanner sc) {
        System.out.println("查询结果:");
        if (list.isEmpty()) {
            System.out.println("无数据");
        }
        Utils.printPersonArrayList(list);
    }

    /**
     * 添加操作
     *
     * @param list
     * @param sc
     */
    @Override
    public void addInfor(ArrayList<Student> list, Scanner sc) {
        System.out.println("请输入添加学生的名字:");
        String name = sc.next();
        System.out.println("请输入学生的性别:");
        String gender = sc.next();
        System.out.println("请输入出生日期(yyyy-MM-dd):");
        String birthday = sc.next();
        list.add(new Student(Utils.stuId++, name, gender, birthday));
        System.out.println("【成功】学生信息添加成功!");
    }

    /**
     * 删除操作
     *
     * @param list
     * @param sc
     */
    @Override
    public void removeInfor(ArrayList<Student> list, Scanner sc) {
        System.out.println("请输入你要删除的学生id");
        int reId = sc.nextInt();
        //先查询
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            if (stu.getId() == reId) {
                System.out.println("【查询结果】要删除的学员信息:");
                Utils.printPerson(stu);
                list.remove(i);
                System.out.println("【成功】数据已被删除!");
                return;
            } else {
                System.out.println("【失败】查无此人!");
                return;
            }
        }
    }

    /**
     * 更新操作
     *
     * @param list
     * @param sc
     */
    @Override
    public void updateInfor(ArrayList<Student> list, Scanner sc) {
        System.out.println("请输入要修改的学员ID:");
        int updId = sc.nextInt();
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            if (stu.getId() == updId) {
                System.out.println("【查询结果】要更改的学员信息:");
                Utils.printPerson(stu);
                System.out.println("请输入你要修改的姓名:");
                String newName = sc.next();
                stu.setName(newName);
                System.out.println("请输入你要修改的性别:");
                String newGender = sc.next();
                stu.setGender(newGender);
                System.out.println("请输入新出生日期(yyyy-MM-dd)(保留原值输入0):");
                String newBirthday = sc.next();
                stu.setBirthday(newBirthday);
                System.out.println("【成功】学员信息修改成功!");
                return;
            } else {
                System.out.println("查无此人");
                return;
            }
        }
    }
}
