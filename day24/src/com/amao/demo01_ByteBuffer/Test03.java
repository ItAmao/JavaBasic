package com.amao.demo01_ByteBuffer;

import org.junit.Test;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.Arrays;

/**
 *
 *  @Author : ItAmao
 *  @Date   : 2020/7/3 22:51
 */
public class Test03 {
    /**
     * ByteBuffer的三种添加数据方式
     */
    @Test
    public void byteBuffer01() {
        //1.创建一个ByteBuffer
        ByteBuffer byteBuffer = ByteBuffer.allocate(10);
        System.out.println(Arrays.toString(byteBuffer.array()));//[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

        //2.添加数据
        //1 添加一个字节
        byteBuffer.put((byte) 97);
        byteBuffer.put((byte) 98);
        byteBuffer.put((byte) 99);
        System.out.println(Arrays.toString(byteBuffer.array()));//[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

        //2.添加一堆字节
        byte[] bytes = {100, 101, 102};
        byteBuffer.put(bytes);
        System.out.println(Arrays.toString(byteBuffer.array()));//[97, 98, 99, 100, 101, 102, 0, 0, 0, 0]

        //3.添加一堆字节的一部分
        byte[] bytes1 = {103, 104, 105};
        byteBuffer.put(bytes1, 1, 2);
        System.out.println(Arrays.toString(byteBuffer.array()));//[97, 98, 99, 100, 101, 102, 104, 105, 0, 0]
    }

    /**
     * ByteBuffer的容量-capacity
     * public int capacity(); 获取缓冲区的容量
     */
    @Test
    public void byteBuffer02() {
        //1.创建一个ByteBuffer
        ByteBuffer byteBuffer = ByteBuffer.allocate(10);
        System.out.println(Arrays.toString(byteBuffer.array()));
        //2.容量
        int capacity = byteBuffer.capacity();
        System.out.println(capacity);//10
        //3.添加数据
        byteBuffer.put((byte) 10);
        byteBuffer.put((byte) 20);
        byteBuffer.put((byte) 30);
        //4.再次获取容量
        capacity = byteBuffer.capacity();
        System.out.println(Arrays.toString(byteBuffer.array()));
        System.out.println(capacity);//容量还是10
    }

    /**
     * limit
     * public void limit(int newLimit);//修改limit的值
     * 限制取值范围:  [0,capacity]
     */
    @Test
    public void byteBuffer03() {
        //1.创建ByteBuffer对象
        ByteBuffer b1 = ByteBuffer.allocate(10);
        System.out.println(Arrays.toString(b1.array()));//[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        //2.第一个不能读写的索引
        int limit = b1.limit();
        System.out.println(limit);//10
        //3.修改limit值
        Buffer limit1 = b1.limit(3);
        System.out.println(limit1);//java.nio.HeapByteBuffer[pos=0 lim=3 cap=10]
        //4.添加元素
        b1.put((byte) 10);
        b1.put((byte) 20);
        b1.put((byte) 30);
        b1.put((byte) 40);
        //BufferOverflowException 报错,因为limit为3 40不能添加进去
        System.out.println(Arrays.toString(b1.array()));
    }

    /**
     * position
     * public int position();//获取将要操作的元素索引
     * public void position(int newPosition);//修改将要操作的元素索引
     * position取值范围: [0,limit]
     */
    @Test
    public void byteBuffer04() {
        //1.创建ByteBuffer对象
        ByteBuffer byteBuffer = ByteBuffer.allocate(10);
        System.out.println(Arrays.toString(byteBuffer.array()));//[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        //2.获取需要操作的索引位置
        System.out.println("位置:" + byteBuffer.position());//位置:0
        byteBuffer.put((byte) 100);
        System.out.println("位置:" + byteBuffer.position());//位置:1

        //3修改需要操作的元素位置
        byteBuffer.position(4);
        byteBuffer.put((byte) 200);
        System.out.println(Arrays.toString(byteBuffer.array()));
        System.out.println("位置:" + byteBuffer.position());//位置:5
    }

    /**
     * mark标记
     * reset重置(是重置了position的位置)
     *  public void mark();//在当前的position做一个标记
     *  public void reset();//把当前的position改为mark位置
     */
    @Test
    public void byteBuffer05() {
        //1.创建ByteBuffer对象
        ByteBuffer b1 = ByteBuffer.allocate(10);
        Arrays.toString(b1.array());

        //2.添加元素
        b1.put((byte) 10);
        b1.put((byte) 20);
        b1.put((byte) 30);

        System.out.println("当前位置:" + b1.position());//当前位置:3


        //3.做个标记
        b1.mark();//记录了当前的mark等于3
        //4.继续添加
        b1.put((byte) 40);
        b1.put((byte) 50);
        b1.put((byte) 60);
        System.out.println(Arrays.toString(b1.array()));//[10, 20, 30, 40, 50, 60, 0, 0, 0, 0]
        System.out.println("当前位置:" + b1.position());//当前位置:6

        //5.重置
        b1.reset();//position=3
        System.out.println(Arrays.toString(b1.array()));//[10, 20, 30, 40, 50, 60, 0, 0, 0, 0]
        System.out.println(b1.position());//3
        //reset之后元素不会发生变化,但是position的位置会重置
        b1.put((byte) 70);
        b1.put((byte) 80);
        //插入的元素会覆盖之前的元素
        System.out.println(Arrays.toString(b1.array()));//[10, 20, 30, 70, 80, 60, 0, 0, 0, 0]

    }

    /**
     * ByteBuffer的其他方法
     * public Buffer clear();//还原缓冲区状态(清空)
     * 	将position设置为：0
     *     将限制limit设置为容量capacity；
     *     丢弃标记mark
     */
    @Test
    public void byteBuffer06() {
        //1.创建ByteBuffer对象
        ByteBuffer b1 = ByteBuffer.allocate(10);
        //2.添加元素
        b1.put((byte) 10);
        b1.put((byte) 20);
        b1.put((byte) 30);
        System.out.println("当前位置:" + b1.position());//3
        System.out.println(b1);//java.nio.HeapByteBuffer[pos=3 lim=10 cap=10]
        //3.还原缓冲区状态(清空)
        b1.clear();
        System.out.println(b1);//java.nio.HeapByteBuffer[pos=0 lim=10 cap=10]
        System.out.println(Arrays.toString(b1.array()));
        b1.put((byte) 40);
        b1.put((byte) 50);
        b1.put((byte) 60);
        System.out.println(Arrays.toString(b1.array()));//会覆盖之前的元素
    }

    /**
     * flip
     * public Buffer flip();//缩小缓冲区到有效位置(切换模式)
     * 	将limit设置为当前position位置；
     * 	将position设置为：0
     *     丢弃标记。
     */
    @Test
    public void byteBuffer07() {
        //1.创建ByteBuffer对象
        ByteBuffer b1 = ByteBuffer.allocate(10);
        //2.添加元素
        b1.put((byte) 10);
        b1.put((byte) 20);
        b1.put((byte) 30);

        System.out.println(b1);//java.nio.HeapByteBuffer[pos=3 lim=10 cap=10]
        b1.flip();
        System.out.println(b1);//java.nio.HeapByteBuffer[pos=0 lim=3 cap=10]
    }
}
