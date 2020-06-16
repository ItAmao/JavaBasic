package com.amao.demo03_HashMap存储自定义类型的键;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        /*
            将学生对象和家庭住址存放map集合中,
            学生作为键,家庭作为值
         */
        HashMap<Student, String> hm = new HashMap<Student, String>();
        //2.添加键值对
        hm.put(new Student("阿毛", 18), "湖南常德");
        hm.put(new Student("2毛", 19), "湖南长沙");
        hm.put(new Student("3毛", 20), "湖南湘潭");
        hm.put(new Student("4毛", 21), "湖南株洲");
        hm.put(new Student("5毛", 22), "湖南郴州");
        hm.put(new Student("6毛", 23), "湖南邵阳");
        System.out.println(hm);
        hm.put(new Student("阿毛", 18), "湖南常德");
        System.out.println(hm);
    }
}
