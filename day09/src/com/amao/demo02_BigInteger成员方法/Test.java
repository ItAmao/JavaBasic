package com.amao.demo02_BigInteger成员方法;

import java.math.BigInteger;

public class Test {
    public static void main(String[] args) {
        //1.创建一个BigInter对象
        BigInteger b1 = new BigInteger("111111111111111111111");
        BigInteger b2 = new BigInteger("999999999999999999999");
        //2.计算
        // b3=b1+b2;// 报错,因为需要调用成员方法add才能进行数学操作
        BigInteger add = b2.add(b1); // b2+b1
        BigInteger sub = b2.subtract(b1); //b2-b1
        BigInteger mul = b2.multiply(b1);//b2*b1
        BigInteger div = b2.divide(b1);//b2/b1
        System.out.println(add);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
    }
}
