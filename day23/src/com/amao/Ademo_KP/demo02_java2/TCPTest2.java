package com.amao.Ademo_KP.demo02_java2;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *  实现TCP的网络编程
 *      例题2:客户端发送文件给服务端,服务端将文件保存到本地
 *
 *  @Author : ItAmao
 *  @Date   : 2020/6/30 22:24
 */
public class TCPTest2 {
    /**
     * 客户端
     */
    @Test
    public void client() throws IOException {
        //1.创建Socket对象
        Socket socket = new Socket(InetAddress.getByName("127.0.0.1"), 9090);
        //2.传输数据,获取一个输出流,字节输出流
        OutputStream os = socket.getOutputStream();
        //3.先把文件读进来
        FileInputStream fis = new FileInputStream(new File("/Users/mao/Documents/code/basic/day23/1.jpg"));
        //4.具体的读写过程
        byte[] bytes = new byte[1024];
        int len;
        while ((len = fis.read(bytes)) != -1) {
            os.write(bytes, 0, len);
        }
        //5.资源的关闭
        fis.close();
        os.close();
        socket.close();

    }

    /**
     * 服务端
     */
    @Test
    public void server() throws IOException {
        //1.创建ServerSocket对象
        ServerSocket serverSocket = new ServerSocket(9090);
        //2,接收来自客户端的Socket
        Socket socket = serverSocket.accept();
        //3.读入
        InputStream inputStream = socket.getInputStream();
        //4.把读到的图片保存在本地中
        FileOutputStream fileOutputStream = new FileOutputStream(new File("/Users/mao/Documents/code/basic/day23/2.jpg"));

        //5.读写的过程
        byte[] bytes = new byte[1024];
        int len;
        while ((len = inputStream.read(bytes)) != -1) {
            fileOutputStream.write(bytes, 0, len);
        }
        //6.关闭流
        fileOutputStream.close();
        inputStream.close();
        socket.close();
        serverSocket.close();
    }
}
