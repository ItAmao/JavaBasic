package com.amao.demo01_ByteBuffer;

import org.junit.Test;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.Arrays;

/**
 * ByteBuffer 缓冲区方法
 *
 *  @Author : ItAmao
 *  @Date   : 2020/7/3 09:03
 */
public class Test02 {
    /**
     * put方法
     */
    @Test
    public void method02() {
        //1.创建一个
        ByteBuffer byteBuffer = ByteBuffer.allocate(10);

        //2.调用put方法添加
        byteBuffer.put((byte) 100);
        byteBuffer.put((byte) 111);
        byteBuffer.put((byte) 120);

        //给5元素添加10
        byteBuffer.put(5, (byte) 10);
        //[100, 111, 120, 0, 0, 10, 0, 0, 0, 0]
        //java.nio.HeapByteBuffer[pos=3 lim=10 cap=10]
        System.out.println(byteBuffer);

        //把缓冲区变成基本的byte[]
        byte[] array = byteBuffer.array();
        System.out.println(Arrays.toString(array));
        //[100, 111, 120, 0, 0, 0, 0, 0, 0, 0]
    }

    /**
     *  capacity(容量) 是一个定值
     */
    @Test
    public void method03() {
        //1.创建对象
        ByteBuffer byteBuffer = ByteBuffer.allocate(10);

        //2.容量
        int capacity = byteBuffer.capacity();
        System.out.println(capacity);
    }

    /**
     * limit():限制
     */
    @Test
    public void method04() {
        //1.创建对象
        ByteBuffer byteBuffer = ByteBuffer.allocate(10);
        int limit1 = byteBuffer.limit();
        System.out.println(limit1);//10
        byteBuffer.limit(4);//限制从4索引开始不允许被操作的意思
        int limit = byteBuffer.limit();//获取当前一个限制
        System.out.println(limit);//4
    }

    /**
     * position 位置 位置代表将要存放元素的一个索引
     */
    @Test
    public void method05() {
        //1.创建对象
        ByteBuffer byteBuffer = ByteBuffer.allocate(20);
        int count = 0;
        //2.添加
        for (int i = 0; i < 10; i++) {
            count++;
            byteBuffer.position(count); //表示从第几个索引开始添加元素
            byteBuffer.put((byte) i);
            System.out.println(byteBuffer.position());
        }

        System.out.println(Arrays.toString(byteBuffer.array()));
    }

    /**
     *  mark() 标记:当调用缓冲区的reset()重置方法时,会将缓冲区
     */
    @Test
    public void method06() {
        //1.
        ByteBuffer byteBuffer = ByteBuffer.allocate(10);

        //2.添加
        byteBuffer.put((byte) 10);
        byteBuffer.put((byte) 20);
        byteBuffer.put((byte) 30);

        //3.打印
        System.out.println(Arrays.toString(byteBuffer.array()));

        //4.mark标记
        byteBuffer.mark();//标记了3索引
        byteBuffer.put((byte) 40);
        byteBuffer.put((byte) 50);
        //5.重置
        byteBuffer.reset();
        System.out.println(Arrays.toString(byteBuffer.array()));

    }

    /**
     *clear
     */
    @Test
    public void method07() {
        //1.创建对象
        ByteBuffer byteBuffer = ByteBuffer.allocate(10);
        //2.添加
        byteBuffer.put((byte) 10);
        byteBuffer.put((byte) 20);
        byteBuffer.put((byte) 30);
        //3.打印
        System.out.println(Arrays.toString(byteBuffer.array()));
        //4.mark标记
        byteBuffer.mark();
        byteBuffer.put((byte) 40);
        byteBuffer.put((byte) 50);
        //5.重置
        byteBuffer.reset();
        System.out.println(Arrays.toString(byteBuffer.array()));
        System.out.println(byteBuffer);//java.nio.HeapByteBuffer[pos=3 lim=10 cap=10]
        //position指针还原,元素还在
        System.out.println(byteBuffer.clear());//java.nio.HeapByteBuffer[pos=0 lim=10 cap=10]
    }

    /**
     * flip() 切换读写状态,在读写数据之间调用这个方法
     * 作用:锁定指向有内容的部分
     *
     * 步骤:
     *      1.将limit设置为position
     *      2.将position设置为最开始
     *      3.消除mark标记
     */
    @Test
    public void method08() {
        //1.创建对象
        ByteBuffer byteBuffer = ByteBuffer.allocate(10);
        //2.添加
        byteBuffer.put((byte) 10);
        byteBuffer.put((byte) 20);
        byteBuffer.put((byte) 30);
        Buffer mark = byteBuffer.mark();
        //System.out.println(mark);
        System.out.println(byteBuffer);//java.nio.HeapByteBuffer[pos=3 lim=10 cap=10]
    }
}
