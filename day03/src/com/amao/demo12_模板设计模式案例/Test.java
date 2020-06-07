package com.amao.demo12_模板设计模式案例;

/**
 * @Author：pengzhilin
 * @Date: 2020/6/2 14:57
 */
public class Test {
    public static void main(String[] args) {
        // 创建新司机,并调用开车功能
        NewDriver d1 = new NewDriver();
        d1.go();
        System.out.println("=============");
        // 创建老司机,并调用开车功能
        OldDriver d2 = new OldDriver();
        d2.go();
    }
}
