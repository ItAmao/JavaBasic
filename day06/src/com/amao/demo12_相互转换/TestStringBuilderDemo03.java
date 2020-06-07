package com.amao.demo12_相互转换;

/**
 * StringBuilder和String的相互转换
 */
public class TestStringBuilderDemo03 {
    public static void main(String[] args) {
        //1.String类型 ---> StringBuilder类型
        String name1 = "jack";
        //通过StringBuilder的构造方法
        StringBuilder sb1 = new StringBuilder(name1);
        System.out.println(sb1);

        //2.StringBuilder类型 ---> String类型
        StringBuilder sb2 = new StringBuilder();
        sb2.append("java").append(100);
        //通过调用StringBuilder一个成员方法,toString
        String str = sb2.toString();
        System.out.println(str);
    }
}
