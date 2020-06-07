package com.amao.demo4_继承后成员访问规则;

/**
 * @Author：pengzhilin
 * @Date: 2020/6/2 10:23
 */
class Fu3{
   public int num = 10;
   public void method(){
      System.out.println("Fu3 非私有方法method");
   }

}

class Zi3 extends Fu3{
    public int num = 100;
    public void method(){
        System.out.println("Zi3 非私有方法method");
    }
}

public class Test3 {
    public static void main(String[] args) {
        // 继承后非私有的成员访问: 可以继承,也可以直接使用
        // 规则: 优先在子类中查找,如果找到了,就直接使用子类的,如果没有找到,就继续去父类中找
        Zi3 zi = new Zi3();
        System.out.println(zi.num);
        zi.method();
    }
}
