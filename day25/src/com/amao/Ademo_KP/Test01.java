package com.amao.Ademo_KP;

/**
 *  @Author : ItAmao
 *  @Date   : 2020/7/4 16:07
 */
public class Test01 {
    /**
     * Java反射机制
     *  1.概述:
     *      Reflection(反射)是被视为动态语言的关键,反射机制允许程序在执行期借助于Reflection API取得任何类的内部信息
     *      并能直接操作任意对象内部属性及方法
     *
     *      加载完类之后,在堆内存的方法区就产生了一个Class类型的对象(一个类只有一个Class对象),这个对象就包含了完整的类的结构信息
     *      .我们可以通过这个对象看到类的结构,这个对象就像一面镜子,透过这个镜子看到类的结构,所以,我们形象的称之为:反射
     *
     *      正常方式: 引入需要的"包类"名称 ---> 通过new实例化 ----> 取得实例化对象
     *      反射方式:实例化对象 -----> getClass()方法 ------> 得到完整的"包类结构"
     *
     *  2.Java反射机制提供的功能
     *      在运行时判断任意一个对象所属的类
     *      在运行时构造任意一个类的对象
     *      在运行时判断任意一个类所具有的成员变量和方法
     *      在运行时获取泛型信息
     *      在运行时候调用任意一个对象的成员变量和方法
     *      在运行时处理注解
     *      生成动态代理
     *
     *  3.反射相关的主要API
     *      java.lang.Class;代表一个类
     *      java.lang.reflect.Method:代表类的方法
     *      java.lang.reflect.Field:代表类的成员变量
     *      java.lang.reflect.Constructor:代表类的构造器
     *      ....
     *
     *  4.关于java.lang.Class类的理解
     *      1.类的加载过程:
     *          编译:
     *          程序在经过javac.exe命令以后,会生成一个或多个字节码文件.class结尾,
     *          解释运行:
     *          接着我们使用java.exe这个命令对某个字节码文件进行解释运行.相当于将某个字节码文件加载到内存中.此过程就称为类的加载
     *
     *          加载到内存中的类,就叫运行时类,这个类就作为Class的一个实例
     *          换句话说Class的实例就对应着运行时类
     *          加载到内存中的运行时类,会缓存一定的时间,在此时间之内,我们可以通过不同的方式来获取此运行时类
     *
     *      2.类的加载过程
     *          当程序主动使用某个类时,如果该类还未被加载到内存中,则系统会通过如下三个步骤
     *          1.类的加载 Load
     *          将类的class文件读入内存,并为之创建一个java.lang.Class对象,此过程由类加载器完成
     *          2.类的链接 Link
     *          将类的二进制数据合并到JRE中
     *          3.类的初始化
     *          JVM负责对类进行初始化
     *
     *      详细过程
     *      加载:
     *          将class文件字节码内容加载到内存中，并将这些静态数据转换成方法区的运行时数据结构，
     *          然后生成一个代表这个类的java.lang.Class对象，作为方法区中类数据的访问 入口(即引用地址)。
     *          所有需要访问和使用类数据只能通过这个Class对象。这个加载的 过程需要类加载器参与。
     *
     *      链接:将Java类的二进制代码合并到JVM的运行状态之中的过程。
     *          验证:确保加载的类信息符合JVM规范，例如:以cafe开头，没有安全方面的问题
     *          准备:正式为类变量(static)分配内存并设置类变量默认初始值的阶段，这些内存都将在方法区中进行分配。
     *          解析:虚拟机常量池内的符号引用(常量名)替换为直接引用(地址)的过程。
     *
     *      初始化:
     *          1.执行类构造器<clinit>()方法的过程。类构造器<clinit>()方法是由编译期自动收集类中
     *              所有类变量的赋值动作和静态代码块中的语句合并产生的。(类构造器是构造类信息的，不是构造该类对象的构造器)。
     *          2.当初始化一个类的时候，如果发现其父类还没有进行初始化，则需要先触发其父类的初始化。
     *          3.虚拟机会保证一个类的<clinit>()方法在多线程环境中被正确加锁和同步。
     *
     *      3.类加载器的作用:
     *          类加载器的作用:将class文件字节码内容加载到内存中,并将这些静态数据转换成方法区的运行时数据结构,然后在堆中生成一个
     *                      代表这个类的java.lang.Class对象,作为方法区中类数据的访问入口
     *          类缓存:标准的JavaSE类加载器可以按要求查找类,但一旦某个类加载到类加载器中,它将维持加载(缓存)一段时间
     *                不过JVM垃圾回收机制可以回收这些Class对象
     *
     *      ClassLoader:类加载器作用是用来把类class装载进内存中,JVM规范定义了如下类型的类的加载器
     *
     *      引导类加载器: 用C++编写的,是JVM自带的类加载器,负责java平台核心库,用来装载核心类库,该加载器无法直接获取
     *      扩展类加载器: 负责jre/lib/ext目录下的jar包或 – D java.ext.dirs 指定目录下的jar包装入工作库
     *      系统类加载器: 负责java –classpath 或 –D java.class.path所指的目录下的类与jar包装入工作 ，是最常用的加载器
     *
     *-----------------------------------------------------------------------------------------------------
     *  动态语言和静态语言
     *      1.动态语言
     *          是一类在运行时可以改变其结构的语言,通俗点就是在运行时代码可以根据某些条件改变自身结构
     *      2.静态语言
     *          与动态语言相对于,运行时结构不可改变的语言就是静态语言
     *
     *      ps:java不是动态语言,但java可以称为准动态语言,即java有一定的动态性,我们可以利用反射机制,字节码操作
     *          获得类似语言的特性.
     *          java的动态性让编程的时候更加灵活
     *
     *-----------------------------------------------------------------------------------------------------
     *  反射的应用:动态代理
     *      静态代理:代理类和目标对象的类都是在编译期间确定下来,不利于程序的扩展.
     *      动态代理:是指客户通过代理类来调用其他对象的方法,并且是在程序运行时根据需要动态创建目标类的代理对象
     *
     *      动态代理使用场合:调试 远程方法调用
     *
     *      动态代理相比于静态代理的优点:
     *          抽象角色中(接口)声明的所有方法都被转移到调用处理器一个集中的方法中处理,这样,我们可以更加灵活和统一的处理
     *          众多的方法
     *
     *
     */
    public static void main(String[] args) {

    }
}