package com.amao.demo6_标准的类;

/**
 * @Author：pengzhilin
 * @Date: 2020/6/1 11:51
 */
public class Student {
    // 成员变量 private
    public  String name;
    public  int age;

    // 生成构造方法和set\get方法的快捷键:  alt+insert

    // 空参构造方法
    public Student() {
    }

    // 满参构造方法
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }


    // set方法
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // get方法
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // 成员方法 功能方法
    public void show(){
        System.out.println(name+","+age);
    }
}
