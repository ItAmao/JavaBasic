package com.amao.demo5_以后开发中static的应用;

/**
 * @Author：pengzhilin
 * @Date: 2020/6/4 9:27
 */
public class Utils {
    public static final double PI = 3.1415926;
    public static final int WIDTH = 800;
    public static final int HEIGHT = 800;

    // 找int数组中的最大值
    public static int getArrayMax(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
