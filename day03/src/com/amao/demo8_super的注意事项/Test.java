package com.amao.demo8_super的注意事项;

/**
 * @Author：pengzhilin
 * @Date: 2020/6/2 11:51
 */
class Ye /*extends Object*/{
    int num = 10;
}

class Fu extends Ye{
    //int num = 20;
    public Fu(){
        System.out.println("Fu 类空参构造");
    }

    public Fu(int num){
        System.out.println("Fu 类空参构造");
    }
}

class Zi extends Fu{

    public Zi(int num){
        // super();  隐藏
    }

    public  void show(){
        System.out.println(super.num);
    }
}

public class Test {
    public static void main(String[] args) {
        /*
            super注意事项:
                super访问成员变量和成员方法: 优先去父类中找,如果有就直接使用,如果没有就去爷爷类中找,如果有,就用,依次类推...直到根类(Object)
                子类的构造方法默认会调用父类的空参构造方法,如果父类中的没有空参构造方法,只定义了有参构造方法,会编译报错
         */
        new Zi(10).show();
    }
}
