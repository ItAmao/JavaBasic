package com.amao.Ademo_KP.demo02_java2;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *  例子1:客户端发送信息给服务端,服务端收到的信息显示在控制台上
 *
 *  @Author : ItAmao
 *  @Date   : 2020/6/30 21:57
 */
public class TCPTest1 {
    //客户端
    @Test
    public void client() {
        Socket socket = null;
        OutputStream os = null;
        try {
            InetAddress inet = InetAddress.getByName("127.0.0.1");
            //1.创建Socket对象,指明服务器端的IP和端口号
            socket = new Socket(inet, 8899);
            //2.传输数据 ,获取一个输出流,字节输出流
            os = socket.getOutputStream();
            //3.写出数据
            os.write("你好,我是客户端".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.资源关闭
            if (os != null) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //服务端
    @Test
    public void server() {
        Socket accept = null;
        InputStream inputStream = null;
        ByteArrayOutputStream byteArrayOutputStream = null;
        ServerSocket serverSocket = null;
        try {
            //1.创建服务器端的Socket ServerSocket对象
            serverSocket = new ServerSocket(8899);
            //2.调用accept方法,表示接收来自客户端的socket
            accept = serverSocket.accept();
            //3.获取输入流
            inputStream = accept.getInputStream();
            //不建议使用,因为传输信息有中文
//        byte[] bytes = new byte[1024];
//        int len;
//        while ((len = inputStream.read(bytes)) != -1) {
//            String str = new String(bytes, 0, len);
//            System.out.print(str);
//        }
            //4.读取输入流当中的数据
            byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bytes = new byte[5];
            int len;
            while ((len = inputStream.read(bytes)) != -1) {
                byteArrayOutputStream.write(bytes, 0, len);
            }
            System.out.println(byteArrayOutputStream.toString());
            System.out.println("收到了来自于:" + accept.getInetAddress().getHostAddress() + "的数据");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //5.关闭资源
            if (byteArrayOutputStream != null) {
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (serverSocket != null) {
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (accept != null) {
                try {
                    accept.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }


        }
    }
}
