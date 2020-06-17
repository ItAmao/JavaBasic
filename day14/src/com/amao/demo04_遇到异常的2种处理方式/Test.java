package com.amao.demo04_遇到异常的2种处理方式;

import java.io.FileNotFoundException;

public class Test {
    public static void main(String[] args){
        //调用方法
        try {
            readFile("11.txt");
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        System.out.println("程序继续执行..");
    }
    //定义一个方法.读取某个文件
    public static void readFile(String filename) throws FileNotFoundException {
        //假设:硬盘只有一个文件叫做1.txt
        if ("1.txt".equals(filename)) {
            System.out.println("读取文件成功...");
        }else{
            //抛出异常
            throw new FileNotFoundException("您要的文件"+filename+"没有找到..");
        }
    }
}
