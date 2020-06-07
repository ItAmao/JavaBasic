package com.amao.demo8_内部类;

/**
 * @Author：pengzhilin
 * @Date: 2020/6/5 11:11
 */
// 外部类
public class Body {
    // 成员变量
    private int numW = 10;
    // 成员方法
    public void methodW1(){
        System.out.println("外部类 methodW1");
    }

    public void methodW2(){
        System.out.println("外部类 methodW2");
        // 访问内部类的成员变量和成员方法
        //Body.Heart bh = new Body().new Heart();
        Heart bh = new Heart();
        System.out.println(bh.numN);
        bh.methodN2();
    }

    public class Heart{
        // 成员变量
        public int numN = 20;
        // 成员方法
        public void methodN1(){
            System.out.println("内部类 methodN1");
            // 访问外部类的成员变量
            System.out.println(numW);
            // 访问外部类的成员方法
            methodW1();
        }
        public void methodN2(){
            System.out.println("内部类 methodN2");
        }

    }

}
