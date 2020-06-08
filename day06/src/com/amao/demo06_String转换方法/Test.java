package com.amao.demo06_String转换方法;

public class Test {
    public static void main(String[] args) {
        //将当前字符串转成字符数组
        String a1 = "ItAmao";
        char[] a2 = a1.toCharArray();
        for (int i = 0; i < a2.length; i++) {
            System.out.print(a2[i] + ", ");//I, t, A, m, a, o,
        }
        System.out.println("");
        //将当前字符串转成字节数组
        String b1 = "ItAmao";
        byte[] b2 = b1.getBytes();
        for (int i = 0; i < b2.length; i++) {
            System.out.print(b2[i] + ", ");//73, 116, 65, 109, 97, 111,
        }
        System.out.println("");
        //将当前字符串转成小写字符串
        String e1 = "ItAmao";
        String e2 = e1.toLowerCase();
        System.out.println(e2);

        //将当前字符串转成大写字符串
        String f1 = "ItAmao";
        String f2 = f1.toUpperCase();
        System.out.println(f2);

        //将当前字符串中的指定字符串替换为新新字符串
        String g1 = "ItAmao{Java}";
        String g2 = g1.replace("{}", "");
        System.out.println(g2);

    }
}
