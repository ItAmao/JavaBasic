package day20.src.com.amao.demo01_File;

import java.io.File;

/**
 * File类的构造方法
 *  1.public File(String pathname) :通过将给定的路径名字符串转换为抽象路径名来创建新的 File实例。
 *  2.public File(String parent, String child):从父路径名字符串和子路径名字符串创建新的File实例。
 *  3.public File(File parent, String child) :从父抽象路径名和子路径名字符串创建新的File实例。
 *
 *  @Author : ItAmao
 *  @Date   : 2020/6/26 09:13
 */
public class Test01 {
    public static void main(String[] args) {

        //1.通过将给定的路径名字符串转换为抽象路径名来创建新的 File实例。
        File f1 = new File("/Users/mao/Documents/code/basic/day20/src/com/amao/demo01_File/1.txt");
        System.out.println(f1);//   /Users/mao/Documents/code/basic/day20/src/com/amao/demo01_File/1.txt

        //2.从父路径名字符串和子路径名字符串创建新的File实例。
        File f2 = new File("/Users/mao/Documents/code/basic/day20", "src/com/amao/demo01_File/1.txt");
        System.out.println(f2);//   /Users/mao/Documents/code/basic/day20/src/com/amao/demo01_File/1.txt

        //3.从父抽象路径名和子路径名字符串创建新的File实例。
        File parent = new File("/Users/mao/Documents/code/basic/day20/src/com/amao/demo01_File");
        File f3 = new File(parent, "1.txt");
        System.out.println(f3);//   /Users/mao/Documents/code/basic/day20/src/com/amao/demo01_File/1.txt


    }
}
