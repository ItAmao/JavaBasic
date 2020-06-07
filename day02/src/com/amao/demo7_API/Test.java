package com.amao.demo7_API;


import java.util.Scanner;

/**
 * @Author：pengzhilin
 * @Date: 2020/6/1 13:35
 */
public class Test {
    public static void main(String[] args) {
        /*
            API使用步骤:
                1.打开API
                2.点击"显示"
                3.点击"索引"
                4.在输入框中输入要查找的类,回车
                5.查看包
                6.查看类的解释说明
                7.查看构造方法
                8.查看成员方法

            使用系统提供的类导包:  在java.lang包下的类不需要导包,其他都需要导包

            举例: Scanner
                1.查看包  java.util  使用时需要导包
                2.查看类的解释说明:  一个简单的文本扫描器,可以扫描基本数据类型和字符串类型的数据
                3.查看构造方法:
                    Scanner(InputStream source)
                    System.in: 表示键盘录入
                4.查看成员方法: 功能
                     boolean nextBoolean()
                     byte nextByte()
                     double nextDouble()
                     float nextFloat()
                     int nextInt()
                     long nextLong()
                     short nextShort()
                     String nextLine() 可以获取一行字符串 包括空格,制表符,回车...
                     String next()  只能获取连续的一个字符串,不能获取含有空格,制表符,回车...

         */
        Scanner sc = new Scanner(System.in);
        // int i = sc.nextInt();
        // System.out.println(i);

        // long l = sc.nextLong();
        // System.out.println(l);

        // double d = sc.nextDouble();
        // System.out.println(d);

        //String str1 = sc.next();
        //System.out.println(str1);

        String str2 = sc.nextLine();
        System.out.println(str2);
    }
}
