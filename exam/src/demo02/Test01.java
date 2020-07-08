package demo02;

/**
 *  @Author : ItAmao
 *  @Date   : 2020/7/7 20:13
 */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Set;

/**
 * 生成10个1-100之间的随机数，并存放到一个数组中：
 * (1)   把数组中大于等于10的数字放到一个list集合中
 * (2)   把数组中小于10的数字放到一个map集合中，索引作为key,元素作为value。
 * (3)   判断map集合中是否存在元素，如果没有元素则在控制台提示；
 *       如果有则使用字符输出流将map集合中的元素（key值和value值之间用':'间隔）的写入文件，元素和元素之间一定要换行。
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        String path = "/Users/mao/Documents/code/basic/exam/src/demo02/number.txt";
        int[] arr = new int[10];
        Random r = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        BufferedWriter bw = new BufferedWriter(new FileWriter(new File("number.txt")));
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100) + 1;
            if (arr[i] > 10) {
                list.add(arr[i]);
            } else {
                map.put(i, arr[i]);
            }
        }
        //判断map集合是否存在元素，如果没有元素则在控制台提示："数组中没有符合条件的元素存入map集合！"
        //如果有，则使用字符输出流将map集合中的元素（key值和value值之前用':'间隔）的写入文件，元素和元素之间一定要换行。
        if (map.isEmpty()) {
            System.out.println("数组中没有符合条件的元素存入map集合！");
        } else {
            Set<Integer> set = map.keySet();
            for (Integer integer : set) {
                bw.write(integer + ":" + map.get(integer));
                bw.newLine();
            }
        }
        bw.close();
    }
}
