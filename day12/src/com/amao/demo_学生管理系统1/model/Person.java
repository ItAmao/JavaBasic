package com.amao.demo_学生管理系统1.model;

import com.amao.demo_学生管理系统1.dao.Utils;

/**
 * 类的设计需求
 * 1.父类Person(抽象)
 * 父类Person抽取学生和老师类中相同的成员
 * 成员变量:
 * id(编号,自动生成)
 * name(姓名)
 * gender(性别)
 * birthday(生日)
 * age(年龄)
 * 构造方法:
 * 无参+全参
 * 成员方法:
 * toString 模板设计模式
 * 抽象方法
 * getType() 由各子类去实现,返回各自的"职业"字符串
 * getWork() 由各子类去实现,返回各个的"工作内容"字符串
 */
public abstract class Person {
    /**
     * 姓名
     */
    private int id;
    /**
     * 姓名
     */
    private String name;
    /**
     * 性别
     */
    private String gender;
    /**
     * 出生日期
     */
    private String birthday;
    /**
     * 年龄
     */
    private int age;


    public Person() {
    }

    public Person(int id, String name, String gender, String birthday) {
        //年龄需要根据出生日期来判断的,不需要从用户获取
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public int getAge() {
        age = Utils.birthdayToAge(this.birthday);
        return age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    /**
     * 获取职业类型
     */
    public abstract String getType();

    /**
     * 获取职业类型
     */
    public abstract String getWork();

    /**
     * 重写了toString方法作为模板
     *
     * @return
     */
    @Override
    public String toString() {
        return id + "\t\t" +
                name + "\t\t" +
                gender + "\t\t" +
                birthday + "\t" +
                this.getAge() + "\t\t" +
                " 我是一名:" + getType() + " 我的工作是:" + getWork();
    }
}
