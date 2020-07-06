package com.amao.demo04_SocketChannel;

import org.junit.Test;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

/**
 *  @Author : ItAmao
 *  @Date   : 2020/7/3 11:48
 */
public class Test02 {
    @Test
    public void client() throws IOException {
        //创建对象
        SocketChannel socketChannel = SocketChannel.open();
        //连接需要连接的IP和端口
        socketChannel.connect(new InetSocketAddress("192.168.11.29", 8888));
        //socketChannel.connect(new InetSocketAddress("192.168.11.84", 8888));
        //socketChannel.connect(new InetSocketAddress("127.0.0.1", 8090));
        //准备发送的数据
        String message = "你在干嘛呀?";
        //创建缓冲区
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        byteBuffer.put(message.getBytes());
        //调用切换的方法
        byteBuffer.flip();
        //获取输出流.
        socketChannel.write(byteBuffer);
        //关闭资源
        socketChannel.close();
    }

    @Test
    public void server() throws IOException, InterruptedException {
        //创建对象
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        //绑定端口号
        serverSocketChannel.bind(new InetSocketAddress(8090));
        //设置非阻塞,
        serverSocketChannel.configureBlocking(false);
        while (true) {
            //如果连接上了客户端,连接不上就是null
            //连接客户端
            System.out.println("等待客户端连接");
            SocketChannel socketChannel = serverSocketChannel.accept();
            if (socketChannel != null) {
                System.out.println("客户端来了");
                //创建缓冲区
                ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
                //读取
                int read = socketChannel.read(byteBuffer);
                //打印
                String s = new String(byteBuffer.array(), 0, read);
                System.out.println(s);
                socketChannel.close();
                //结束循环
                break;
            } else {
                //没有客户端访问
                System.out.println("搞学习中...");
                Thread.sleep(3000);
            }

        }
    }
}