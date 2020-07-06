package com.amao.demo02_反射;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 反射
 *      1.概念:
 *          反射是一种机制,在程序运行期间可以动态的获取类里边的所有信息去做执行
 *
 *  @Author : ItAmao
 *  @Date   : 2020/7/5 09:10
 */
public class Test01 {
    /**
     *  获取字节码对象的三种方式
     */
    @Test
    public void test1() throws ClassNotFoundException {
        //1.使用类名调用.class属性
        Class clazz1 = Person.class;
        System.out.println(clazz1);

        //2.使用对象去调用getClass方法
        Person p1 = new Person() {
            @Override
            public void work() {

            }

            @Override
            public void eat() {

            }
        };
        Class clazz2 = p1.getClass();
        System.out.println(clazz2);

        //3.使用Class的静态方法forName()
        Class clazz3 = Class.forName("com.amao.demo02_反射.Person");
        System.out.println(clazz3);
    }

    /**
     * 反射获取构造方法 并执行
     */
    @Test
    public void test2() throws Exception {
        //1.获取一个类的字节码对象
//        Class clazz1 = Person.class;
//        Class clazz2 = new Person().getClass();
        Class clazz = Class.forName("com.amao.demo02_反射.Person");

        //获取一个空参构造
        Constructor con1 = clazz.getConstructor();
        //System.out.println(con1);//public com.amao.demo02_反射.Person()

        //获取一个有参构造
        Constructor con2 = clazz.getConstructor(String.class, int.class);
        //System.out.println(con2);//public com.amao.demo02_反射.Person(java.lang.String,int)

        //2.执行当前构造方法创建对象
        //空参构造
        Object obj1 = con1.newInstance();
        System.out.println(obj1);//Person{name='null', age=0}

        //有参构造
        //Person obj2 = (Person) con2.newInstance("阿毛", 23);
        Person obj2 = (Person) con2.newInstance("阿毛", 23);//Person{name='阿毛', age=23}
        System.out.println(obj2);

        //3.获取所有的构造方法
        Constructor[] cons = clazz.getConstructors();
        for (Constructor conss : cons) {
            System.out.println(conss);
        }
    }

    /**
     * 反射获取成员方法
     */
    @Test
    public void test3() throws Exception {
        //获取类的字节码对象
        Class clazz = Class.forName("com.amao.demo02_反射.Person");

        //获取构造方法
        Constructor c1 = clazz.getConstructor();
        Object obj = c1.newInstance();

        //获取有参构造
//        //获取所有的成员方法
//        Method[] m1 = clazz.getMethods();
//        for (Method method1 : m1) {
//            System.out.println(method1);
//        }
        //获取某个成员方法
        //第一个参数代表方法的名字,第二个参数是方法里边参数的类型
        Method m1 = clazz.getMethod("show1");
        //执行invoke方法
        //第一个参数是哪个对象,第二个是方法的方法的实际参数
        /*
            正常写法:
            Person p=new Person();
            p.show1();
            Person对象 show1方法 实际参数

            反射方法:
             1.获取构造方法
             2.调用.getMethod方法
             3.调用invoke方法获取返回

         */
        //无返回值的方法
        m1.invoke(obj);
        //
        Method m2 = clazz.getMethod("show", String.class);
        m2.invoke(obj, "阿毛");
        //有返回值的方法
        Method m3 = clazz.getMethod("show2");
        Object o = m3.invoke(obj);
        System.out.println(o);

    }

    /**
     * 暴力反射
     *  可以获取任何权限的成员,写法:在之前的方法中间加个Declared
     *  一般不建议使用暴力反射,打破了java的正常权限规则
     */
    @Test
    public void test4() throws Exception {
        //获取类的字节码对象
        Class clazz = Class.forName("com.amao.demo02_反射.Person");

        //获取构造方法
        Constructor con1 = clazz.getDeclaredConstructor(String.class);
        con1.setAccessible(true);
        //创建对象
        Object o = con1.newInstance("阿毛");
        System.out.println(o);

        //获取私有方法
        Method m1 = clazz.getDeclaredMethod("showNation", String.class);
        m1.setAccessible(true);
        m1.invoke(o, "中国");
    }

    /**
     * 反射操作成员变量
     * 成员变量被私有修饰,不要直接的操作他
     */
    @Test
    public void test5() throws Exception {
        //1.获取字节码对象
        Class clazz1 = Class.forName("com.amao.demo02_反射.Person");

        //2.获取构造方法
        Constructor con1 = clazz1.getConstructor();

        //3.创建对象
        Object obj1 = con1.newInstance();

        //4.获取方法
        Method m1 = clazz1.getMethod("setName", String.class);
        m1.invoke(obj1, "阿毛");
        System.out.println(obj1);//Person{name='阿毛', age=0}

        //5.获取成员变量
        Field name = clazz1.getDeclaredField("name");
        name.setAccessible(true);
        //给变量赋值
        name.set(obj1, "1毛");
        System.out.println(obj1);
    }

}