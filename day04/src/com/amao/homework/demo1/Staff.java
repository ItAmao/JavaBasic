package com.amao.homework.demo1;

/*
    员工类
 */
public abstract class Staff {
    private String name;//姓名

    private String gender;//性别

    private int age;//年龄

    public abstract void work();//工作(抽象)

    //无参构造器
    public Staff() {
    }

    //有参构造器
    public Staff(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    //set/get方法
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }


}
