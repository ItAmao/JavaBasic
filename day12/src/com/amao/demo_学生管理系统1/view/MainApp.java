package com.amao.demo_学生管理系统1.view;

import com.amao.demo_学生管理系统1.model.Student;
import com.amao.demo_学生管理系统1.model.Teacher;
import com.amao.demo_学生管理系统1.service.Operatable;
import com.amao.demo_学生管理系统1.service.StuOp;
import com.amao.demo_学生管理系统1.service.TeaOp;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {
    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<Student> stu = new ArrayList<Student>();
    public static ArrayList<Teacher> teachers = new ArrayList<>();

    public static void main(String[] args) {
        //显示一级菜单
        System.out.println("----------欢迎来到学生管理系统----------");
        while (true) {
            System.out.println("1.学生    2.教师    3.退出");
            int firstChoice = sc.nextInt();
            switch (firstChoice) {
                case 1:
                    studentManage(stu, sc);
                    break;
                case 2:
                    teacherManage();
                    break;
                case 3:
                    System.out.println("----------再见👋----------");
                    //直接退出虚拟机
                    System.exit(0);
                default:
                    System.out.println("输入错误,请重新输入");
                    break;
            }
        }
    }

    public static void studentManage(ArrayList<Student> stu, Scanner sc) {
        System.out.println("----------欢迎来到学生管理系统---------");
        //创建学生操作对象
        Operatable<Student> op = new StuOp();
        //创建二级菜单学生管理菜单
        while (true) {
            System.out.println("----------------------------------------");
            System.out.println("1.添加学员 2.修改学员 3.删除学员 4.查询学员 5.返回上一层");
            System.out.println("请输入你要进行的操作:");
            int secondChoice = sc.nextInt();
            switch (secondChoice) {
                case 1:
                    op.addInfor(stu, sc);
                    break;
                case 2:
                    op.updateInfor(stu, sc);
                    break;
                case 3:
                    op.removeInfor(stu, sc);
                    break;
                case 4:
                    op.selectAll(stu, sc);
                    break;
                case 5:
                    return;
                default:
                    System.out.println("输入错误,请重新输入~");
                    break;
            }
        }
    }

    public static void teacherManage() {
        System.out.println("----------教师管理系统----------");
        //创建教师操作
        Operatable<Teacher> tea = new TeaOp();
        //创建二级菜单
        while (true) {
            System.out.println("1.添加教师 2.修改教师 3.删除教师 4.查询教师 5.返回上一层");
            System.out.println("请输入你要进行的操作:");
            int secondChoice = sc.nextInt();
            switch (secondChoice) {
                case 1:
                    tea.addInfor(teachers, sc);
                    break;
                case 2:
                    tea.updateInfor(teachers, sc);
                    break;
                case 3:
                    tea.removeInfor(teachers, sc);
                    break;
                case 4:
                    tea.selectAll(teachers, sc);
                    break;
                case 5:
                    return;
                default:
                    System.out.println("请重新输入:");
                    break;
            }
        }
    }
}
