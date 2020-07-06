package com.amao.Ademo_KP;

/**
 *  @Author : ItAmao
 *  @Date   : 2020/7/3 08:23
 */
public class Test {
    /**
     *  NIO:    Buffer(缓冲区)     Channel(通道)    Selector(选择器)
     *      同步:有阻塞功能的方法需要接受返回值
     *      异步:有阻塞功能的方法不需要接受返回值,有回调函数或者事件
     *
     *      阻塞:就是需要一个结果,没有结果就一直等待,不往下执行
     *      非阻塞:不需要去得到一个结果,不停留,直接向下执行
     *
     *
     *
     *  Buffer缓冲区
     *      1.概述:
     *          本质上就是一个数组,只是我们对数组进一步进行封装,可以有更多的方法
     *          Buffer是一个对象,它对某种基本类型的数组进行了封装
     *
     *      2.Buffer的一般操作步骤
     *          a.写入数据到Buffer
     *          b.调用flip()方法,(切换读写方式)
     *          c.从Buffer中读取数据
     *          d.调用clear()方法(清空缓冲区)
     *
     *      2.分类:
     *          ByteBuffer     相当于byte[]
     *          CharBuffer
     *          DoubleBuffer
     *          FloatBuffer
     *          IntBuffer
     *          LongBuffer
     *          ShortBuffer
     *
     *      3.ByteBuffer的三种创建方式
     *          public static ByteBuffer allocatDirect(int size);//直接申请,向操作系统申请
     *          public static ByteBuffer allocat(int size);//间接申请,向JVM申请
     *          public static ByteBuffer wrap(byte[] bs);//间接申请
     *
     *          间接缓冲区和直接缓冲区的区别:
     *              从创建和销毁的效率来看: 间接缓冲区要高于直接缓冲区
     *              从操作缓冲区的效率来看: 间接缓冲区要低于直接缓冲区
     *
     *      4.方法
     *          public int capacity();//获取缓冲区的容量
     *          public int limit(); //获取第一个不能读写的索引
     *          public void limit(int newLimit);//修改limit的值
     *          public int position();//获取将要操作的元素索引
     *          public void position(int newPosition);//修改将要操作的元素索引
     *          position取值范围: [0,limit]
     *          public void mark();//在当前的position做一个标记
     *          public void reset();//把当前的position改为mark位置
     *          public Buffer clear();//还原缓冲区状态(清空)
     *              1将position设置为：0 2将限制limit设置为容量capacity； 3丢弃标记mark
     *
     *      5.作用:
     *          缓冲区就是在内存中预留指定大小的存储空间用来输入/输出(IO)的数据作临时存储,这部分预留空间的内存空间
     *          就叫做缓冲区
     *          NIO开始使用的Channel就是通过Buffer

     *--------------------------------------------------------------------------------------------------
     *  通道(双向流)
     *      1.概述
     *          它是一个可以读写数据的通道,相当于IO流,但是与IO流不同,通道不区分输入和输出,是双向的
     *
     *      2.分类
     *          FileChannel:从文件读取数据
     *          DatagramChannel:读取UDP网络协议数据
     *          SocketChannel:读写TCP网络协议数据
     *          ServerSocketChannel:可以监听TCP连接
     *
     *      3.FileChannel基本使用
     *          FileChannel的获取:
     * 	                    public FileChannel getChannel();
     *          FileChannel的成员方法:
     * 	                    public int read(ByteBuffer bb);
     * 	                    public void write(ByteBuffer bb);
     *
     *      4.MappedByteBuffer实现高效读写
     *          MappedByteBuffer是ByteBuffer的子类,能够把硬盘中的东西映射到内存中
     *
     *          RandomAccessFile: 代表文件的File类
     *              public RandomAccessFile(String filepath);
     *              public FileChannel getChannel();
     *              FileChannel: 有一个方法,可以获取映射缓冲区
     *              public MappedByteBuffer map(读写模式,起始索引,长度);
     *          MappedByteBuffer:映射缓冲区的方法
     *              public byte get(int index);
     * 	            public void put(int index,byte b);
     *
     *
     *--------------------------------------------------------------------------------------------------
     *  Selector选择器
     *      1.多路复用的概念
     *          多路复用值多个客户端
     *          Selector称为选择器,也可以叫多路复用,可以将多个通道注册到选择器上,选择器可以监听通道的连接事件
     *          选择器也叫多路复用,可以把多个服务器的端口绑定到一个选择器上,选择器可以同时监听过个端口,叫多路复用
     *
     *      2.Selector介绍
     *          Selector是一个选择器,可以用一个线程处理多个事件
     *
     *      3.Selector的创建API
     *          Selector selector=Selector.open() //创建一个新的选择器
     *
     *      4.Channel注册到Selector的API
     *          a.想要把通道注册到选择器上,该通道必须设置非阻塞状态
     *          b.将通道注册到选择器
     *              SelectionKey key=channel.register(selector对象,选择器要监听的事件); 将通道注册到选择器上
     *              其中选择器的鉴定事件有多种,我们这里选择SelectionKey.OP_ACCEPT(代表服务器接收客户端连接事件)
     *              返回SelectionKey就是当前被注册的通道的封装,通过调用channel方法获取到当前的被注册通道
     *
     *      5.Selector中的常用方法
     *          a.获取选择器已经注册的所有通道集合
     *              Set<SelectionKey> keys = selector对象.keys():
     *          b.获取选择器已经被客户端连接的所有通道集合
     *              Set<SelectionKey> selectedKeys = selector对象.selectedKeys():
     *          c.选择器的选择方法
     *              int count = selector.select();
     *              a.如果"当前所有的通道"都没有被连接,此方法会阻塞,直到至少有一个通道被连接,才能继续向下执行
     *              b.返回值代表"本次被连接"的通道的数量
     *
     *--------------------------------------------------------------------------------------------------
     *  AIO
     *      1.概述:
     *          什么是AIO?
     *              Asynchronous IO:称为异步非阻塞的io操作
     *          什么是异步非阻塞
     *              调用某个功能,不需要等待执行功能执行完毕
     *              程序可以继续向下执行,等功能执行完毕之后会自动"方法回调机制"通知我们
     *
     *      2.AIO的各种分类:
     *          AsynchronousFileChannel
     *          AsynchronousDatagramChannel
     *          AsynchronousSocketChannel
     *          AsynchronousServerSocketChannel
     *
     *      3.AIO 异步非阻塞连接的建立
     *      AIO叫异步的IO
     *          阻塞:     方法必须要有一个结果,如果没有结果就一直等待
     *          非阻塞:    方法不管有没有结果,都不去等待,程序直接往下执行
     *          同步:     有阻塞功能的方法有返回值
     *          异步:     有阻塞功能的方法不需要返回值,有回调函数
     *
     *
     *
     *
     *
     *
     *
     *
     */
    public static void main(String[] args) {

    }

}
