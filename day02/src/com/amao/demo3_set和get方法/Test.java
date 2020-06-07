package com.amao.demo3_set和get方法;

public class Test {
    public static void main(String[] args) {
        /*
            对属性封装:
                1.使用private修饰属性
                2.为属性提供set(给属性赋值)方法,get方法(获取属性的值)

            set和get方法:
                set方法的书写规律:
                    1.set方法一定是一个公共的方法(public)
                    2.set方法一定没有返回值(void)
                    3.set方法的方法名一定是set+属性名,并且属性名首字母大写
                    4.set方法一定有参数
                    5.set方法一定会给属性赋值

                get方法的书写规律:
                    1.get方法一定是一个公共的方法(public)
                    2.get方法一定有返回值,并且返回值类型与获取的属性类型一致
                    3.get方法的方法名一定是get+属性名,并且属性名首字母大写
                    4.get方法一定没有参数
                    5.get方法一定会返回属性的值
         */
        // 创建Student对象
        Student stu = new Student();

        // 给属性赋值
        stu.setName("张三");
        stu.setAge(18);

        // 获取属性的值
        System.out.println(stu.getName());
        System.out.println(stu.getAge());
    }
}
