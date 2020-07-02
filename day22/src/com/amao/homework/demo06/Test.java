package com.amao.homework.demo06;

import java.io.*;
import java.util.ArrayList;

/**
 *  @Author : ItAmao
 *  @Date   : 2020/6/30 20:02
 */
public class Test {
    public static void main(String[] args) throws IOException {
        String path = "/Users/mao/Documents/code/basic/day22/src/com/amao/homework/demo06/1.txt";
        File file = new File(path);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        ArrayList<String> arrayList = new ArrayList<>();
        String len = "";
        while ((len = bufferedReader.readLine()) != null) {
            arrayList.add(len);
        }
        bufferedReader.close();
        for (String s : arrayList) {
            System.out.println(s);
        }
    }
}
