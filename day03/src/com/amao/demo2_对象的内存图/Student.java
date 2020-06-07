package com.amao.demo2_对象的内存图;

/**
 * @Author：pengzhilin
 * @Date: 2020/6/2 9:04
 */
public class Student {
    // 成员变量  private
    private String name;// 姓名
    private int age;// 年龄

    // 构造方法
    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // set\get方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // 成员方法
    public void show(){
        System.out.println(name+","+age);
    }
}
