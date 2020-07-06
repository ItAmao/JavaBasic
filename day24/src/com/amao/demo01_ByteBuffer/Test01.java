package com.amao.demo01_ByteBuffer;

import org.junit.Test;

import java.nio.ByteBuffer;

/**
 *  @Author : ItAmao
 *  @Date   : 2020/7/3 08:58
 */
public class Test01 {
    /**
     * ByteBuffer 缓冲区  数组
     */
    @Test
    public void method01() {
        //1.创建对象 在堆中创建缓冲区,创建一个长度为10的一个数组
        ByteBuffer byteBuffer = ByteBuffer.allocate(10);
        System.out.println(byteBuffer);
        //java.nio.HeapByteBuffer[pos=0 lim=10 cap=10]

        //2.在系统内存中创建对象
        ByteBuffer byteBuffer1 = ByteBuffer.allocateDirect(10);
        System.out.println(byteBuffer1);
        //java.nio.DirectByteBuffer[pos=0 lim=10 cap=10]

        //3.通过数组创建缓冲区
        byte[] bytes = new byte[10];
        ByteBuffer wrap = ByteBuffer.wrap(bytes);
        System.out.println(wrap);
        //java.nio.HeapByteBuffer[pos=0 lim=10 cap=10]
    }
}
