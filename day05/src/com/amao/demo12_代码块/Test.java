package com.amao.demo12_代码块;

/**
 * @Author：pengzhilin
 * @Date: 2020/6/5 14:04
 */
public class Test {
    static {
        System.out.println("main 方法所在的类的静态代码块...");
    }

    public static void main(String[] args) {
        /*
            代码块:
                - 构造代码块:
                    格式: {}
                    位置: 类中,方法外
                    执行: 每次调用构造方法就会执行
                    使用场景: 用来统计多少个对象被创建了

                - 静态代码块
                    格式: static{}
                    位置: 类中,方法外
                    执行: 当类加载的时候执行,并且只执行一次
                    使用场景: 用来加载驱动,凡是只要求执行一次的代码,就可以放到静态代码块中

                - 局部代码块
                    格式: {}
                    位置: 方法中
                    执行: 调用局部代码块所在的方法,执行到局部代码块的时候才执行
                    使用场景: 提前释放空间,节省内存空间,实际没啥用

               静态代码块优先于构造代码块执行,构造代码块优先于构造方法执行
         */
        System.out.println("main....");
        Person p1 = new Person();
        Person p2 = new Person();

        System.out.println("开始");
        {
            System.out.println("局部代码块");
        }
        System.out.println("结束");

        System.out.println("======================");
        {
            int num = 10;// 作用域: 使用范围,
            System.out.println(num);
        }
        // System.out.println(num);// 编译报错
        // 以下还有100行代码,而这100行代码并没有使用num这个变量

    }
}
