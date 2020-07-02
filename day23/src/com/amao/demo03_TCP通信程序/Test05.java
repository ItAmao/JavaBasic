package com.amao.demo03_TCP通信程序;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 简单的TCP通信实现(双向通信)【重点】
 *  @Author : ItAmao
 *  @Date   : 2020/7/2 16:14
 */
public class Test05 {
    /**
     * 服务端 --> 1.创建服务器对象ServerSocket,指定自己运行的端口
     *           2.接收连接过来的客户端 accept方法
     *           3.获取通道中的输入流
     *           4.调用输入流的read方法
     *           5.获取通道中的输出流
     *           6.调用输出流的writer方法
     *           7.关闭资源
     */
    @Test
    public void server() throws IOException {
        //1.创建服务器对象ServerSocket,指定自己的运行端口
        ServerSocket serverSocket = new ServerSocket(8090);
        System.out.println("服务器启动了...");
        //2.接收连接过来的客户端
        System.out.println("等待客户端连接...");
        Socket socket = serverSocket.accept();//accept方法具有阻塞功能
        System.out.println("客户端他来了,他的IP:" + socket.getInetAddress().getHostAddress());
        //3.获取通道中的输入流
        InputStream inputStream = socket.getInputStream();
        //4.调用read方法
        byte[] bytes = new byte[1024];
        int len = inputStream.read(bytes);
        System.out.println("客户端说:" + new String(bytes, 0, len));
        //5.获取通道中的输出流
        OutputStream outputStream = socket.getOutputStream();
        //6.调用输出流的writer方法
        outputStream.write("你好阿毛,我是马云,我知道你是阿毛".getBytes());
        //7.关闭资源
        outputStream.close();
        inputStream.close();
        socket.close();
        serverSocket.close();
        System.out.println("服务器关闭");
    }

    /**
     * 客户端-->1.创建Socket对象,指定IP和端口
     *         2.获取通道中的输出流
     *         3.调用输出流的writer方法
     *         4.获取通道中的输入流
     *         5.调用输入流的read方法
     *         6.释放资源
     */
    @Test
    public void client() throws IOException {
        //1.创建Socket对象,指定IP和端口
        System.out.println("正在连接服务器...");
        Socket socket = new Socket("127.0.0.1", 8090);
        System.out.println("服务器连接成功...");
        //2.获取通道中的输出流
        OutputStream outputStream = socket.getOutputStream();
        //3.调用输出流的writer方法
        outputStream.write("你好!马云,我是阿毛".getBytes());
        System.out.println("数据发送成功....");
        //4.获取通道中的输入流
        InputStream inputStream = socket.getInputStream();
        //5.调用输入流的read方法
        int len;
        byte[] bytes = new byte[1024];
        len = inputStream.read(bytes);
        System.out.println("马云说:" + new String(bytes, 0, len));
        //6.释放资源
        inputStream.close();
        outputStream.close();
        socket.close();
        System.out.println("客户端关闭了");
    }
}
