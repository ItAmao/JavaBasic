package com.amao.demo11_StringBuilder反转操作;

public class Test {
    public static void main(String[] args) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            res.append(i);
        }
        System.out.println(res);
        res.reverse();
        System.out.println(res.toString());
    }
}
