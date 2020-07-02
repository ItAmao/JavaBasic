package day20.src.com.amao.demo01_File;

import java.io.File;

/**
 *  File类的判断功能方法
 *      1.public boolean exists() :此File表示的文件或目录是否实际存在。
 *      2.public boolean isDirectory() :此File表示的是否为目录。
 *      3.public boolean isFile() :此File表示的是否为文件。
 *
 *
 *  @Author : ItAmao
 *  @Date   : 2020/6/26 09:55
 */
public class Test03 {
    public static void main(String[] args) {
        //1.创建File对象
        File f1 = new File("/Users/mao/Documents/code/basic/day20/src/com/amao/demo01_File/1.txt");
        //2.此File表示的文件或目录是否实际存在。
        System.out.println(f1.exists());//T
        //3.此File表示的是否为目录。
        System.out.println(f1.isDirectory());//F
        //4.此File表示的是否为文件
        System.out.println(f1.isFile());//T

    }
}
