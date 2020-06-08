package com.amao.demo05_ArrayList存储学生对象并遍历;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> arr = new ArrayList<>();

        arr.add(new Student("阿毛", 18));
        arr.add(new Student("阿毛", 19));
        arr.add(new Student("阿毛", 20));

        //遍历集合
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i).getName() + ": " + arr.get(i).getAge());
        }
    }
}
