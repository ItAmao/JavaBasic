package com.amao.demo04_SocketChannel;

import org.junit.Test;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

/**
 *
 * SocketChannel和ServerSocketChannel的实现通信
 *
 *  @Author : ItAmao
 *  @Date   : 2020/7/4 11:48
 */
public class Test05 {
    @Test
    public void server() throws IOException {
        //1.创建ServerSocketChannel对象,并绑定运行的端口号
        ServerSocketChannel ssc = ServerSocketChannel.open().bind(new InetSocketAddress(8888));
        System.out.println("服务器启动");
        //2.接收连接
        System.out.println("等待客户端---");
        SocketChannel sc = ssc.accept();
        System.out.println("客户端已连接---");

        //3.先读取客户端的消息
        ByteBuffer bb = ByteBuffer.allocate(1024);
        sc.read(bb);
        bb.flip();
        System.out.println("客户端说:" + new String(bb.array(), 0, bb.limit()));
        //4.给客户端发消息
        ByteBuffer bb1 = ByteBuffer.allocate(1024);
        bb1.put("你好,马云,我是阿毛,有事吗?".getBytes());
        //切换模式
        bb1.flip();
        sc.write(bb1);
        //5关闭流
        ssc.close();
        sc.close();
    }

    @Test
    public void client() throws IOException {
        //1.创建SocketChannel对象
        SocketChannel sc = SocketChannel.open();
        System.out.println("客户端创建...");
        //2.连接服务器
        System.out.println("开始连接...");
        sc.connect(new InetSocketAddress("127.0.0.1", 8888));
        System.out.println("连接成功...");

        //3.给客户端发送消息
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        buffer.put("你好,阿毛,我是马云".getBytes());
        //4.切换模式
        buffer.flip();
        sc.write(buffer);

        //5.读取
        ByteBuffer buffer1 = ByteBuffer.allocate(1024);
        sc.read(buffer1);
        buffer1.flip();
        System.out.println("服务器说:" + new String(buffer1.array(), 0, buffer1.limit()));
        //5.释放资源
        sc.close();

    }

}
