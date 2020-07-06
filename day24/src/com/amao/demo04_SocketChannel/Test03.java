package com.amao.demo04_SocketChannel;

import org.junit.Test;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

/**
 *  SocketChannel和ServerSocketChannel的实现连接
 *  ServerSocketChannel的创建(阻塞方式)
 *
 *  @Author : ItAmao
 *  @Date   : 2020/7/4 11:34
 */
public class Test03 {
    /**
     * 服务端
     */
    @Test
    public void server() throws IOException {
        //1.获取ServerSocket对象
        ServerSocketChannel ssc = ServerSocketChannel.open().bind(new InetSocketAddress(8888));
        System.out.println("服务器启动了");
        System.out.println("等待客户端连接");
        SocketChannel sc = ssc.accept(); //阻塞
        System.out.println("客户端来了");

        System.out.println("后续代码");
    }

    /**
     * 客户端
     */
    @Test
    public void client() throws IOException {
        //1.获取Socket对象
        Socket socket = new Socket("127.0.0.1", 8888);

    }
}
