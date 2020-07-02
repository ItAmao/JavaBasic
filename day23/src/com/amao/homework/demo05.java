package com.amao.homework;

import org.junit.Test;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 	请编写模拟B/S服务器案例。
 *  @Author : ItAmao
 *  @Date   : 2020/7/2 19:00
 */
public class demo05 {

    @Test
    public void server() throws IOException {
        try {
            //1.创建ServerSocket对象,并指定运行的端口号
            ServerSocket serverSocket = new ServerSocket(8090);
            while (true) {
                //2.接收连接的浏览器
                Socket socket = serverSocket.accept();
                //3.创建通道输入流
                InputStream inputStream = socket.getInputStream();
                //4.获取
                int len;
                byte[] bytes = new byte[1024];
                len = inputStream.read(bytes);
                String str = new String(bytes, 0, len);
                //5.分割
                String s = str.split(" ")[1];
                //6.拼接
                String path = "/Users/mao/Documents/code/basic/day23";
                File file = new File(path + s);
                //7 判断是否存在
                if (file.exists()) {
                    //如果存在,则需要把图片读入,并输出到浏览器
                    FileInputStream fileInputStream = new FileInputStream(file);
                    //创建通道输出流
                    OutputStream outputStream = socket.getOutputStream();
                    //先告诉浏览器你是啥格式,
                    outputStream.write("HTTP/1.1 200 OK\r\nContent-Type:image/jpeg\r\n\r\n".getBytes());
                    while ((len = fileInputStream.read(bytes)) != -1) {
                        outputStream.write(bytes, 0, len);
                    }
                    //关闭流
                    fileInputStream.close();
                } else {
                    //如果文件不存在,则需要返回404
                    //创建通道字节输出流
                    OutputStream outputStream = socket.getOutputStream();
                    //先告诉浏览器你是啥格式
                    outputStream.write("HTTP/1.1 200 OK\r\nContent-Type:text/html;charset=UTF-8\r\n\r\n".getBytes());
                    outputStream.write("404".getBytes());
                }
                socket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
