package com.amao.demo9_继承体系的内存图;

/**
 * @Author：pengzhilin
 * @Date: 2020/6/2 11:59
 */
 class Fu {
    int num = 10;
    int numFu = 100;

    public void method(){
        System.out.println("父类中的method方法");
    }
}
 class Zi extends Fu {

    int num = 20;

    public void show(){
        int num = 30;
        System.out.println("访问局部变量num:"+num);
        System.out.println("访问本类成员变量num:"+this.num);
        System.out.println("访问父类成员变量num:"+super.num);
    }

    @Override
    public void method() {
        super.method();
        System.out.println("子类中的method方法");
    }
}
public class Test {
    public static void main(String[] args) {
        // 创建Zi类对象
        Zi zi = new Zi();
        zi.show();
        zi.method();
    }
}
