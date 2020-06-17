package com.amao.homework.demo06;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        try{
            student.setAge(100);
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }
    }

}
