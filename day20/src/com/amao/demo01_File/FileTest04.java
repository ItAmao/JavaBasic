package day20.src.com.amao.demo01_File;

import java.io.File;
import java.io.IOException;

/**
 * File类的创建删除文件
 *      public boolean createNewFile():当且仅当具有该名称的文件尚不存在时，创建一个新的空文件。
 *      public boolean mkdir() :    创建由此File表示的目录。(创建1级文件夹)
 *      public boolean mkdirs() :   创建由此File表示的目录，包括任何必需但不存在的父目录。(创建任意级文件夹)
 *      public boolean delete() :   删除由此File表示的文件或目录。(里边有东西的文件夹删不掉)
 *
 *
 *
 *  @Author : ItAmao
 *  @Date   : 2020/6/26 16:17
 */
public class FileTest04 {
    public static void main(String[] args) {
        File f1 = new File("/Users/mao/Documents/code/basic/day20/src/com/amao/demo01_File/4.txt");
        //1.创建由此File表示的目录。(创建1级文件夹)
        if (!f1.exists()) {
            try {
                f1.createNewFile();
                System.out.println("创建成功");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            f1.delete();
            System.out.println("删除成功");
        }
        //2.文件目录的创建
        File f2 = new File("/Users/mao/Documents/code/basic/day20/src/com/amao/demo01_File/2");
        File f3 = new File("/Users/mao/Documents/code/basic/day20/src/com/amao/demo01_File/4/3/2/1/test.txt");

        boolean mkdir = f2.mkdir();
        if (mkdir) {//创建单层文件夹
            System.out.println("创建成功");
        }

        System.out.println(f3.mkdirs());

    }
}
