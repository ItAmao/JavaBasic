package com.amao.demo08_System类;

public class SystemDemo02 {
    public static void main(String[] args) {
        //1.获取当前时间距离标准时间的毫秒值
        long start = System.currentTimeMillis();
        //求1-10000
        int sum = 0;
        for (int i = 1; i < 100001; i++) {
            sum+=i;
        }
        long end = System.currentTimeMillis();
        System.out.println("一共耗时:"+(end-start)+"毫秒");
    }
}
