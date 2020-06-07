package com.amao.demo13_扩展;

/**
 * @Author：pengzhilin
 * @Date: 2020/6/5 14:25
 */
public class Test {
    public static void main(String[] args) {
        // 创建成员内部类对象
        Body.Heart bh = new Body().new Heart();
        bh.method();
    }
}
