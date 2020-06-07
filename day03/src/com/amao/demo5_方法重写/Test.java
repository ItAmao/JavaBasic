package com.amao.demo5_方法重写;

/**
 * @Author：pengzhilin
 * @Date: 2020/6/2 10:33
 */
class Fu{
     void method(){
        System.out.println("Fu 类中的method方法");
    }

    public void sport(){
        System.out.println("运动的方式是跑步");
    }
}

class Zi extends Fu{

    @Override
    void method() {
        System.out.println("Zi 类中的method方法");
    }

    void method1(){

    }

    @Override
    public void sport() {
        System.out.println("运动的方式为游泳");
    }


}

public class Test {
    public static void main(String[] args) {
        /*
            方法重载: 在一个类中,出现了多个同名的方法,但是参数列表不同

            - 方法重写的概念: 子类中出现了和父类中一模一样的方法时(返回值类型,方法名,参数列表),该方法就是重写的方法
            - 重写的注意事项
                1.一定是父子关系,才会有重写
                2.子类重写父类的方法的时候,重写的方法的返回值类型,方法名,参数列表要一致
                3.子类重写的方法的权限修饰符的权限不能低于父类方法的权限
                    权限修饰符权限大小: public >  protected  > 默认(空) >  private
                4.重写的方法,可以使用@Override注解来标识
                    在开发中,建议大家对重写的方法加上@Override注解标识
            - 什么情况下要方法重写:
                父类中的方法功能无法满足子类需求的时候
         */
        Zi zi = new Zi();
        zi.sport();

    }
}
