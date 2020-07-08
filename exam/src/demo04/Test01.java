package demo04;

import org.junit.Test;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

/**
 *  1.在项目根目录下创建Student.txt文件,文件内容如下,学生姓名和年龄是以”键值对”形式存在的.
 2.利用所学的Properties类的相关知识,将文件内容读取到项目中,判断”键值对”中是否有刘方的数据,如果有,将其对应的年龄改为18.
 3.利用Properties类的相关知识把修改后的最新数据写入到newstu.txt文件中.
 *  @Author : ItAmao
 *  @Date   : 2020/7/7 20:41
 */
public class Test01 {
    @Test
    public void test1() throws Exception {
        String path1 = "/Users/mao/Documents/code/basic/exam/src/demo04/stu.txt";
        String path2 = "/Users/mao/Documents/code/basic/exam/src/demo04/newstu.txt";
        Properties properties = new Properties();
        properties.load(new FileReader(path1));
        Set<String> strings = properties.stringPropertyNames();
        Iterator<String> it = strings.iterator();
        while (it.hasNext()) {
            String name = it.next();
            if (name.equals("刘方")) {
                properties.setProperty(name, "18");
            }
        }
        properties.store(new FileWriter(path2),"");
    }
}
