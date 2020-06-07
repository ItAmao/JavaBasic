package com.amao.demo12_相互转换;

public class Test {
    public static void main(String[] args) {
        //String转StringBuilder 通过构造
        String name = "ItAmao";
        StringBuilder res = new StringBuilder(name);
        System.out.println(res);

        //StringBuilder转String 用toString转换
        StringBuilder res1 = new StringBuilder();
        res1.append("ItAmao").append(666);
        //通过调用StringBuilder一个成员方法,toString
        String str = res1.toString();
        System.out.println(str);

    }
}
