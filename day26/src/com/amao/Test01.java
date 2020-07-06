package com.amao;

import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *  @Author : ItAmao
 *  @Date   : 2020/7/6 17:44
 */
public class Test01 {
    /**
     *
     */
    @Test
    public void test1() throws Exception {
        String path = "/Users/mao/Documents/code/basic/day26/src/com/amao/student.txt";
        Student stu1 = new Student();
        ArrayList<Student> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int num = 3;
        System.out.println(addStudent(arr, num, sc));
        System.out.println(sort(arr));
        write(arr, path);
    }

    /**
     *1).从控制台接收3名学员信息；每个学员信息封装到一个Student对象中，并将多个Student封装到ArrayList中；
     */
    public static ArrayList<Student> addStudent(ArrayList<Student> arr, int num, Scanner sc) {
        for (int i = 0; i < num; i++) {
            System.out.println("请输入姓名:");
            String name = sc.next();
            System.out.println("请输入性别:");
            String gender = sc.next();
            System.out.println("请输入年龄:");
            int age = sc.nextInt();
            arr.add(new Student(name, gender, age));
        }
        return arr;
    }

    /**
     * 2).对集合中的Student对象按：年龄降序排序
     */
    public static ArrayList<Student> sort(ArrayList<Student> arr) {
        Collections.sort(arr, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getAge() - o1.getAge();
            }
        });
        return arr;
    }

    /**
     *使用GBK编码，将集合中的Student信息写入到“项目目录/test1.txt”文件中
     */
    public static void write(ArrayList<Student> arr, String path) throws Exception {
        File file = new File(path);
        FileOutputStream fos = new FileOutputStream(file);
        OutputStreamWriter osw = new OutputStreamWriter(fos, "GBK");
        for (Student student : arr) {
            osw.write("学生姓名:" + student.getName() + ", 学生性别:" + student.getGender() + " 学生年龄:" + student.getAge());
        }
        osw.close();
    }
}
