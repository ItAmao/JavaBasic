package com.amao.homework.demo10;

public class Test {
    public static void main(String[] args) {
        //   有以下数组：
        //
        //   int[] arr = {10,27,8,5,2,1,3,55,88};
        //
        //​    请定义一个新数组，长度为5，并将arr中几个连续的1位数的数字复制到新数组。
        //System.arraycopy(源数组,起始索引,目标数组,起始索引,复制的个数);
        int[] arr = {10, 27, 8, 5, 2, 1, 3, 55, 88};
        int[] nums = new int[5];
        System.arraycopy(arr, 2, nums, 0, 5);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ",");
        }
    }
}
