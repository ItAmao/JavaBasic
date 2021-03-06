package com.amao.Ademo_KP;

public class Test {
    public static void main(String[] args) {
        /*
        (1)为什么出现集合类？
		    面向对象对事物的体现都是以对象的形式，为了方便对多个对象的操作，就对对象进行存储。
		    集合就是存储对象最常用的一种方式.

        (2)数组和集合都是容器，两者有何不同？
                数组长度固定，而集合长度是可变的
                数组值可以存储对象，还可以存储基本数据类型;而集合只能存储对象
                数组存储数据类型是固定的，而集合存储的数据类型不固定

            1.集合与数组存储数据概述:
                集合、数组都是对多个数据进行存储操作的结构,简称java容器
                说明:此时的存储,主要指的是内存层面的存储,不仅涉及到持久化的存储
            2.数组存储的特点:
                1.一旦初始化以后,其长度就确定了
                2.数组一旦定义好,其元素的类型也就确定了,我们也就只能操作指定类型的数据
            3.数组存储的弊端:
                1.一旦初始化以后,长度就不可修改
                2.数组中提供的方法非常限,对于添加,删除,插入数据等操作,非常不便,同时效率不高
                3.获取数组中实际元素的个数的需求,数组没有现成的属性或方法可用
                4.数据存储数据的特点: 序:可重复性  对于无序,不可重复的需求不能满足

            4.集合存储的优点:
                能够解决数据存储数据方面的弊端
-----------------------------------------------------------------------------------------------------------

            1.单例集合框架结构
                Collection接口: 单列集合,用来存储一个一个的对象
                         list接口:存储序的,可重复的数据   动态数组
                            ArrayList,LinkedList,Vector
                         set接口:存储无序的,不可重复的数据
                            HashSet,LinkedHashSet,TreeSet
             |--->ArrayList(JDK1.2):底层的数据结构是数组数据结构，特点是查询速度快(因为带角标)，
					但是增删速度稍慢,因为当元素多时，增删一个元素则所有元素的角标都得改变

-------------------------------------------------------------------------------------------
        1）对于==，比较的是值是否相等
               1.如果作用于基本数据类型的变量，则直接比较其存储的 “值”是否相等；
　　　　         2.如果作用于引用类型的变量，则比较的是所指向的对象的地址
　　     2）对于equals方法，注意：equals方法不能作用于基本数据类型的变量，equals继承Object类，
            比较的是是否是同一个对象
　　　　        1.如果没有对equals方法进行重写，则比较的是引用类型的变量所指向的对象的地址；
　　　　        2.诸如String、Date等类对equals方法进行了重写的话，比较的是所指向的对象的内容。

--------------------------------------------------------------------------------------------
            构造方法:
	            public ArrayList();创建一个实际只有0个元素的集合(初始容量为10)
            成员方法:
	            增:
		            public boolean add(元素); 向集合最后面添加元素,返回值代表是否添加成功
		            public void add(int index,元素);向集合指定位置添加元素
	            删:
		            public boolean remove(元素); 删除指定的元素,返回值代表是否删除成功
		            public E remove(int index); 删除指定位置的元素,返回被删除的那个元素
	            改:
		            public E set(int index,新元素); 将指定索引的元素改为新的元素,返回被修改的元素
	            查:
		            public int size(); 获取集合中实际元素的个数
                    public E get(int index); 获取指定位置的元素
----------------------------------------------------------------------------------------------------
           为什么使用泛型?
                因为集合存放的数据类型不固定，故往集合里面存放元素时，
                存在安全隐患，如果在定义集合时，可以想定义数组一样指定数据类型，
                那么就可以解决该类安全问题。
            什么是泛型?
                泛型其实就是在定义类、接口、方法的时候不局限地指定某一种特定类型，
                而让类、接口、方法的调用者来决定具体使用哪一种类型的参数。
----------------------------------------------------------------------------------------------
            a。集合中的泛型不能是基本类型,只能使用引用类型
                ArrayList<int> ArrayList<double> 这么是错误的
            b.Java为8中基本类型,提供了对应的引用类型,我们一般称为基本类型的包装类,简称包装类
            集合中的泛型不能是基本类型,只能使用引用类型
            java为8种基本类型,提供了引用类型,我们一般称为基本类型的包装类,简称包装类
                byte        Byte
                short       Short
                char        Character
                int         Integer
                long        Long
                float       Float
                double      Double
                boolean     Boolean
         */

    }
}
