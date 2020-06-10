package com.amao.demo12_普通类作为成员变量;

public class StudentTest {
    public static void main(String[] args) {
        Student stu1 = new Student("阿毛", 18, "男", 176.7);
        Student stu2 = new Student();
        stu2.setName("小毛");
        stu2.setAge(22);
        stu2.setGender("男");
        stu2.setHeight(180.0);
        //重写了toString方法
        System.out.println(stu1);
        System.out.println(stu2);
    }
}
