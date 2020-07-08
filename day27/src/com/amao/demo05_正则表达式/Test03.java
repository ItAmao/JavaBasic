package com.amao.demo05_正则表达式;

import org.junit.Test;

import java.util.Scanner;

/**
 *  @Author : ItAmao
 *  @Date   : 2020/7/7 17:38
 */
public class Test03 {
    @Test
    public void test1() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 14, 15};
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == num) {
                System.out.println("查找成功");
                System.exit(0);
            } else if (arr[mid] > num) {
                right = mid - 1;
            } else if (arr[mid] < num) {
                left = mid + 1;
            }
        }
        System.out.println("无");
    }
}
