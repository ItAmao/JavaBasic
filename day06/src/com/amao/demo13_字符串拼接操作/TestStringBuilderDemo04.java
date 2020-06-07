package com.amao.demo13_字符串拼接操作;

public class TestStringBuilderDemo04 {
    public static void main(String[] args) {
        //需求:定义一个方法，把 int 数组中的数据按照指定的格式拼接成一个字符串返回，调用该方法，
        //调用方法
        int[] arr = {1,2,3,4,5,6,7,8};
        String arrStr = array2String(arr);
        System.out.println(arrStr);
    }

    //定义方法
    //参数: int[] arr
    //返回值: String
    public static String array2String(int[] arr){
        //把arr数组按照指定的格式拼接成一个字符串
        //[1, 2, 3]
        StringBuilder sb = new StringBuilder("[");
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                //如果是最后一个元素
                sb.append(arr[i]).append("]");
            }else{
                //如果不是最后一个元素
                sb.append(arr[i]).append(", ");
            }
        }
        //返回结果
        return sb.toString();
    }
}
