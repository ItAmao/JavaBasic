package com.amao.demo05_正则表达式;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *  @Author : ItAmao
 *  @Date   : 2020/7/7 16:18
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("张三", 17, 1.86));
        list.add(new Student("李四", 19, 1.82));
        list.add(new Student("王五", 21, 1.78));
        list.add(new Student("周六", 19, 1.81));
        list.add(new Student("赵四", 20, 1.79));
        //计算平均身高
        double sum = 0;

        //遍历获取和除以人数得出平均值
        for (int i = 0; i < list.size(); i++) {
            double h = list.get(i).getHeight();
            sum += h;
        }
        BigDecimal b1 = new BigDecimal(sum);
        BigDecimal b2 = new BigDecimal(list.size());
        BigDecimal b3 = b1.divide(b2, 2, RoundingMode.HALF_UP);
        System.out.println("所有学员的平均身高为" + b3);
        //排序,用比较器
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                //年龄降序
                if ((s2.getAge() - s1.getAge()) == 0) {
                    double height = s1.getHeight() - s2.getHeight();
                    if (height < 0) {
                        return -1;
                    } else {
                        return 1;
                    }
                }
                return s2.getAge() - s1.getAge();
            }
        });

        System.out.println(list);
    }
}
