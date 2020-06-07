package com.amao.demo7_super的三种用法;

/**
 * @Author：pengzhilin
 * @Date: 2020/6/2 11:28
 */
class Fu{
    int num = 10;
    public void method(){
        System.out.println("Fu 类method方法");
    }

    public void run(){
        // 假设10行代码
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);
        System.out.println(6);
        System.out.println(7);
        System.out.println(8);
        System.out.println(9);
        System.out.println(10);
    }

    private int num2;

    // 构造方法
    public Fu(){
        System.out.println("Fu 空参");
    }

    public Fu(int num2){
        System.out.println("Fu 有参");
        this.num2 = num2;
    }

    public int getNum2() {
        return num2;
    }
}

class Zi extends Fu{
    int num = 20;

    public void show(){
        int num = 30;
        System.out.println("局部变量num:"+num);
        System.out.println("子类中的num:"+this.num);
        System.out.println("父类中的num:"+super.num);

        // 调用父类method方法  场景一: 直接调用父类中的方法
        super.method();
    }

    @Override
    public void method(){
        System.out.println("Zi 类method方法");
    }

    @Override
    public void run() {
        // 保留父类10行代码的功能,再继续追加3行代码功能
        /*System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);
        System.out.println(6);
        System.out.println(7);
        System.out.println(8);
        System.out.println(9);
        System.out.println(10);*/
        super.run();// 场景二; 重写方法需要沿用父类功能

        System.out.println(11);
        System.out.println(12);
        System.out.println(13);
    }

    // 构造方法
    public Zi(){
        super();// 调用父类的空参构造方法
    }

    public Zi(int num2){
        // 调用父类对应的构造方法给从父类继承过来的私有成员变量赋初始值
         super(num2);

    }

}

public class Test {
    public static void main(String[] args) {
        /*
            super关键字: 表示"父类空间"引用
            作用: 可以访问父类中成员变量,成员方法,构造方法
            访问父类中成员变量: super.父类成员变量名  一般父子类中出现了同名的成员变量,那么就需要使用super来区别
            访问父类中成员方法: super.父类成员方法名(实参);  一般用来调用父类的成员方法
            访问父类中的构造方法:
                空参构造: super();
                有参构造: super(实参);
                注意:
                    1.在子类的构造方法中调用父类的构造方法
                    2.在子类构造方法的第一行调用
         */
         Zi zi = new Zi(200);
        System.out.println(zi.getNum2());// 200

         //Zi zi = new Zi();
        // Zi zi = new Zi();
        // zi.show();
        // zi.run();
    }
}
