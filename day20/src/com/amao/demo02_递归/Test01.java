package day20.src.com.amao.demo02_递归;

import java.io.File;
/**
 *  文件搜索案例(使用递归案例)
 *
 *  @Author : ItAmao
 *  @Date   : 2020/6/26 10:41
 */
public class Test01 {
    public static void main(String[] args) {
        File file = new File("/Users/mao/Documents/code/basic/day20/src/com/amao/demo01_File");
        //System.out.println(file.exists());
        printTxtFile(file);

    }

    /**
     * 打印指定目录下的所有.txt文件
     */
    public static void printTxtFile(File file) {
        //1.调用遍历目录的方法
        File[] files = file.listFiles();
        //2.循环
        for (File file1 : files) {
            //3.判断
            if (file1.isFile() && file1.getName().endsWith(".txt")) {
                System.out.println(file1.getName());
            } else if (file1.isDirectory()) {
                printTxtFile(file1);
            }
        }
    }
}
