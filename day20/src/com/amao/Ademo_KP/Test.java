package day20.src.com.amao.Ademo_KP;

/**
 *
 *
 *  @Author : ItAmao
 *  @Date   : 2020/6/26 08:59
 */
public class Test {
    /**
     *  File类
     *      java.io.File类:文件和文件目录路径的抽象表示形式,与平台无关
     *
     *      1.File类的作用
     *          可以用来表示磁盘上的某个文件或者某个文件夹
     *
     *      2.File类的构造
     *          public File(String pathname):通过将给定的路径名字符串转换为抽象路径名来创建新的File实例。
     *          public File(String parent, String child):从父路径名字符串和子路径名字符串创建新的File实例。
     *          public File(File parent, String child) :从父抽象路径名和子路径名字符串创建新的 File实例。
     *
     *      3.File类的常用方法
     *          public String getAbsolutePath() :返回此File的绝对路径名字符串。
     *          public String getPath():将此File转换为路径名字符串。
     *          public String getName() :返回由此File表示的文件或目录的名称。
     *          public long length() :返回由此File表示的文件的长度。 不能获取目录的长度。
     *              注意事项:length()，表示文件的长度。但是File对象表示目录，则返回值未指定。
     *
     *      File类的重命名功能
     *          public boolean renameTo(File dest):把文件重命名为指定的文件路径
     *
     *
     *      4.File类的判断功能方法
     *          public boolean exists() :此File表示的文件或目录是否实际存在。
     *          public boolean isDirectory() :此File表示的是否为目录。
     *          public boolean isFile() :此File表示的是否为文件。
     *
     *      5.File类的创建删除文件
     *         public boolean createNewFile():当且仅当具有该名称的文件尚不存在时，创建一个新的空文件。
     *         public boolean delete() :删除由此File表示的文件或目录。(里边有东西的文件夹删不掉)
     *         public boolean mkdir() :创建由此File表示的目录。(创建1级文件夹)
     *         public boolean mkdirs() :创建由此File表示的目录，包括任何必需但不存在的父目录。(创建任意级文件夹)
     *
     *      6.File类的目录的遍历
     *          public String[] list() :返回一个String数组，表示该File目录中的所有子文件或目录。
     *          public File[] listFiles() :返回一个File数组，表示该File目录中的所有的子文件或目录。
     *
     * ---------------------------------------------------------------------------------------------------
     *  递归
     *     1.什么是递归?
     *          在方法中调用方法自己
     *
     *---------------------------------------------------------------------------------------------------
     *  IO流
     *      1.什么是IO流
     *          流:         把数据比作流
     *          I:Input     输入流 从文件中读取字节。
     *          O:Output    输出流 写数据
     *          Java的输入和输出都是站在内存的角度而言的
     *          用于处理设备之间的数据传输
     *
     *      2.流的分类
     *          1.按照操作数据单位不同分为: 字节流(8 bit)(比如图片和视频) 字符流(16 bit)
     *          2.按照数据流的流向不同分为:输入流,输出流
     *          3.按流的角色的不同分为:节点流,处理流
     *
     *     3.流的体系机构
     *        抽象基类                    节点流(或文件流)               缓冲流(处理流的一种)
     *              InputStream         FileInputStream               BufferedInputStream
     *              OutputStream        FileOutputStream              BufferedOutputStream
     *              Reader              FileReader                    BufferedReader
     *              Writer              FileWriter                    BufferedWriter
     *
     *      FileWriter中关闭和刷新
     *          flush() 把当前缓冲流冲区中的内容刷新到文件中,刷新之后流依然可以使用
     *          close() 关闭流资源,关闭之前会先刷新缓冲区,关闭之后就不能使用了
     *
     *
     *
     *
     */
    public static void main(String[] args) {

    }
}
