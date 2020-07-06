package com.amao.demo03_MappedByteBuffer;

import org.junit.Test;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/**
 *  MappedByteBuffer:复制2g以下的操作
 *  @Author : ItAmao
 *  @Date   : 2020/7/3 10:47
 */
public class Test01 {
    @Test
    public void test01() throws IOException {
        String path1 = "/Users/mao/Documents/code/basic/day24/src/com/amao/demo03_MappedByteBuffer/1.jpg";
        String path2 = "/Users/mao/Documents/code/basic/day24/src/com/amao/demo03_MappedByteBuffer/2.jpg";
        //高效映射方式
        //输入
        RandomAccessFile randomAccessFile1 = new RandomAccessFile(path1, "r");
        //输出
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(path2, "rw");

        FileChannel channel1 = randomAccessFile1.getChannel();
        FileChannel channel2 = randomAccessFile2.getChannel();

        //获取文件大小
        long size = channel1.size();

        //映射(把硬盘的数据存到了内存的数组中)
        MappedByteBuffer buffer1 = channel1.map(FileChannel.MapMode.READ_ONLY, 0, size);
        MappedByteBuffer buffer2 = channel2.map(FileChannel.MapMode.READ_WRITE, 0, size);

        //循环
        for (int i = 0; i < size; i++) {
            //从第一个数组中获取值,放到第二个数组中
            byte b = buffer1.get();
            buffer2.put(b);
        }
        //关闭资源
        randomAccessFile1.close();
        randomAccessFile2.close();
    }
}
