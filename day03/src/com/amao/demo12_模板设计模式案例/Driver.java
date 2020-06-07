package com.amao.demo12_模板设计模式案例;

/**
 * @Author：pengzhilin
 * @Date: 2020/6/2 14:57
 */
public abstract class Driver {
    // 通用功能:开车  非抽方法
    public void go(){
        System.out.println("开门");
        System.out.println("点火");
        // 开车姿势
        ziShi();
        System.out.println("刹车");
        System.out.println("熄火");
    }

    // 非通用功能: 抽象方法
    public abstract void ziShi();
}
