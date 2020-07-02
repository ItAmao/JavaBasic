package day20.src.com.amao.demo01_File;

import java.io.File;

/**
 *  File类使用
 *      1.File类的一个对象,代表一个文件或一个文件目录(俗称:文件夹)
 *      2.File类声明在java.io包下
 *
 *
 *
 *  @Author : ItAmao
 *  @Date   : 2020/6/26 15:17
 */
public class FileTest01 {
    public static void main(String[] args) {
        /*
            1.如何创建File实例


            2.
            相对路径:相较于某个路径下指明的路径
            绝对路径:包含盘符在内的文件或文件目录的路径



         */
        
        //构造器1
        //绝对路径
        File file1 = new File("/Users/mao/Documents/code/basic/day20/src/com/amao/demo01_File/1.txt");
        //相对路径
        File file2 = new File("day20/src/com/amao/demo01_File/1.txt");

        System.out.println(file1);
        System.out.println(file2);

        //构造器2
        File file3 = new File("/Users/mao/Documents/code/basic", "day20/src/com/amao/demo01_File");
        System.out.println(file3);

        //构造器3
        File file4 = new File(file3,"1.txt");
        System.out.println(file4);
    }
}
