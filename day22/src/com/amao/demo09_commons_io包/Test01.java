package com.amao.demo09_commons_io包;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.junit.Test;

import java.io.*;

/**
 *  @Author : ItAmao
 *  @Date   : 2020/6/30 19:10
 */
public class Test01 {
    /**
     * 复制文件夹API
     */
    @Test
    public void testCommon02() throws IOException {
        String path1="/Users/mao/Documents/code/basic/day22/testCommon01";
        String path2="/Users/mao/Documents/code/basic/day22/testCommon03";
        //创建File对象
        File file1=new File(path1);
        File file2=new File(path2);
        FileUtils.copyDirectory(file1,file2);
    }

    /**
     *复制文件API
     */
    @Test
    public void testCommon01() {
        String path1 = "/Users/mao/Documents/code/basic/day22/src/com/amao/demo09_commons_io包/1.jpg";
        String path2 = "/Users/mao/Documents/code/basic/day22/src/com/amao/demo09_commons_io包/2.jpg";
        try {
            //创建File对象
            File file1 = new File(path1);
            File file2 = new File(path2);
            //2.造流
            FileInputStream fileInputStream = new FileInputStream(file1);
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            //使用工具类
            //复制2G以下的文件
            IOUtils.copy(fileInputStream, fileOutputStream);
            //复制2G以上的文件
            IOUtils.copyLarge(fileInputStream, fileOutputStream);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //工具包不需要关闭流
        }
    }
}
