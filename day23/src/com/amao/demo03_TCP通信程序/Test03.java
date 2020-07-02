package com.amao.demo03_TCP通信程序;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 *  @Author : ItAmao
 *  @Date   : 2020/7/2 11:01
 */
public class Test03 {
    //阻塞:收不到信息是不会往下运行的
    /**
     * 客户端发送消息,接收到服务端的确认
     * 客户端 ----> 输出流 -------> 输入流------> 服务端
     */
    @Test
    public void client() throws IOException {
        //1.创建Socket对象
        Socket socket = new Socket("127.0.0.1", 8090);
        //2.准备信息
        String message = new Scanner(System.in).nextLine();
        //3.获取输出流
        OutputStream outputStream = socket.getOutputStream();
        //4.发送数据
        outputStream.write(message.getBytes());
        //5.关闭流
        socket.close();
    }

    /**
     * 服务端
     */
    @Test
    public void server() throws IOException {
        //1.创建ServerSocket对象
        ServerSocket serverSocket = new ServerSocket(8090);
        //2.获取客户端
        Socket socket = serverSocket.accept();
        //3.获取输入流
        InputStream inputStream = socket.getInputStream();
        //4.读取流
        byte[] bytes = new byte[1024];
        int len;
        len = inputStream.read(bytes);
        System.out.println("客户端对我说"+new String(bytes,0,len));

    }
}
