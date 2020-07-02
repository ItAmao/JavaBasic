package com.amao.demo04_字符缓冲流;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeSet;

/**
 *  出师表文本排序,根据打乱的顺序,然后进行1-7排序
 *
 *  @Author : ItAmao
 *  @Date   : 2020/6/30 17:32
 */
public class Test05 {
    @Test
    public void testSort() {
        BufferedReader bufferedReader = null;
        String path = "/Users/mao/Documents/code/basic/day22/src/com/amao/demo04_字符缓冲流/3.txt";
        try {
            //1.创建文件对象
            File file = new File(path);
            //2.造流
            //2.1 字符读取流
            FileReader fileReader = new FileReader(file);
            //2.2 套流:因为需要有读取一行的操作
            bufferedReader = new BufferedReader(fileReader);
            //3.利用TreeSet的自动排序,创建TreeSet对象
            TreeSet<String> treeSet = new TreeSet<>();
            //4.循环遍历读取到的流
            String str = "";
            while ((str = bufferedReader.readLine()) != null) {
                treeSet.add(str);
            }
            //5.遍历treeSet
            for (String s : treeSet) {
                System.out.println(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //6.关闭流
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
