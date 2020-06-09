package com.amao.demo08_System类;

public class SystemDemo03 {
    public static void main(String[] args) {
        //数组复制
//        System.arraycopy(源数组,起始索引,目标数组,起始索引,复制的个数);
        int[] nums1 = {11,22,33,44,55,66,77,88,99};
        int[] nums2 = new int[9];

        //复制数组
        System.arraycopy(nums1,2,nums2,1,5);

        for (int i = 0; i < nums2.length; i++) {
            System.out.print(nums2[i]+" ");
        }

    }
}
