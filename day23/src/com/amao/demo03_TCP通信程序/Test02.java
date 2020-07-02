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
 *  @Date   : 2020/7/2 10:37
 */
public class Test02 {
    /**
     * 客户端从控制台输入,消息,服务端接收
     */
    @Test
    public void client() throws IOException {
        //1.创建Socket对象
        Socket socket = new Socket("192.168.11.29", 8888);
        while (true) {
            //2.准备字符串
            String str = new Scanner(System.in).nextLine();
            //3.获取输出流
            OutputStream outputStream = socket.getOutputStream();
            //4.发送数据
            outputStream.write(str.getBytes());

            //接收从服务端发来的数据
            InputStream inputStream = socket.getInputStream();
            //获取数据流
            byte[] bytes = new byte[1024];
            int len = inputStream.read(bytes);
            System.out.println("服务端对我说:" + new String(bytes, 0, len));
        }
//        //5.关闭资源
//        socket.close();
    }

    /**
     * 服务端
     */
    @Test
    public void server() throws IOException {
        //创建服务器对象
        ServerSocket serverSocket = new ServerSocket(8090);
        //连接客户端
        Socket socket = serverSocket.accept();
        while (true) {
            //获取数据流
            InputStream inputStream = socket.getInputStream();
            //接收数据
            byte[] bytes = new byte[1024];
            int len;
            len = inputStream.read(bytes);
            //打印
            System.out.println("客户端对我说:" + new String(bytes, 0, len));

            //给客户端发送内容
            //准备字符串
            String str = new Scanner(System.in).nextLine();
            //获取输出流
            OutputStream outputStream = socket.getOutputStream();
            outputStream.write(str.getBytes());
        }
    }
}
