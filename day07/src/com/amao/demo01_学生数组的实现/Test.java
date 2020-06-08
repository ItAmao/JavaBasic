package com.amao.demo01_学生数组的实现;

import com.amao.demo05_ArrayList存储学生对象并遍历.Student;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
            ArrayList<Student> list = new ArrayList<>();
            Student stu01 = new Student("喜洋洋",18);
            Student stu02 = new Student("令狐冲",19);
            Student stu03 = new Student("石破天",16);
            list.add(stu01);
            list.add(stu02);
            list.add(stu03);
            //循环遍历集合,打印输出集合当中的每一个元素数据,显示在控制台当中。
            for(int i=0; i<list.size(); i++){
                Student stu = list.get(i);
                System.out.println("姓名:" + stu.getName() + ",年龄:" + stu.getAge());
            }
        }
}
