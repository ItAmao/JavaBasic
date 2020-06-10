package com.amao.demo07_基本类型与字符串之间的转换;

public class Test {
    public static void main(String[] args) {
        /*
             1. 使用包装类的 toString() 方法
             2. 使用String类的 valueOf() 方法
             3. 用一个空字符串加上基本类型，得到的就是基本类型数据对应的字符串

         */
        //1. 使用包装类的 toString() 方法
        int a = 10;
        String strA = Integer.toString(a);
        System.out.println(strA);
        //打印出strA的类型
        System.out.println(strA.getClass().getName().toString());
        //2.使用String类的 valueOf() 方法
        int b = 20;
        String strB = String.valueOf(b);
        System.out.println(strB);
        //打印出strB的类型
        System.out.println(strB.getClass().getName().toString());
        //3.用一个空字符串加上基本类型，得到的就是基本类型数据对应的字符串
        int c = 30;
        String strC = c + "";
        System.out.println(strC);
        //打印出strC的类型
        System.out.println(strC.getClass().getName().toString());
    }
/*
字符串转int
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请从控制台接收一个整数的“分数”值:");
        String score = scanner.next();
        Integer scores = new Integer(score);
        int a = scores; //自动拆箱
        System.out.println(a + 5);
    }
}

 */
}
