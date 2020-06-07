package com.amao.demo3_set和get方法;

public class Student {

    // 成员变量
    private String name;// 姓名
    private int age;// 年龄

    // 提供set,get方法
    // set方法: 给属性赋值
    public void setName(String n) {
        name = n;
    }

    public void setAge(int a) {
        // 判断
        if (a < 0 || a > 200) {
            age = 0;
        } else {
            age = a;
        }
    }

    // get方法: 获取属性值
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
