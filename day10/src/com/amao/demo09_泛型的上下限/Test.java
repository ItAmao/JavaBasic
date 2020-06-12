package com.amao.demo09_泛型的上下限;


import java.util.ArrayList;
import java.util.Collection;

public class Test {
    public static void main(String[] args) {
        Collection<Integer> list1 = new ArrayList<Integer>();
        Collection<String> list2 = new ArrayList<String>();
        Collection<Number> list3 = new ArrayList<Number>();
        Collection<Object> list4 = new ArrayList<Object>();

        //泛型上限: 代表该泛型必须是 本类或者子类
        genericUpper(list1);
        //genericUpper(list2);错误,String类不是Number的本类或者子类
        genericUpper(list3);
        //genericUpper(Object);错误,Object类不是Number的本类或者子类

        //泛型下限: 代表该泛型必须是 本类或者父类
        //genericLower(list1);错误,Integer类不是Number的本类或者父类
        //genericLower(list2);错误,String类不是Number的本类或者父类
        genericLower(list3);
        genericLower(list4);
    }

    /**
     * 泛型上限
     */
    public static void genericUpper(Collection<? extends Number> col) {

    }

    /**
     * 泛型下限
     */
    public static void genericLower(Collection<? super Number> col) {

    }
}
