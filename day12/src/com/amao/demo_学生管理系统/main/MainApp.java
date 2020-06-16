package com.amao.demo_学生管理系统.main;

import com.amao.demo_学生管理系统.student.Student;
import com.amao.demo_学生管理系统.teacher.Teacher;
import com.amao.demo_学生管理系统.utils.Utils;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 启动类
 *
 * @author mao
 */
public class MainApp {
    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<Student> students = new ArrayList<>();
    public static ArrayList<Teacher> teachers = new ArrayList<>();

    public static void main(String[] args) {
        //1.显示一级菜单
        System.out.println("----------欢迎来到学生管理系统----------");
        while (true) {
            System.out.println("1.学生    2.教师    3.退出");
            //2.用户选择
            int firstChoice = sc.nextInt();
            switch (firstChoice) {
                case 1:
                    enterStudentManagerSystem();
                    break;
                case 2:
                    enterTeacherManagerSystem();
                    break;
                case 3:
                    System.out.println("----------再见👋----------");
                    System.exit(0);
                default:
                    System.out.println("输入有误,请重新输入");
                    break;
            }
        }
    }

    /**
     * 进入学生管理系统
     */
    public static void enterStudentManagerSystem() {
        System.out.println("【学员信息管理】");
        System.out.println("1.添加学员 2.修改学员 3.删除学员 4.查询学员 5.返回");
        System.out.print("请输入功能序号:");
        int stuChoice = sc.nextInt();
        switch (stuChoice) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            default:
                break;

        }

    }

    public static void addStu() {
        /*
            姓名
            性别
            生日
            创建学生对象(传入的对象主键自增长)
            添加到集合中
         */

        System.out.println("添加成功");
    }

    public static void selectStu() {
        Utils.printArratList(students);
    }

    public static void removeStu() {


    }

    /**
     * 进入老师管理系统
     */
    public static void enterTeacherManagerSystem() {
        System.out.println("教师管理系统");

    }
}
