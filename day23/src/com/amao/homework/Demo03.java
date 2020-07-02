package com.amao.homework;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 1. 请定义TCP的客户端，向服务器端发送一条信息：你好，我是客户端小白。
 * 	2. 请定义TCP的服务器端，接收这条信息，并打印到控制台
 *  @Author : ItAmao
 *  @Date   : 2020/7/2 17:52
 */
public class Demo03 {
    /**
     * 服务端
     */
    @Test
    public void server() throws IOException {
        //1.创建ServerSocket对象,并指定运行的端口号
        ServerSocket serverSocket = new ServerSocket(8090);
        //2.接收连接的客户端
        Socket socket = serverSocket.accept();
        //3.创建通道输入流
        InputStream inputStream = socket.getInputStream();
        //4.调用输入流的read方法
        int len;
        byte[] bytes = new byte[1024];
        len = inputStream.read(bytes);
        System.out.println("客户端说:" + new String(bytes, 0, len));
        //5.关闭流
        inputStream.close();
        socket.close();
        serverSocket.close();
    }

    @Test
    public void client() throws IOException {
        //1.创建Socket对象,并指定要连接的Ip地址和端口号
        Socket socket = new Socket("127.0.0.1", 8090);
        //2.创建通道输出流
        OutputStream outputStream = socket.getOutputStream();
        //3.输出内容
        outputStream.write("你好,客户端小白,我是你爸爸".getBytes());
        //4.关闭流
        outputStream.close();
        socket.close();
    }
}
