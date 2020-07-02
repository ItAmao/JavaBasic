package com.amao.Ademo_KP.demo03_java4;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * URL网络编程
 *  1.URL:统一资源定位符,对应着互联网的某一资源地址
 *  2.格式:
 *      http://localhost:8080/examples/a.jpg?username=Amao
 *       协议    主机名    端口号  资源地址       参数列表
 *
 *  @Author : ItAmao
 *  @Date   : 2020/7/1 16:27
 */
public class URLTest01 {
    public static void main(String[] args) throws MalformedURLException {

        URL url = new URL("http://localhost:8080/examples/a.jpg?username=Amao");
       /*
       public String getProtocol( ) 获取该URL的协议名
       public String getHost( ) 获取该URL的主机名
       public String getPort( ) 获取该URL的端口号
       public String getPath( ) 获取该URL的文件路径
       public String getFile( ) 获取该URL的文件名
       public String getQuery()获取该URL的查询名
        */
        //获取该URL的协议名
        System.out.println(url.getProtocol());//http
        //获取该URL的主机名
        System.out.println(url.getHost());//localhost
        //获取该URL的端口号
        System.out.println(url.getPort());//8080
        //获取该URL的文件路径
        System.out.println(url.getPath());///examples/a.jpg
        //获取该URL的文件名
        System.out.println(url.getFile());///examples/a.jpg?username=Amao
        //获取该URL的查询名
        System.out.println(url.getQuery());//username=Amao



    }
}
