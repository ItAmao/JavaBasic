package com.amao.homework;

import org.junit.Test;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 请编写客户端向服务器端上传的案例，要求上传完毕，
 * 服务器端要向客户端发送一条反馈信息，客户端收到反馈后打印到控制台，两端结束。
 *  @Author : ItAmao
 *  @Date   : 2020/7/2 18:21
 */
public class Demo04 {
    /**
     * 服务端
     */
    @Test
    public void server() throws IOException {
        //创建ServerSocket对象
        ServerSocket serverSocket = new ServerSocket(8090);
        //接收客户端
        Socket socket = serverSocket.accept();
        //创建通道输入流
        InputStream inputStream = socket.getInputStream();
        //创建字节输出流
        String path = "/Users/mao/Documents/code/basic/day23/4.jpg";
        File file = new File(path);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        //读取
        int len;
        byte[] bytes = new byte[1024];
        while ((len = inputStream.read(bytes)) != -1) {
            fileOutputStream.write(bytes, 0, len);
        }
        //创建通道输出流
        OutputStream outputStream = socket.getOutputStream();

        outputStream.write("消息以收到".getBytes());
        //关闭流
        outputStream.close();
        inputStream.close();
        socket.close();
        serverSocket.close();

    }


    /**
     *客服端
     */
    @Test
    public void client() throws IOException {
        //创建Socket对象,获取服务端的IP地址和端口号
        Socket socket = new Socket("127.0.0.1", 8090);
        //创建通道输出流
        OutputStream outputStream = socket.getOutputStream();
        //创建文件字节流
        String path = "/Users/mao/Documents/code/basic/day23/1.jpg";
        File file = new File(path);
        FileInputStream fileInputStream = new FileInputStream(file);
        //调用read方法
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = fileInputStream.read(bytes)) != -1) {
            outputStream.write(bytes, 0, len);
        }
        socket.shutdownOutput();
        //创建通道输入流,来接收服务端发送的消息
        InputStream inputStream = socket.getInputStream();
        len = inputStream.read(bytes);
        System.out.println("服务端说:" + new String(bytes, 0, len));

        //释放资源
        inputStream.close();
        fileInputStream.close();
        outputStream.close();
        socket.close();
    }
}
