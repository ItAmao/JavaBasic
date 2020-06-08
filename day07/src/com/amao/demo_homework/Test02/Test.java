package com.amao.demo_homework.Test02;
/*
    测试类
 */
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Teacher> arr = new ArrayList<>();
        arr.add(new Teacher("果果老师", "javase"));
        arr.add(new Teacher("张1老师", "javaee "));
        arr.add(new Teacher("张2老师", "php "));
        arr.add(new Teacher("张3老师", "python"));
        for (int i = 0; i < arr.size(); i++) {
            System.out.println("姓名: " + arr.get(i).getName() + ", 专业: " + arr.get(i).getSpecialty());
        }
    }
}
