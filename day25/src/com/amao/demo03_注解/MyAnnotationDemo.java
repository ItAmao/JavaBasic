package com.amao.demo03_注解;

/**
 *  注意事项:
 *      a.默认情况下,我们的注解可以标记在类上,方法上,成员变量上,参数上,局部变量上,等...
 *      b.使用注解进行标记时,必须保证该注解的某个属性都要有值
 *          即没有默认值的属性必须赋值,有默认值的属性可以不赋值,也可以赋值
 *
 *
 *
 *  @Author : ItAmao
 *  @Date   : 2020/7/5 20:20
 */
@MyAnnotation(age = 10, name = "李四", hobby = {"吃饭", "睡觉"})
public class MyAnnotationDemo {
    private int a;
    private String b;

    @MyAnnotation(age = 10, name = "李四", hobby = {"吃饭", "睡觉"})
    public MyAnnotationDemo() {
    }


    public MyAnnotationDemo(int a, String b) {
        this.a = a;
        this.b = b;
    }

    public void show(@MyAnnotation(age = 10, name = "李四", hobby = {"吃饭", "睡觉"}) String name) {
        int age = 10;
        System.out.println("我的年龄是:" + age);
    }
}
