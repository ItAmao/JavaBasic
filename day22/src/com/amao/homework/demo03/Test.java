package com.amao.homework.demo03;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/**
 *  @Author : ItAmao
 *  @Date   : 2020/6/30 19:52
 */
public class Test {
    public static void main(String[] args) throws IOException {
        String path = "/Users/mao/Documents/code/basic/day22/src/com/amao/homework/demo03/2.txt";
        File file = new File(path);
        FileReader fileReader = new FileReader(file);
        Properties properties = new Properties();
        properties.load(fileReader);
        Set<String> strings = properties.stringPropertyNames();
        for (String string : strings) {
            System.out.println(string + ":" + properties.get(string));
        }
        fileReader.close();
    }
}
