package com.amao.demo04_文件上传案例;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 *  客户端向服务端发送一条消息
 *
 *  @Author : ItAmao
 *  @Date   : 2020/7/2 12:00
 */
public class Test02 {
    /**
     * 客户端
     */
    @Test
    public void client() throws IOException {
        //1.创建Socket对象
        Socket socket = new Socket("127.0.0.1", 8090);
        //2.准备消息
        String message = new Scanner(System.in).nextLine();
        //3.获取流
        OutputStream outputStream = socket.getOutputStream();
        //4.发送消息
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
        //2.接收客户端
        Socket socket = serverSocket.accept();
        //3.造流
        InputStream inputStream = socket.getInputStream();
        //4.读取文件
        byte[] bytes = new byte[1024];
        int len;
        while ((len = inputStream.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, len));
        }
        //5.关闭流
        inputStream.close();
        serverSocket.close();
        socket.close();
    }
}
