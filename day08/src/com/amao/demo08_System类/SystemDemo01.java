package com.amao.demo08_System类;

public class SystemDemo01 {
    public static void main(String[] args) {
        //1.创建System对象,报错,因为System的构造方法私有了
//        System s = new System();
        //2.exit方法
        method();
        System.out.println(".........");
    }

    public static void method(){
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i == 5) {
//                System.exit(0);//终止JVM
//                break; //结束当前循环
//                return; //结束当前方法
            }
        }
    }
}
