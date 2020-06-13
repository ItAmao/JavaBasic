package com.amao.demo05_Comparator拓展;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> arr = new ArrayList<>();
        arr.add(new Student("阿毛", 20, 177.3));
        arr.add(new Student("小毛", 21, 178.4));
        arr.add(new Student("大毛", 22, 179.5));
        arr.add(new Student("毛毛", 23, 180.6));
        arr.add(new Student("帅毛", 24, 181.7));
        Collections.sort(arr, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //return o2.getAge() - o1.getAge();
                return (int) (o2.getHeight() - o1.getHeight());
            }
        });
        for (Student stu : arr) {
            System.out.println(stu);
        }
    }
}
