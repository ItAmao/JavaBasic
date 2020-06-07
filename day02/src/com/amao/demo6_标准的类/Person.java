package com.amao.demo6_标准的类;

/**
 * @Author：pengzhilin
 * @Date: 2020/6/1 14:01
 */
public class Person {
    private String name;
    private int age;
    private boolean flag;

    public Person(String name, int age, boolean flag) {
        this.name = name;
        this.age = age;
        this.flag = flag;
    }

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

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
