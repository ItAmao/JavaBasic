package com.amao.homework.demo01;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @description: 有以下double数组：
 * <p>
 * ​       double[] arr = {0.1,0.2,2.1,3.2,5.56,7.21};
 * <p>
 * 请编程计算它们的总值及平均值(四舍五入保留小数点后2位)
 * @params:
 * @return:
 * @author: ItAmao
 * @time: 2020/6/10 17:08
 */
public class Test {
    public static void main(String[] args) {
        double[] arr = {0.1, 0.2, 2.1, 3.2, 5.56, 7.21};
        getSumAndAvg(arr);
    }

    public static void getSumAndAvg(double[] arr) {
        int count = 0;//记录总数
        double sum = 0;//总和

        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            count++;
            sum += arr[i];
        }
        BigDecimal b1 = new BigDecimal(sum);
        BigDecimal b2 = new BigDecimal(count);
        BigDecimal avg = b1.divide(b2, 2, RoundingMode.HALF_UP);
        System.out.println("总数为:" + sum);
        System.out.println("平均数为:" + avg);
    }
}
