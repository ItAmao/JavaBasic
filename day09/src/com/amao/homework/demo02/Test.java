package com.amao.homework.demo02;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @description: 张三, 男, 20, 79.5
 * *
 * * ​       李四,女,21,80.2
 * *
 * * ​       王五,男,22,77.9
 * *
 * * ​       周六,男,20,55.8
 * *
 * * ​       赵七,女,21,99.9
 * <p>
 * ​    请编写测试类，创建5个对象，分别存储上述值，并计算5名学员的“平均分”(四舍五入到小数点后2位)。
 * @params:
 * @return:
 * @author: ItAmao
 * @time: 2020/6/10 17:20
 */
public class Test {
    public static void main(String[] args) {
        Student stu1 = new Student("张三", "男", 20, 79.5);
        Student stu2 = new Student("李四", "女", 21, 80.2);
        Student stu3 = new Student("王五", "男", 22, 77.9);
        Student stu4 = new Student("周六", "男", 20, 55.8);
        Student stu5 = new Student("赵七", "女", 21, 99.9);
        double sum = stu1.getFraction() + stu2.getFraction() +
                stu3.getFraction() + stu4.getFraction() + stu5.getFraction();

        BigDecimal b1 = new BigDecimal(sum);
        BigDecimal avg = b1.divide(BigDecimal.valueOf(5), 2, RoundingMode.HALF_UP);
        System.out.println("平均分:" + avg);
    }
}
