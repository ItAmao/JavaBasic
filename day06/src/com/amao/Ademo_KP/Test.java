package com.amao.Ademo_KP;

public class Test {
    public static void main(String[] args) {
        /*
            String 类:
                  概述:String类代表字符串。 Java程序中的所有字符串文字（例如"abc" ）都被实现为此类的实例。都是String的对象
            String类的使用
                public String();                作用:初始化新创建的 String对象，使其表示空字符序列。
                public String("字符串的内容");    作用:初始化新创建的String对象，使其表示与参数相同的字符序列; 换句话说，新创建的字符串是参数字符串的副本。
                public String(char[] chs);      作用:分配一个新的 String ，以便它表示当前包含在字符数组参数中的字符序列。
                public String(byte[] bs);       作用:通过使用平台的默认字符集解码指定的字节数组来构造新的 String 。
                public String(byte[] bs,int startIndex,int len): 作用:分配一个新的 String ，其中包含字符数组参数的子阵列中的字符。

            字符串(String)特点
                1.字符串的不可变,一旦字符串对象创建后,内容不可变
                2.字符串常量("hello","ab"),由于不可变性.所以可以被共享(内容一致)地址值一样 == 表示比较地址值 一样true 否则 false

            创建String对象的方式有两种
            String s1 = "Java";
                    在编译期，JVM会去常量池来查找是否存在“Java”，如果不存在，就在常量池中开辟一个空间来存储“Java”；
                    如果存在，就不用新开辟空间。然后在栈内存中开辟一个名字为s1的空间，来存储“Java”在常量池中的地址值
            String s2 = new String("Java");
                    s2首先在常量池查找字符串“Java”，如果存在，复制一份引用到堆上，
                    返回堆的引用。如果不存在，在常量池创建一个字符串常量，然后复制一份引用到堆上，然后返回堆的引用。
                    在编译阶段JVM先去常量池中查找是否存在“Java”，如果不存在，则在常量池中开辟一个空间存储“Java”。
                    在运行时期，通过String类的构造器在堆内存中new了一个空间，然后将String池中的“Java”复制一份存放到该堆空间中，
                    在栈中开辟名字为s2的空间，存放堆中new出来的这个String对象的地址值。

            总结:只有直接使用双引号""包起来的字符串,或者两个字符串常量相加的字符串,才会保存到常量池
                其他的任何情况,都在堆区中.
                String s1="abc";        存在常量池
                String s2="abc"+"bcd";  存在常量池
                String s3=s1+"bcd";     存在堆内存


------------------------------------------------------------------------------------------------------------------
        String的判断方法:
            看源码:

            判断:
                public boolean equals(String anObject);//将此字符串与指定对象比较内容
                public boolean equalsIgnoreCase (String anotherString);//将此字符串与指定对象比较内容(忽略大小写)
                public boolean contains(String s);//判断当前字符串是否包含指定内容
                public boolean startsWith(String prefix);//判断当前字符串是否以指定字符串开头
                public boolean endsWith(String suffix);//判断当前字符串是否以指定字符串结尾

            获取功能的方法:
                public int length(); //获取字符串中字符的个数
                public String concat(String str);//连接当前字符串和指定字符串,返回连接后的新字符串对象
                public char charAt(int index);//获取字符串中指定索引位置的那个字符
                public int indexOf(String str);//从当前字符串中查找指定字符串第一次出现的索引,如果找不到,返回-1
                public int lastIndexOf(String str);
							//从当前字符串中查找指定字符串最后一次出现的索引,如果找不到,返回-1
                public String substring(int beginIndex);
						//从当前字符串的指定索引位置开始截取直到结束,返回截取出来的字符串对象
                public String substring(int beginIndex,int endIndex);
                        //从当前字符串的指定索引位置开始截取到指定索引位置结束截取字符串,返回截取出来的字符串对象(含头不含尾)

            转换:
                public char[] toCharArray();将当前字符串转成字符数组
                public byte[] getBytes();将当前字符串转成字节数组
                public String toLowerCase();将当前字符串转成小写字符串
                public String toUpperCase();将当前字符串转成大写字符串
                public String replace(String old,String replace);将当前字符串中的指定字符串替换为新新字符串

            分割:
                public String[] split(String regex);把当前字符串按照指定的分割符进行分割,返回字符串数组
                public String trim();删除当前字符串两端两端两端的空格
---------------------------------------------------------------------------------------------------------------

            StringBuilder 类
                 概述: StringBuilder是一个可变的字符序列(俗称字符串)

                 和String的区别:
                    1.String是不可变的,StringBuilder内容不是固定的,是可变的

                 StringBuilder类的构造方法
                    public StringBuilder(); 创建一个空内容的StringBuilder对象,
                    public StringBuilder(String str); 创建一个指定内容的StringBuilder对象

                 StringBuilder类添加和反转方法
                    add,append
                    public StringBuilder append(任意类型)  该方法返回当前对象本身,因此支持链式编程

                    public StringBuilder reverse(); 反转

                    public String toString();  返回字符串


             */
    }
}
