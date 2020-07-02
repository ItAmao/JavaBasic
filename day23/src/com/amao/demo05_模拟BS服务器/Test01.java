package com.amao.demo05_模拟BS服务器;

import org.junit.Test;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *  @Author : ItAmao
 *  @Date   : 2020/7/2 14:32
 */
public class Test01 {
    @Test
    public void test() throws IOException {
        //创建对象
        ServerSocket serverSocket = new ServerSocket(8090);
        //获取连接
        Socket socket = serverSocket.accept();
        //获取输入流
        InputStream inputStream = socket.getInputStream();
        //获取
        byte[] bytes = new byte[1024];
        int len = inputStream.read(bytes);
        String str = new String(bytes, 0, len);
        //获取访问的资源
        String name = str.split(" ")[1];
        //System.out.println(name);
        // String[] s = str.split(" ");
//        for (String s1 : s) {
//            System.out.println(s1);
//        }
        //判断资源是否存在
        String path = "/Users/mao/Documents/code/basic/day23";
        //  /Users/mao/Documents/code/basic/day23/1.jpg
        File file = new File(path + name);
        //System.out.println(file);
        if (file.exists()) {
            //资源存在
            //读取出图片输出给浏览器
            //1.创建一个输入流
            FileInputStream fileInputStream = new FileInputStream(file);
            //2.获取一个输出流
            OutputStream outputStream = socket.getOutputStream();
            outputStream.write("HTTP/1.1 200 OK\r\nContent-Type:image/jpeg\r\n\r\n".getBytes());
            //3,读取
            while ((len = fileInputStream.read(bytes)) != -1) {
                outputStream.write(bytes, 0, len);
            }

            fileInputStream.close();
        } else {
            //资源不存在
            //提示404
            OutputStream outputStream = socket.getOutputStream();
            outputStream.write("HTTP/1.1 200 OK\r\nContent-Type:image/jpeg\r\n\r\n".getBytes());
            //提示
            outputStream.write("你访问的资源不存在".getBytes());
        }
        socket.close();
    }
}
