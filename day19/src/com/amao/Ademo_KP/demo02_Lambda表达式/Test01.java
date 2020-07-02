package com.amao.Ademo_KP.demo02_Lambda表达式;

/**
 * Lambda表达式:
 * Lambda表达式是一个匿名函数,这个函数相当于java中的方法
 * 格式:
 * (参数列表)->{
 * 方法体
 * }
 * -> 没有实际含义,起到连接的作用
 */
public class Test01 {
    public static void main(String[] args) {
        //1.使用匿名内部类打印
        goSwimming(new Swimmable() {
            @Override
            public void swimming() {
                System.out.println("我是匿名内部类的游泳");
            }
        });
        //2.使用Lambda表达式打印,以后我们看到方法的参数是接口就可以考虑使用Lambda表达式
        //我们可以这么认为Lambda表达式就是对接口中的抽象方法的重写
        goSwimming(() -> {
            System.out.println("我是Lambda的游泳");
        });

        goSmoking(new Smokeable() {
            @Override
            public int smoking(String name) {
                System.out.println("匿名内部类抽了" + name + "烟");
                return 5;
            }
        });

        goSmoking((String name) -> {
            System.out.println("Lambda抽了" + name + "烟");
            return 6;
        });
    }

    //1.练习无参数无返回值的Lambda
    public static void goSwimming(Swimmable s) {
        s.swimming();
    }

    //2.练习有参数有返回值的Lambda
    public static void goSmoking(Smokeable s) {
        int i = s.smoking("中华");
        System.out.println("抽了" + i + "根");
    }
}
