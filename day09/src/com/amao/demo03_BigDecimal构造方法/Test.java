package com.amao.demo03_BigDecimal构造方法;

import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {
        //创建一个BigDecimal对象
        BigDecimal b1 = new BigDecimal("0.009");
        System.out.println(b1);
        BigDecimal b2 = new BigDecimal(0.009); //不推荐使用
        System.out.println(b2);
    }
}
