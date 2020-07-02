package com.amao.demo03_TCP通信程序;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *  @Author : ItAmao
 *  @Date   : 2020/7/2 10:09
 */
public class Test01 {
    /**
     * 客户端发送数据
     * 客户端----> 输出流 -----> 输入流 ----> 服务端
     */
    @Test
    public void client() throws IOException {
        //1.创建一个对象 () 指定给谁发送数据,给哪个软件发数据
        Socket socket = new Socket("127.0.0.1", 8090);
        //2.准备一个数据
        String s = "你好,服务端,我是客户端";
        //3.发送数据之前 需要输出流 ,需要通过Socket对象来获取
        OutputStream outputStream = socket.getOutputStream();

        //发送数据方式一
//        //4.1 需要用转换流把字符换字节
//        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
//        //4.发送数据,
//        outputStreamWriter.write(s);

        //发送数据方式二
        outputStream.write(s.getBytes());
        //关闭资源
        socket.close();
    }

    /**
     * 服务端接收数据
     * 客户端----> 输出流 -----> 输入流 ----> 服务端
     */
    @Test
    public void server() throws IOException {
        //1,创建ServerSocket对象
        ServerSocket serverSocket = new ServerSocket(8090);
        //2.连接客户端
        Socket socket = serverSocket.accept();
        //3.接收数据,获取数据类型
        InputStream inputStream = socket.getInputStream();
        //4.读取
        byte[] bytes = new byte[1024];
        int len;
        while ((len = inputStream.read(bytes)) != -1) {
            String str = new String(bytes, 0, len);
            System.out.println(str);
        }
        //服务器一般不关闭资源,可以不关闭
    }
}
