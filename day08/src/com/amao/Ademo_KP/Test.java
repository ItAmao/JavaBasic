package com.amao.Ademo_KP;

public class Test {
    public static void main(String[] args) {
        /*
            Object类:是所有类的父类,所有对象(包括数组)都拥有object类中的方法
                概述: 每个类都有Object作为超类。 所有对象（包括数组）都实现了这个类的方法。

            toString方法:
                public String toString() 返回"该对象"的字符串表示
                1.默认情况下返回的字符串格式:包名.类名@该对象的地址值
                2.在开发中,我们经常会重写toString方法,不要返回地址值而返回对象的属性值(内容)
                3.注意事项:其实我们连toString方法都不需要调用,即可得到对象的所有属性值
                        因为我们输出对象名时,其实java会自动调用对象的toString方法
                所有的类都是继承自Object类，自然继承了toString方法，在当使用
                System,out.println()里面为一个对象的引用时，自动调用toString方法把对象
                打印出来。如果重写了tostring方法则调用重写的toString 方法。
                因为System.out.println()的这个方法源码中调用了String.valueOf(Objec o),

----------------------------------------------------------------------------------------------

            equals概述:指示判断其他某个对象是否与此对象相等

            equals方法源码:
            public boolean equals(Object obj) {
                return (this == obj);
            }
            参数:
                Object obj:可以传递任意的对象
                ==:比较运算符  返回的是一个boolean值 不是ture就是false
                基本数据类型:比较的是指
                引用数据类型:比较的是2个对象的地址值
            this是谁? 那个对象调用的方法,方法中的this就是那个对象,

            对于引用类型:
	            == 比较地址值
                equals 默认比较的也是地址值,但是如果重写了比较的是内容
            对于基本类型:
	            == 比较基本类型的值
                equals  没有equals方法!!!

            默认情况下:1.equals方法比较的是2个对象的地址值
                     2.在开发中,我们也会重写equals方法,比较2个对象的内容
---------------------------------------------------------------------------------------
           native方法概述:
                被native关键字修饰的方法叫做本地方法，本地方法和其它方法不一样，本地方法意味着和平台有关

                没有方法体的方法
                    抽象方法和native方法

                什么是native方法:
                    称为本地方法

--------------------------------------------------------------------------------------------------------
          Objects类我们称为工具类,特点其中所有的方法都行静态的
                其中有一个静态方法方法,叫做equals(空指针容忍的比较方法)
                public static boolean equals(Object a, Object b) {
    	            return (a == b) || (a != null && a.equals(b));
	            }
	            其实就是比较a和b,即 a.equals(b)
                这个方法的好处其实就是在于避免空指针异常
--------------------------------------------------------------------------------------------------------
          java.util.Date类
                    代表某个时间点,
          构造方法
            public Date()  创建一个时期对象 代表当前的系统时间
            public Date(long millis) 创建一个日期对象,代表距离标准时间 millis 毫秒后的那个时间
                                     标准时间是指: (英国)1970-01-01 00.00.00
                                                (中国)1970-01-01  08.00.00
          成员方法:
           public long getTime() 获取当前Date对象距离标准时间的毫秒值
           public void setTime(long millis) 修改当前Date对象距离标准时间的毫秒值
-------------------------------------------------------------------------------------------------------
            DateFormat类作用:
                   java.text.DateFormat类,用于格式化日期/时间(抽象类)
                   实际上我们用的是他的子类:SimpDateFormat

             格式化:
                  把Date对象转成一个字符串格式
             解析:
                 把字符串格式的时间,转成一个Date对象

             构造方法
                public SimpDateFormat(String pattern) 以指定的模式创建一个日期格式化对象
                public Date parse(String time)
             成员方法:
                格式化:
	                public String format(Date date);
                解析:
	                public Date parse(String time);
-------------------------------------------------------------------------------------------------------
        Calendat类的介绍
                    java.util.Calendar 类也是代表某个时间点(和Date是一样)
                    注意:Calendar是一个抽象类
            Calendar类对象创建:
                    a.找到他的子类GregorianCalendar,创建这个子类对象
                    b.调用Calendar类的一个静态方法,getInstance,获取到他的子类对象[我们今天就是用这种方式]

            Calendar常用方法
                public int get(int field) 根据字段的编号,从日历对象中获取该字段的值

            其他方法:
	            public boolean after(Calendar when);判断当前时间是否在指定的时间之后
	            public boolean before(Calendar when);判断当前时间是否在指定的时间之前

--------------------------------------------------------------------------------------------------------
        Math类
            Math成为数学工具类,其中包含了很多和数学相关的静态方法

        public static int abs(int num)//求绝对值
        public static double ceil(double d)//向上取整
        public static double floor(double d)//向下取整
        public static double pow(double d1,double d2)//求指数
        public static long round(double d)//四舍五入

        面试题:
                System.out.println(Math.ceil(-3.14));
                System.out.println(Math.floor(-2.3));


--------------------------------------------------------------------------------------------------------
        System类
            java.lang.System类包含一些有用的类字段和方法,它不能被实例化,因为构造方法私有

           方法
                public static void exit(int status); 让jvm结束;参数写0表示正常结束

            exit(0) 结束JVM
             arraycopy(源,起始,目标,起始,个数)
           数组的复制 System.arraycopy(源数组,起始索引,目标数组,起始索引,复制的个数);
         */
    }
}
