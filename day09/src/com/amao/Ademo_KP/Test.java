package com.amao.Ademo_KP;

public class Test {
    public static void main(String[] args) {
        /*
            BigInteger类
                概述:
                    java.math.BigInteger类主要用于大整数计算
                构造方法:
                    public BigInteger(String value);
                成员方法:
                    public BigInteger add(BigInteger value); 求和
                    public BigInteger subtract(BigInteger value); 求差
                    public BigInteger multiply(BigInteger value); 求积
                    public BigInteger divide(BigInteger value); 求商

-------------------------------------------------------------------------------------------------
            BigDecimal类
                因为在计算机中所有的小数都是近似值,所以BigDecimal提供了任意精度的有效符号
                概述:
                    java.math.BigDecimal用于高精度浮点数计算
                为什么使用:
                    原因在于我们的计算机是二进制的。浮点数没有办法是用二进制进行精确表示。

                构造方法:
                    public BigDecimal(String value);
                    注意,不建议使用以下构造,下面这个构造不能保证小数的精确
                    public BigDecimal(3.14);

                public BigDecimal add(BigDecimal value) 加法运算
                public BigDecimal subtract(BigDecimal value) 减法运算
                public BigDecimal multiply(BigDecimal value) 乘法运算
                public BigDecimal divide(BigDecimal value) 除法运行
-------------------------------------------------------------------------------------------------

            Arrays类概述:
               java.util.Arrays 该类包含用于操作数组的各种方法（如排序和搜索）。
               该类还包含一个静态工厂，可以将数组视为列表。

            Arrays类的常用方法
                public static void sort(数组);        排序:默认升序排列
                public static String toString(数组);  替代遍历,

--------------------------------------------------------------------------------------------------

            包装类:
                 包装类记基本类型对应的引用类型,称为基本类型包装类,简称包装类
                  java为8种基本类型,提供了引用类型,我们一般称为基本类型的包装类,简称包装类
                byte        Byte
                short       Short
                char        Character
                int         Integer
                long        Long
                float       Float
                double      Double
                boolean     Boolean


            Integer类
                构造方法:
                    Integer i1=new Integer(int value);
                    Integer i2=new Integer(String value); 字符串里边能转成整数的
                静态方法:
                    Integer i3 = Integer.valueof(int value);
	                Integer i4 = Integer.valueof(String value);
                成员方法:
                    public int intValue() 取出Integer对象中的int值

                装箱与拆箱(JDK1.5之后,Java引入自动装箱和自动拆箱)
                    自动装箱:把基本类型转成包装类类型
                    自动装箱
                    Integer i=10; //底层Integer.valueof(10);
                        Integer i1 = new Integer(100);
                        Integer i3 = Integer.valueOf(3);

                    自动拆箱:把包装类变成基本类型
                    自动拆箱 int num= i; //底层i.intValue();
                        int i = i2.intValue();
                        System.out.println(i);
----------------------------------------------------------------------------------------------------
            基本类型与字符串之间的转换

            1. 使用包装类的 toString() 方法
            2. 使用String类的 valueOf() 方法
            3. 用一个空字符串加上基本类型，得到的就是基本类型数据对应的字符串

            包装类中还有一个静态方法,非常常用:
	            以Integer为例;
	            int num = Integer.parseInt(String value);
	            double num = Double.parseDouble(String value);
	            .....
                注意:其中Character没有parseChar方法,因为字符串有charAt,可以直接取出其中的字符

---------------------------------------------------------------------------------------------------
            总结基本类型的使用:
                作为方法的参数
                作为方法的返回值
                作为某个类成员变量
            结论:
                无论是基本类型还是引用类型都是数据类型,所以基本类型可以做的,引用类型也可以做
                int 		a 		= 		10;
                数据类型     变量名			值
                Dog			d		= 		new Dog();
                数据类型	 变量名(对象名)	  值(真正的对象)
                无论是哪种引用类型,我们给他赋值时,总是要创建对象(子类对象/实现类对象,匿名内部类对象);
----------------------------------------------------------------------------------------------------
           普通类作为方法参数和返回值
                结论:当普通类作为方法参数和返回值的时候,我们需要该类的对象

           抽象类作为方法参数和返回值
                结论:当抽象类作为方法参数和返回值的时候,我们需要该类的对象(使用匿名内部类)

           接口作为方法参数和返回值
                结论:当接口作为方法参数和返回值的时候,我们需要该接口的实现类对象(匿名内部类)

           普通类作为成员变量
                结论:当普通类作为成员变量时,给该类成员变量赋值,应该赋值该类的对象

           抽象类作为成员变量
                结论:当抽象类作为成员变量时,给成员赋值时,应该赋值该抽象类的子类对象(匿名内部类对象)

           接口作为成员变量






         */
    }
}
