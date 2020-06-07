package com.amao.demo1_final;

/**
 * @Author：pengzhilin
 * @Date: 2020/6/4 9:21
 */
public class FinalVariable2 {// 了解即可
    final int NUM;
    // 成员变量生命周期: 随着对象的创建而创建,随着对象的销毁而销毁
    public FinalVariable2(int NUM) {
        this.NUM = NUM;
    }

    public FinalVariable2() {
        this.NUM = 10;
    }
}
