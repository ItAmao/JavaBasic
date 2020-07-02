package com.amao.demo03_TCP通信程序;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 简单的TCP通信实现(单向通信)【重点】
 *
 *  @Author : ItAmao
 *  @Date   : 2020/7/2 16:03
 */
public class Test04 {
    /**
     * 服务端
     */
    @Test
    public void server() throws IOException {
        //1.创建ServerSocket对象,指定自己运行的端口
        ServerSocket serverSocket = new ServerSocket(8090);
        System.out.println("服务器启动了");
        //2.接收连接过来的客户端对象 accept方法
        System.out.println("等待客户端连接...");
        Socket socket = serverSocket.accept();
        System.out.println("客户端来了,他的ip地址是:" + socket.getInetAddress().getHostAddress());
        //3.获取通道中的输入流
        InputStream inputStream = socket.getInputStream();
        //4,调用输入流的read方法
        int len;
        byte[] bytes = new byte[1024];
        len = inputStream.read(bytes);
        System.out.println("客户端说: " + new String(bytes, 0, len));
        //5.释放资源
        inputStream.close();
        socket.close();
        serverSocket.close();
        System.out.println("服务器关闭了----");
    }

    /**
     * 客户端
     */
    @Test
    public void client() throws IOException {
        //1.创建Socket对象,指定要通信的ip和端口号
        System.out.println("正在连接服务器...");
        Socket socket = new Socket("127.0.0.1", 8090);
        System.out.println("服务器连接成功");
        //2.获取通道中的流 客户端是输出流
        OutputStream outputStream = socket.getOutputStream();
        //3.调用输出流的writer方法
        outputStream.write("你好,我是客户端".getBytes());
        System.out.println("数据发送成功");
        //4.释放资源
        outputStream.close();
        socket.close();
        System.out.println("客户端关闭了");
    }
}
