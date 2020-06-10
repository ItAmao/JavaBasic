package com.amao.demo04_BigDecimal成员方法;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Test {
    public static void main(String[] args) {
        //创建一个BigDecimal对象
        BigDecimal b1 = new BigDecimal("0.009");
        BigDecimal b2 = new BigDecimal("0.001");
        //2.计算
        //b1+b2
        BigDecimal add = b1.add(b2);
        //b1-b2
        BigDecimal sub = b1.subtract(b2);
        //b1*b2
        BigDecimal mul = b1.subtract(b2);
        //b1/b2
        BigDecimal div = b1.divide(b2);
        //BigDecimal div1 = b2.divide(b1);
        //System.out.println(div1); //会报错,因为b2除不尽b1 ,所以会抛出异常
        //解决方法 BigDecimal有个方法的重载,方法名相同,参数列表不同
        //scale是保留的小数位数 ,第三个是取舍模式 四舍五入
        BigDecimal div3 = b2.divide(b1, 5, RoundingMode.HALF_UP);
        System.out.println(div3);
        System.out.println(add);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
    }
}
