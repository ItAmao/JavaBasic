package com.amao.demo8_内部类;

/**
 * @Author：pengzhilin
 * @Date: 2020/6/5 11:08
 */
public class Test {
    public static void main(String[] args) {
        /*
            内部类:
                概述:将一个类A定义在一个类B中,其中类A就是内部类,其中类B就是外部类
                成员内部类:
                    格式:
                        public class 外部类{
                            成员变量
                            成员方法
                            public class 内部类{
                                 成员变量
                                 成员方法
                            }
                        }
                   特点:
                     1.成员内部类是定义在类中,方法外
                  访问规则:
                    1.在内部类中,可以直接访问一切外部类成员,包括私有
                    2.内部类在其他类中创建对象的格式:
                        外部类名.内部类名 对象名 = new 外部类().new 内部类();
                    3.在外部类中访问内部类的成员,需要创建内部类对象
         */
        // 在其他类中创建内部类对象
        Body.Heart bh = new Body().new Heart();
        bh.methodN1();
        System.out.println(bh.numN);

        System.out.println("===================");
        Body body = new Body();
        body.methodW2();

    }
}
