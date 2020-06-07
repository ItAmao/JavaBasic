package com.amao.demo4_this关键字;

/**
 * @Author：pengzhilin
 * @Date: 2020/6/1 9:38
 */
public class Student {
    // 成员变量
    private String name;// 姓名
    private int age;// 年龄

    // 提供set,get方法
    // set方法: 给属性赋值
    public void setName(String name){
        this.name = name;
        // 把形参name的值,赋值给成员变量name
    }

    // 批量修改名称: shift + f6
    public void setAge(int age){
        // 判断
        if (age < 0 || age > 200){
            this.age = 0;
        }else {
            this.age = age;
            // 把形参age的值,赋值给成员变量age
        }
    }

    // get方法: 获取属性值
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

}
