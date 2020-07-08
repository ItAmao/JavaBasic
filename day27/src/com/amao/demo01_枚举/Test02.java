package com.amao.demo01_枚举;

/**
 * 1.枚举类的使用
 *      枚举类的理解:
 *           1类的对象只有有限个,确定的,我们称此类为枚举类
 *           2当需要定义一组常量时,强烈建议使用枚举类
 *           3.如果枚举类中只有一个对象,则可以作为单例模式的实现方式
 *  2.如何定义枚举类
 *      方式一:jdk5.0之前,自定义枚举类
 *      方式二:jdk5.0时,可以使用enum关键字定义枚举类
 *
 *  3.Enum类的常用方法
 *      values()方法:返回枚举类型的对象数组,该方法可以很方便的遍历所有的枚举类
 *      valueOf(String str):可以把一个字符串转为对应的枚举类对象,要求字符串必须是枚举类对象的名字
 *      toString():返回当前枚举类对象常量的名字
 *
 *  4.使用enum关键字定义的枚举类实现接口的情况
 *      情况一:实现接口,在enum类中实现抽象方法
 *      情况二:让我们的枚举类的对象分别实现接口中的抽象方法
 *
 *
 *  @Author : ItAmao
 *  @Date   : 2020/7/8 10:52
 */
//自定义枚举类
class Season1 {
    //1.声明Season对象的属性:需要用private final修饰
    private final String seasonName;
    private final String seasonDesc;

    //2.私有化类的构造器,并给我们对象属性赋值
    private Season1(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    //3.提供当前枚举类的多个对象 声明为public static final
    public static final Season1 SPRING = new Season1("春天", "春暖花开");
    public static final Season1 SUMMER = new Season1("夏天", "夏日炎炎");
    public static final Season1 AUTUMN = new Season1("秋天", "秋高气爽");
    public static final Season1 WINTER = new Season1("冬天", "冰天雪地");

    //4.获取枚举类对象的属性
    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    @Override
    public String toString() {
        return "Season1{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}



public class Test02 {
    public static void main(String[] args) {
        Season1 spring = Season1.SPRING;
        System.out.println(spring);
    }
}

