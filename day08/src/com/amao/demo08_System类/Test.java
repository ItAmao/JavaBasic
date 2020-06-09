package com.amao.demo08_System类;

public class Test {
    public static void main(String[] args) {
        //1.获取当前时间距离标准时间的毫秒值
        long startTime = System.nanoTime();//纳秒
        long time = System.currentTimeMillis();//毫秒
        long endTime = System.nanoTime();

        //数组的复制 System.arraycopy(源数组,起始索引,目标数组,起始索引,复制的个数(从索引位置开始往后的几个数));

        int[] nums1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 22, 33, 44, 55, 66, 77, 88};
        int[] nums2 = new int[nums1.length];

        System.arraycopy(nums1, 2, nums2, 1, 6);
        for (int i = 0; i < nums2.length; i++) {
            System.out.print(nums2[i] + ", ");
        }
    }
}
