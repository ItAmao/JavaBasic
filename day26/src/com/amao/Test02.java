package com.amao;

import org.junit.Test;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *  @Author : ItAmao
 *  @Date   : 2020/7/6 18:21
 */
public class Test02 {
    @Test
    public void test1() {
        String path1 = "/Users/mao/Documents/code/basic/day26/src/com/amao/test2.txt";
        String path2 = "/Users/mao/Documents/code/basic/day26/src/com/amao/test3.txt";
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        HashMap<String, Integer> hm1 = read(hm, path1);
        write(hm1, path2);
    }

    /**
     * 读取test2.txt文件的内容（不允许使用Properties类），存储到一个Map中，
     */
    public static HashMap<String, Integer> read(HashMap<String, Integer> hm, String path) {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                //分割字符串
                String[] split = line.split(",");
                //第一个为key,第二个为value
                //元需要去掉
                String value = split[1].substring(0, split[1].indexOf("元")); //取出Integer
                System.out.println(value);
                hm.put(split[0], Integer.parseInt(value));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return hm;
    }

    /**
     * 遍历Map，删除所有价格小于1000元的商品，并再次写回文件。
     */
    public static void write(HashMap<String, Integer> hm, String path) {
        Set<String> set = hm.keySet();
        Iterator<String> it = set.iterator();
        //根据商品获取价格
        while (it.hasNext()) {
            //System.out.println(hm.get(it.next()));//获取价格
            Integer value = hm.get(it.next());
            if (value < 1000) {
                it.remove();
            }
        }
        //System.out.println(hm);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            //遍历集合

            Set<Map.Entry<String, Integer>> entrySet = hm.entrySet();
            for (Map.Entry<String, Integer> entry : entrySet) {
                bw.write(entry.getKey() + "," + entry.getValue());
                //需要换行
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
