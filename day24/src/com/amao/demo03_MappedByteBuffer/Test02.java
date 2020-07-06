package com.amao.demo03_MappedByteBuffer;

import org.junit.Test;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/**
 * 2g以上的
 *  @Author : ItAmao
 *  @Date   : 2020/7/3 11:06
 */
public class Test02 {
    @Test
    public void test01() throws IOException {
        String path1 = "/Users/mao/Documents/code/basic/day24/src/com/amao/demo03_MappedByteBuffer/1.jpg";
        String path2 = "/Users/mao/Documents/code/basic/day24/src/com/amao/demo03_MappedByteBuffer/" + System.currentTimeMillis() + ".jpg";
        RandomAccessFile randomAccessFile1 = new RandomAccessFile(path1, "r");
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(path2, "rw");

        FileChannel channel1 = randomAccessFile1.getChannel();
        FileChannel channel2 = randomAccessFile2.getChannel();

        //文件
        long size = channel1.size();
        //每次预期大小
        long everySize = 500 * 1024 * 1024;
        //快数
        long count = size % everySize == 0 ? size / everySize : size / everySize + 1;
        //循环
        for (long i = 0; i < count; i++) {
            //每次开始位置
            long start = i * everySize;
            //每次实际大小
            long actualSize = size - start < everySize ? size - start : everySize;

            //映射
            MappedByteBuffer map1 = channel1.map(FileChannel.MapMode.READ_ONLY, start, actualSize);
            MappedByteBuffer map2 = channel2.map(FileChannel.MapMode.READ_WRITE, start, actualSize);
            //循环从第一个数组取出,放入第二个数组
            for (long l = 0; l < actualSize; l++) {
                byte b = map1.get();
                map2.put(b);
            }
        }
        randomAccessFile1.close();
        randomAccessFile2.close();
    }
}
