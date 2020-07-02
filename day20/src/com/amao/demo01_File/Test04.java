package day20.src.com.amao.demo01_File;

import java.io.File;
import java.io.IOException;

/**
 *  File类的创建删除文件
 *      1.public boolean createNewFile():当且仅当具有该名称的文件尚不存在时，创建一个新的空文件。
 *      2.public boolean delete() :删除由此File表示的文件或目录。(里边有东西的文件夹删不掉)
 *      3.public boolean mkdir() :创建由此File表示的目录。(创建1级文件夹)
 *      4.public boolean mkdirs() :创建由此File表示的目录，包括任何必需但不存在的父目录。(创建任意级文件夹)
 *
 *  @Author : ItAmao
 *  @Date   : 2020/6/26 10:06
 */
public class Test04 {
    public static void main(String[] args) throws IOException {
        //1.当且仅当具有该名称的文件尚不存在时，创建一个新的空文件。
        File f1 = new File("/Users/mao/Documents/code/basic/day20/src/com/amao/demo01_File/2.txt");
        System.out.println(f1.createNewFile());

        //2.删除由此File表示的文件或目录(里边有东西的文件夹删不掉)
        File f2 = new File("/Users/mao/Documents/code/basic/day20/src/com/amao/demo01_File/2.txt");
        System.out.println(f2.delete());

        //3.创建由此File表示的目录   1
        File f3 = new File("/Users/mao/Documents/code/basic/day20/src/com/amao/demo01_File/1");
        System.out.println(f3.mkdir());

        //4.创建由此File表示的目录，包括任何必需但不存在的父目录。 3->2->1
        File f4 = new File("/Users/mao/Documents/code/basic/day20/src/com/amao/demo01_File/3/2/1");
        System.out.println(f4.mkdirs());


    }
}
