package com.amao.demo04_Comparator比较器;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(14);
        arr.add(44);
        arr.add(13);
        arr.add(24);
        arr.add(46);
        arr.add(57);
        arr.add(25);
        arr.add(47);
        //2.比较器排序
//        Collections.sort(arr, new Comparator<Integer>() {
//            //Comparator称为比较方法
//            //返回值表示比较的结束
//            //返回值>0  说明o1>o2 返回值<0  说明o1<o2 返回值=0  说明o1=o2
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                //口诀 : 升序 前o1-后o2   降序 后o2-前o1
//                return o2 - o1;
//            }
//        });
        Collections.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                //return o1 - o2;//升序
                return o2 - o1;//降序
            }
        });
        System.out.println("降序:" + arr);
    }
}
