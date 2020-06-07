package com.amao.demo13_扩展;

/**
 * @Author：pengzhilin
 * @Date: 2020/6/5 14:25
 */
public class Body {// 包含关系,不是继承关系

    int num = 10;

    public class Heart{
        int num = 20;
        public void method(){
            int num = 30;
            System.out.println("局部变量:"+num);// 30
            System.out.println("内部类成员变量:"+this.num);// 20
            System.out.println("外部类成员变量:"+Body.this.num);// 10
        }
    }
}
