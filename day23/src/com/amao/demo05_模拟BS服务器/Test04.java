package com.amao.demo05_模拟BS服务器;

import org.junit.Test;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *  @Author : ItAmao
 *  @Date   : 2020/7/2 19:42
 */
public class Test04 {
    @Test
    public void server() {
        try {
            //1.创建ServerSocket对象,并获取指定运行的端口号
            ServerSocket serverSocket = new ServerSocket(8090);
            /*
                循环获取,不写循环的话,只能获取一次,不方便
             */
            while (true) {
                //2.接收连接的客户端
                Socket socket = serverSocket.accept();
                //3.创建通道输入流,获取浏览器传来的消息
                InputStream inputStream = socket.getInputStream();
                //4.读取
                int len;
                byte[] bytes = new byte[1024];
                len = inputStream.read(bytes);
                //5.用字符串获取读到的消息
                String str = new String(bytes, 0, len);
                //System.out.println(str); 获取到的是网页上的信息
                /*
                   可以进行字符串分割,来逐步获取信息
                 */
                //6.分割出 127.0.0.1 后边的信息,也就是用户要访问的东西
                String s = str.split(" ")[1];
                //7.我们需要在这个一个目录下判断是否存在这个图片
                String path = "/Users/mao/Documents/code/basic/day23";
                File file = new File(path + s);
                if (file.exists()) {
                    //如果文件存在,我们需要把这个图片发送给浏览器
                    //创建通道输出流
                    OutputStream outputStream = socket.getOutputStream();
                    //创建字节输入流,来读取这个图片
                    FileInputStream fileInputStream = new FileInputStream(file);
                    //这是web访问响应的头消息，告诉你服务器成功响应了你的请求,返回信息为非缓存的文本/超文本格式
                    outputStream.write("HTTP/1.1 200 OK\r\nContent-Type:image/jpeg\r\n\r\n".getBytes());
                    //然后把读取到的图片显示到浏览器
                    while ((len = fileInputStream.read(bytes)) != -1) {
                        outputStream.write(bytes, 0, len);
                    }
                    //关流
                    fileInputStream.close();
                } else {
                    //资源不存在
                    //就向浏览器输出一个404
                    //获取通道字节输出流
                    OutputStream outputStream = socket.getOutputStream();
                    //老套路,告诉你服务器成功响应了你的请求
                    outputStream.write("HTTP/1.1 200 OK\r\nContent-Type:text/html;charset=UTF-8\r\n\r\n".getBytes());
                    //写
                    outputStream.write("你访问的东西不存在 404".getBytes());
                }
                //关流
                socket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
