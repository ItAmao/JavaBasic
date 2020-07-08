package com.amao.demo01_枚举;

/**
 *  使用eumn关键字使用枚举类
 *      说明:定义的枚举类继承 java.lang.Enum
 *  @Author : ItAmao
 *  @Date   : 2020/7/8 11:09
 */
interface Info {
    void show();
}

enum Season2 implements Info {
    //1.提供当前枚举类的对象,多个对象之间用,隔开 末尾用;结束
    SPRING("春天", "春暖花开"){
        @Override
        public void show() {
            System.out.println("这是春天");
        }
    },
    SUMMER("夏天", "夏日炎炎"){
        @Override
        public void show() {
            System.out.println("这是夏天");
        }
    },
    AUTUMN("秋天", "秋高气爽"){
        @Override
        public void show() {
            System.out.println("这是秋天");
        }
    },
    WINTER("冬天", "冰天雪地"){
        @Override
        public void show() {
            System.out.println("这是冬天");
        }
    };

    //2.声明Season对象的属性:需要用private final修饰
    private final String seasonName;
    private final String seasonDesc;

    //2.私有化类的构造器,并给我们对象属性赋值
    private Season2(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    //4.获取枚举类对象的属性
    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

//    @Override
//    public void show() {
//        System.out.println("这是一个季节");
//    }

//    @Override
//    public String toString() {
//        return "Season2{" +
//                "seasonName='" + seasonName + '\'' +
//                ", seasonDesc='" + seasonDesc + '\'' +
//                '}';
//    }
}

public class Test03 {
    public static void main(String[] args) {
        Season2 summer = Season2.SUMMER;

        //System.out.println(Season2.class.getSuperclass());
        //toString方法
        System.out.println(summer.toString());
        System.out.println("");
        //values()
        Season2[] values = Season2.values();
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }
        System.out.println("");
        Thread.State[] values1 = Thread.State.values();
        for (int i = 0; i < values1.length; i++) {
            System.out.println(values1[i]);
        }

        //valueOf(String objName)
        //返回枚举类中对象名是ObjName的对象
        Season2 winter = Season2.valueOf("WINTER");
        System.out.println(winter);

        winter.show();
    }

}
