package com.amao.demo04_泛型;

import java.util.ArrayList;

/**
 * @description: 泛型的好处
 * @params:
 * @return:
 * @author: ItAmao
 * @time: 2020/6/12 11:13
 */
public class Test {


    /**
     * 第一个方法:使用泛型
     */
    public static void main(String[] args) {
        ArrayList<String> arr1 = new ArrayList();
        arr1.add("阿毛");
        arr1.add("18");
        arr1.add("176.9");
        arr1.add("true");
        for (String s : arr1) {
            System.out.println(s+" ,");
        }
    }

    /**
     * 第二个方法:不使用泛型
     */
    public static void method01() {
        ArrayList arr1 = new ArrayList();
        arr1.add("阿毛");
        arr1.add(18);
        arr1.add(176.9);
        arr1.add(true);
        //取出的时候比较麻烦
        for (Object arr : arr1) {

        }
    }
}
