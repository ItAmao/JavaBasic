package com.amao.demo04_SocketChannel;

import org.junit.Test;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

/**
 *  ServerSocketChannel的创建(非阻塞方式)
 *      ServerSocketChannel类有一个成员方法:
 * 	    public void configureBlocking(boolean append);//设置通道为是否阻塞
 *
 *  程序直接往下走了
 *
 *  @Author : ItAmao
 *  @Date   : 2020/7/4 11:39
 */
public class Test04 {
    @Test
    public void server() throws IOException {
        //1.获取ServerSocketChannel对象
        ServerSocketChannel ssc = ServerSocketChannel.open().bind(new InetSocketAddress(8888));
        System.out.println("服务端启动成功");
        //2.设置非阻塞状态
        ssc.configureBlocking(false);
        //3.接收客户端
        System.out.println("接收客户端");
        SocketChannel sc = ssc.accept();
        System.out.println("客户端接收成功");

        System.out.println("后续代码");

    }

    @Test
    public void client() throws IOException {
        SocketChannel sc = SocketChannel.open();
        //2 连接服务器
        System.out.println("开始连接服务器");
        sc.connect(new InetSocketAddress("127.0.0.1", 8888));

        System.out.println("后续操作");

    }
}
