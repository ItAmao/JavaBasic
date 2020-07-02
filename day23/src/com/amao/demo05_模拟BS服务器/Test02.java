package com.amao.demo05_模拟BS服务器;

import org.junit.Test;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *  @Author : ItAmao
 *  @Date   : 2020/7/2 15:16
 */
public class Test02 {
    @Test
    public void server() throws IOException {
        try {
            //1.创建ServerSocket对象
            ServerSocket serverSocket = new ServerSocket(8090);
            while (true) {
                //2.接收连接的网页客户端
                Socket socket = serverSocket.accept();
                //睡眠5秒
                Thread.sleep(5);
                //获取通道输入流
                InputStream inputStream = socket.getInputStream();
                byte[] bytes = new byte[1024];
                //读取
                int len = inputStream.read(bytes);
                String str = new String(bytes, 0, len);
                //System.out.println(str);
                String name = str.split(" ")[1];
                //判断有没有这个文件
                String path = "/Users/mao/Documents/code/basic/day23";
                File file = new File(path + name);
                if (file.exists()) {
                    //资源存在,就把图片读进来然后通过通道输出流发给浏览器
                    FileInputStream fileInputStream = new FileInputStream(file);
                    OutputStream outputStream = socket.getOutputStream();
                    //需要告诉浏览器,格式是啥,
                    outputStream.write("HTTP/1.1 200 OK\r\nContent-Type:image/jpeg\r\n\r\n".getBytes());
                    //读取图片给浏览器
                    while ((len = fileInputStream.read(bytes)) != -1) {
                        outputStream.write(bytes, 0, len);
                    }
                    //关流
                    fileInputStream.close();
                } else {
                    //资源不存在,需要报404错误
                    OutputStream outputStream = socket.getOutputStream();
                    outputStream.write("HTTP/1.1 200 OK\r\nContent-Type:image/jpeg\r\n\r\n".getBytes());
                    outputStream.write("404".getBytes());
                }
                socket.close();//关闭资源
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
