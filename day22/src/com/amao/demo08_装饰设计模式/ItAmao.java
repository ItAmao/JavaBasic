package com.amao.demo08_装饰设计模式;

/**
 *  @Author : ItAmao
 *  @Date   : 2020/6/30 19:07
 */
public class ItAmao implements Person {
    private Student student;

    public ItAmao(Student student) {
        this.student = student;
    }

    public ItAmao() {
    }

    @Override
    public void sleep() {
        System.out.println("阿毛想睡觉");
        student.sleep();
        System.out.println("明天放假了");
    }

    @Override
    public void eat() {
        student.eat();
    }
}
