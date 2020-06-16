package com.amao.demo_学生管理系统1.model;

/**
 * 子类Student需要继承Person
 * 成员变量:
 * 继承Person
 * 构造方法:
 * 无参+全参(直接调用父类的全参 使用super)
 * 重写抽象方法:
 * 重写getType() 返回"学生"
 * 重写getWork() 返回"学习"
 *
 * @author mao
 */
public class Student extends Person {
    public Student() {
    }

    public Student(int id, String name, String gender, String birthday) {
        super(id, name, gender, birthday);
    }

    @Override
    public String getType() {
        return "学生";
    }

    @Override
    public String getWork() {
        return "学习";
    }
}
