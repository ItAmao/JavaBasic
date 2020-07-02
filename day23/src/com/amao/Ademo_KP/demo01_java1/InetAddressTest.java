package com.amao.Ademo_KP.demo01_java1;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 一,网络编程中有两个主要的问题:
 *      如何准确地定位网络上一台或多台主机;定位主机上的特定的应用
 *      找到主机后如何可靠高效地进行数据传输
 *
 *  二.网络编程的两个要素
 *      1.对应的问题一:Ip和端口号
 *      2.对用的问题二:提供网络通信协议:TCP/IP参考模型(应用层,传输层,网络层,物理+数据链路层)
 *
 *  三.通信要素一:IP和端口号
 *      a.IP:唯一的表示Internet上的计算机(通信实体)
 *      b.在Java中使用InetAddress类代表IP
 *      c.IP的分类:IPv4和IPv6; 万维网和局域网
 *      d.域名:www.baidu.com
 *      e.本地回路地址 127.0.0.1 对应着localhost
 *
 *
 * 如何是实例化InetAddress:两个方法:getByName(String host)  getLocalHost();
 * 2个常用方法:getHostName() / getHostAddress();
 *
 *  端口号: 正在计算机上运行的进程
 *  要求:不同的进程有不同的端口号
 *  范围:在规定为一个16位的整数 0-65535
 *
 *  端口号和IP地址组合得出一个网络套接字:Socket
 *
 *
 *  @Author : ItAmao
 *  @Date   : 2020/6/30 20:46
 */
public class InetAddressTest {
    public static void main(String[] args) {
        try {
            //类似于File file =new File()文件地址
            InetAddress byName = InetAddress.getByName("192.168.10.14");
            System.out.println(byName);//   /192.168.10.14

//            InetAddress byName1 = InetAddress.getByName("www.baidu.com");
//            System.out.println(byName1);
            InetAddress byName1 = InetAddress.getByName("127.0.0.1");
            System.out.println(byName1);//  /127.0.0.1
            //获取本机的ip
            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println(localHost);//    amaodediannao.local/127.0.0.1

            System.out.println(byName1.getHostName());//localhost
            System.out.println(localHost.getHostAddress());//127.0.0.1


        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
