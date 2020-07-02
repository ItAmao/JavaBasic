package com.amao.demo04_字符缓冲流;

import java.io.*;

/**
 * 练习题:出师表排序
 *
 *
 *  @Author : ItAmao
 *  @Date   : 2020/6/30 10:31
 */
public class Test02 {
    public static void main(String[] args) throws IOException {
        //1.创建文件对象
        String path1 = "/Users/mao/Documents/code/basic/day22/src/com/amao/4.txt";

        /**
         * 使用TreeSet 排序
         * 创建一个用于排序的集合
         * 循环读取文件内容,把读到的数据放入集合中,TreeSet自动排序
         */
        String path2 = "/Users/mao/Documents/code/basic/day22/src/com/amao/5.txt";
        File file1 = new File(path1);
        File file2 = new File(path2);
        //2.造流
        //2.1字符流
        FileReader fileReader = new FileReader(file1);
        FileWriter fileWriter = new FileWriter(file2);
        //2.2套流
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        //3.复制粘贴操作细节
        String len;


    }

}
