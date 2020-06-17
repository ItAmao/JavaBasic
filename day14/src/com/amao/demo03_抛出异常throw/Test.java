package com.amao.demo03_抛出异常throw;

public class Test {
    public static void main(String[] args) {
        int[] arr = {11,22};
        show(arr);
    }

    public static void show(int[] arr){
        //1.判断arr是否为null
        if (arr == null) {
            throw new NullPointerException("哥们数组不能为null");
        }
        //2.判断arr是否长度大于2
        if (arr.length < 3){
            throw new ArrayIndexOutOfBoundsException("哥们数组长度不太够...");
        }
        //对数组进行模型操作....
        int num = arr[2];
        System.out.println(num);
    }
}
