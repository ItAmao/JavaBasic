package com.amao.demo04_文件上传案例;

import org.junit.Test;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *  循环发送数据的问题
 *
 *
 *
 *  @Author : ItAmao
 *  @Date   : 2020/7/2 11:21
 */
public class Test01 {
    /**
     *  客户端发送文件给服务端
     *  硬盘--->输入流FileInputStream---->内存---->输出流 getOutputStream
     *  ----->输入流getInputSream ---->内存 ----->输出流FileOutputStream ----->硬盘
     */
    @Test
    public void client() throws IOException {
        //1.创建文件对象
        String path = "/Users/mao/Documents/code/basic/day23/src/com/amao/demo04_文件上传案例/1.jpg";
        File file = new File(path);
        //2.创建Socket对象
        //Socket socket = new Socket("192.168.11.29", 8888);
        Socket socket = new Socket("192.168.11.84", 8888);
        //3.造流
        //3.1第一个流
        FileInputStream fileInputStream = new FileInputStream(file);
        //3.2获取输出流
        OutputStream outputStream = socket.getOutputStream();

//        //4.读取文件
//        byte[] bytes = new byte[1024];
//        int len;
//        while ((len = fileInputStream.read(bytes)) != -1) {
//            outputStream.write(bytes, 0, len);
//        }
        //4.读取文件
        int len;
        while ((len = fileInputStream.read()) != -1) {
            outputStream.write(len);
        }
        //循环发送数据的问题
        //调用方法告诉服务器发送结束
        socket.shutdownOutput();

        //接收服务端的结果
        //获取输入流
        InputStream inputStream = socket.getInputStream();
        //接收数据
        byte[] bytes = new byte[1024];
        int read = inputStream.read(bytes);
        System.out.println(new String(bytes, 0, len));

        //5.关闭流
        fileInputStream.close();
        socket.close();
    }

    /**
     * 服务端
     */
    @Test
    public void server() throws IOException {
        //1.创建对象
        ServerSocket serverSocket = new ServerSocket(8090);
        //2.连接客户端
        Socket socket = serverSocket.accept();
        //3.获取流
        //3.1
        InputStream inputStream = socket.getInputStream();
        //3.2
        String path = "/Users/mao/Documents/code/basic/day23/src/com/amao/demo04_文件上传案例/2.jpg";
        // String path1 = "/Users/mao/Documents/code/basic/day23/src/com/amao/demo04_文件上传案例/2.jpg";
        File file = new File(path);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        //循环读写
        int len;
        while ((len = inputStream.read()) != -1) {
            fileOutputStream.write(len);
        }
        //服务端接收完之后给客户端发送:上传成功
        //获取输出流
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("上传成功".getBytes());
        //关闭流
        fileOutputStream.close();
        socket.close();
    }

}
