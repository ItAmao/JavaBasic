package com.amao.Ademo_KP;

/**
 * @description:
 * @params:
 * @return:
 * @author: ItAmao
 * @time: 2020/6/11 09:35
 */
public class Test {
    /**
     *
     */
    public static void main(String[] args) {
    /*
        集合:
            集合是java中提供的一种容器，可以用来存储多个数据。

        集合和数组都是容器,他们有什么区别
            1.数组的长度是固定的,集合的长度是可变的
            2.数组中存储的是同一类型的元素,可以存储任意类型数据.集合存储的都是引用类型数据,
                如果想存储基本类型数据需要存储对应的包装类型

        集合常用类的继承体系
            Collection:单例集合类的根接口,用于存储一系列符合某种规则的元素,它有两个重要的子接口,分别是
                java.util.List和java.util.Set.
                    java.util.List:ArrayList,LinkedList
                    java.util.Set:HashSet,LinkedHashSet
                    其中List的特点是元素有序、元素可重复、元素有索引
                    set的特点:元素不可重复,元素无索引

        3.Collection中的通用方法:
            增:
                public boolean add(E e);//在末尾添加一个元素
                根接口没有在指定索引位置插入元素,根接口不带索引
            删
                public boolean remove(Object object) 删除任意一个元素
                根接口没有在指定索引位置删除元素,根接口不带索引
            改
                无!
            查
                无!
            其他:
                public int size() 获取元素个数
                public boolean contains(Object object) 判断是否包含某个元素
                public boolean isEmpty()  //判空
                public toArray() //把集合中的元素,转成数组
                public void clear() 把所有元素都删除,清空集合
----------------------------------------------------------------------------------------------------------------

            Iterator迭代器(没有索引的情况下)
                1,集合迭代器的介绍和使用
                    迭代器:我们也可以叫遍历器,用于遍历Collection下的所有集合
                        1.获取迭代器--->iterator it=iterator()
                        2.it有2个功能(先判断,在获取)  1.(判断)it.hasNext() 集合中有没有未曾遍历过的元素,返回boolean类型
                                                  2.(获取)it.next() 取出下一个未曾遍历过的元素
                        3.remove():从底层集合中删除此迭代器返回的最后一个元素（可选操作）。(将迭代器新近返回的元素删除)

               2.迭代器的原理
                    迭代器底层是通过一个"指针"进行的

               3.注意事项
                    1.原因: 迭代器的hasNext为false后在继续调用 next方法
                    //没有下一个元素的话 就会抛出异常:NoSuchElementException(没有这样的元素异常)
                    //Exception in thread "main" java.util.NoSuchElementException
                    2.原因: 当使用迭代器遍历集合的过程中,是不允许直接向集合中添加或者删除元素的
                    // ConcurrentModificationException(并发修改异常)
                    //Exception in thread "main" java.util.ConcurrentModificationException

               4.迭代器的作用
                    迭代器的作用就是单纯的遍历

               5.为什么不能添加删除元素:
                    逻辑上讲，迭代时可以添加元素，但是一旦开放这个功能，很有可能造成很多意想不到的情况。
                    比如你在迭代一个ArrayList，迭代器的工作方式是依次返回给你第0个元素，第1个元素，等等，假设当你迭代到第5个元素的时候，
                       你突然在ArrayList的头部插入了一个元素，使得你所有的元素都往后移动，于是你当前访问的第5个元素就会被重复访问。
                    java认为在迭代过程中，容器应当保持不变。因此，java容器中通常保留了一个域称为modCount，每次你对容器修改，这个值就会加1。
                    当你调用iterator方法时，返回的迭代器会记住当前的modCount，随后迭代过程中会检查这个值，
                    一旦发现这个值发生变化，就说明你对容器做了修改，就会抛异常。
----------------------------------------------------------------------------------------------------------------------------
            增强for循环
                1.什么是for循环:
                    对普通循环上格式的一种简化!!!但是原理不一样

                2.格式:
                    for(数据类型 变量名: 集合){

                    }

                3.原理:
                    对于集合来说:增强for循环原理其实就是我们学的迭代器,,因此不能再增强for循环中对集合进行操作
                    对于数组来说:增强for循环原理也是fori

----------------------------------------------------------------------------------------------------------------

                泛型
                    1.什么是泛型
                        泛型其实就是在定义类、接口、方法的时候不局限地指定某一种特定类型，
                        而让类、接口、方法的调用者来决定具体使用哪一种类型的参数。
                        格式:<E> 其中E可以写一种引用类型

                    2.泛型是什么
                        是一种不确定的引用类型,由程序员去定义

                    3.泛型的好处:
                        为什么使用泛型?
                            因为集合存放的数据类型不固定，故往集合里面存放元素时，
                            存在安全隐患，如果在定义集合时，可以想定义数组一样指定数据类型，
                            那么就可以解决该类安全问题。

                    4.泛型的定义和使用:
                        泛型类:
                            含有泛型的类,比如ArrayList<E>
                            格式:
                                正常的类:public class 类名{}
                                泛型的类:public class 类名<E>{}

                        泛型方法:
                            在方法上定义方向
                            格式:
                                先要有泛型,才能用泛型
                                正常的方法: public 返回值类型 方法名(数据类型 变量名){}
                                泛型的方法:pubilc  <E> void show(E age){}

                        泛型接口:
                            在接口上写泛型
                            格式:
                                 正常接口:public interface 接口名{}
                                 泛型的接口:public interface 接口名<E>{}

                            接口上泛型的两种确定方式:
                                a.在实现类实现接口时,直接确定泛型
                                b.在实现类实现接口中,泛型继续保留

                    5.泛型通配符
                        <?>:表示任意泛型均可
                        作用:不知道使用什么类型来接收的时候,此时可以使用?,?表示未知通配符。
                            泛型不支持多态   其中?相当于多态

                    6.泛型的上下限(重点)

                        泛型的上限: <? extends 类名>:  代表该泛型必须是本类或者是子类
                        泛型的下限: <? super 类名> :   代表该泛型必须是本类或者是父类


--------------------------------------------------------------------------------------------------------------------

                    数据结构
                        略
     */
    }
}
