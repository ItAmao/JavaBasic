package demo01;

import org.junit.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *  @Author : ItAmao
 *  @Date   : 2020/7/7 19:41
 */
public class Test01 {
    @Test
    public void test1() throws IOException {
        String path = "/Users/mao/Documents/code/basic/exam/src/demo01/stu.txt";
        String path1 = "/Users/mao/Documents/code/basic/exam/src/demo01/stu1.txt";
        BufferedReader br = new BufferedReader(new FileReader(path));
        ArrayList<Student> list = new ArrayList<>();
        String line = null;
        while ((line = br.readLine()) != null) {
            String[] split = line.split("=");
            String s1 = split[0];
            int s2 = Integer.parseInt(split[1]);
            Student s = new Student(s1, s2);
            list.add(s);
        }
        br.close();
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getScore() - o1.getScore();
            }
        });
        System.out.println(list);
        BufferedWriter bw = new BufferedWriter(new FileWriter(path, true));
        bw.newLine();
        for (int i = 0; i < list.size(); i++) {
            bw.write(list.get(i).getName());
            bw.write("=");
            bw.write(list.get(i).getScore() + "");
            bw.newLine();
            bw.flush();
        }
        bw.close();
    }
}
