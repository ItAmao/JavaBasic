package day20.src.com.amao.demo03_IO流;

import java.io.*;

/**
 *  其他流的使用
 *      1.标准的输入,输出流
 *      2.打印流
 *      3.数据流
 *
 *  @Author : ItAmao
 *  @Date   : 2020/6/27 18:18
 */
public class OtherStream {
    public static void main(String[] args) throws IOException {
        /*
            标准的输入,输出流
            1.1
                System.in : 标准的输入流,默认从键盘输入
                System.out: 标准的输出流,默认从控制台输出
            1.2
                System.setIn(InputStream in) /setOut(PrintStream out) 方式重新制定输入和输出的流

            1.3练习:
                从键盘输入字符串,要求将读取到的整行字符串转成大写输出,然后继续进行输入操作
                直至当输入"e"或者"exit"时,退出程序
                    方法一:使用Scanner实现
                    方法二:使用System.in实现

         */
//        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
//        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
//        while (true) {
//            System.out.println("请输入字符串:");
//            String data = bufferedReader.readLine();
//            if ("e".equalsIgnoreCase(data) || "exit".equalsIgnoreCase(data)) {
//                System.out.println("程序结束");
//                break;
//            }
//            String s = data.toUpperCase();
//            System.out.println(s);
//        }
//        ------------------------------------------------------------------------------------

        /*
            打印流 printStream和printWriter
                提供了一系列重载的print() 和 println()

         */
//        String path = "/Users/mao/Documents/code/basic/day20/src/com/amao/demo03_IO流/1.txt";
//        FileOutputStream fileOutputStream = new FileOutputStream(new File(path));
//        //创建打印输出流,设置为自动刷新模式(写入换行符或字节'\n'时,会刷新输出缓冲区)
//        PrintStream printStream = new PrintStream(fileOutputStream, true);
//        if (printStream != null) {
//            System.setOut(printStream);
//        }
//        for (int i = 0; i <= 255; i++) {
//            System.out.println((char) i);
//            if (i % 50 == 0) {
//                System.out.println("");//换行
//            }
//        }
//        printStream.close();
//        ------------------------------------------------------------------------------------

        /*
            数据流
                1.DataInputStream和DataOutputStream
                2.作用:用于读取或写出基本数据类型的变量或字符串
                   先写后读

            将内存中的字符串,基本数据类型的变量写出到文件中
         */
        String path = "/Users/mao/Documents/code/basic/day20/src/com/amao/demo03_IO流/6.txt";
//        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(path));
//
//        dataOutputStream.writeUTF("阿毛");
//        dataOutputStream.flush();
//        dataOutputStream.write(23);
//        dataOutputStream.flush();
//        dataOutputStream.writeBoolean(true);
//        dataOutputStream.flush();
//        dataOutputStream.close();
        //1.
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(path));
        //2.
        String s = dataInputStream.readUTF();
        int age = dataInputStream.readInt();
        boolean b = dataInputStream.readBoolean();
        System.out.println(s);
        System.out.println(age);
        System.out.println(b);
        dataInputStream.close();
    }
}
