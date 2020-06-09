package com.amao.demo07_Math类;

public class Test {
    public static void main(String[] args) {
        //1.绝对值
        int a = -123;
        System.out.println(Math.abs(a));//绝对值
        //2.向上/向下取整
        double b = 1.11;
        double c = 2.22;
        System.out.println(Math.ceil(b));//向上取整
        System.out.println(Math.floor(c));//向下取整
        //3.求次方
        System.out.println(Math.pow(2, 3));//double类型  2的3次方
        //4.四舍五入
        System.out.println(Math.round(3.14));
        System.out.println(Math.round(3.56));

        System.out.println(Math.ceil(-3.14));
        System.out.println(Math.floor(-2.3));
    }
}
