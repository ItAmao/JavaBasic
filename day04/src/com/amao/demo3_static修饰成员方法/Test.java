package com.amao.demo3_static修饰成员方法;

/**
 * @Author：pengzhilin
 * @Date: 2020/6/4 10:00
 */
public class Test {
    public static void main(String[] args) {
        /*
            static修饰成员方法:
                格式: 修饰符 static 返回值类型 方法名(形参列表){}
                特点: 被static修饰的方法叫做静态成员方法
                访问方式:
                    对象名.静态成员方法名(实参);
                    类名.静态成员方法名(实参);  推荐

                注意事项:
                    1.父子类中出现一模一样的静态方法,不叫方法重写,只是长得像方法重写
                    2.静态方法中不能出现this关键字
                    3.静态方法中不能直接访问非静态成员变量或者非静态成员方法
                    4.静态方法中只能直接访问静态成员变量或者静态成员方法
                    5.非静态方法中可以访问一切成员(静态,非静态)
         */
        People.method2();

        People p = new People();
        p.method2();


    }

    public static void method(){

    }
}
