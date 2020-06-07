package com.amao.demo6_this的三种用法;

/**
 * @Author：pengzhilin
 * @Date: 2020/6/2 11:01
 */
class Student{
    int age = 10;

    public void show(){
        int age = 20;
        System.out.println(age);//20
        System.out.println(this.age);//10

        // 调用eat方法
        eat();
        this.eat();
    }

    public void eat(){
        System.out.println("吃东西...");
    }


    // this访问构造方法
    public Student(){
        //this(19);
        System.out.println("空参...");
    }

    public Student(int age){
        this();// 调用了本类的空参构造方法
        this.age = age;
        System.out.println("有参");
    }
}

public class Test {
    public static void main(String[] args) {
        /*
            this: 表示"当前对象"的引用
            作用: 可以访问本类中成员变量,成员方法,构造方法
            访问成员变量: this.成员变量名  一般为了区别同名的局部变量的时候才会使用   重点
            访问成员方法: this.成员方法名(实参);  一般不用
            访问构造方法: 本类中的构造方法   一般用的比较少,框架中
                空参构造方法: this();
                有参构造方法: this(实参);
                注意事项:
                    1.this调用构造方法,只能在本来的构造方法中调用,并且要放在第一行
                    2.在本类的2个构造方法中,不能相互调用
         */
        Student stu = new Student();
        //Student stu = new Student(18);
        stu.show();
    }

    // ctrl+alt+m
    private static void method01() {
        System.out.println("黑马");// alt+鼠标左键往下拽
        System.out.println("黑马");
        System.out.println("黑马");
        System.out.println("黑马");
    }
}
