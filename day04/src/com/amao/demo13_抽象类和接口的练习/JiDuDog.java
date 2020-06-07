package com.amao.demo13_抽象类和接口的练习;

/**
 * @Author：pengzhilin
 * @Date: 2020/6/4 14:41
 */
public class JiDuDog extends Dog implements JiDu{
    @Override
    public void houJiao() {
        System.out.println("汪汪...");
    }

    @Override
    public void eat() {
        System.out.println("吃骨头...");
    }

    @Override
    public void jiDu() {
        System.out.println("根据鼻子闻的方式缉毒...");
    }
}
